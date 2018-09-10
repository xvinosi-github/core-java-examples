package org.vinod.corejava.overloading;

import java.util.List;

import org.vinod.corejava.accessmodifiers.AccessModifierBase;
import org.vinod.corejava.accessmodifiers.AccessModifierSubSamePackage;

public class MethodOverloading {
	// Order of public and static is not important.
	// Name of arguments is also not important
	static public void main(String[] arguments) {
		MethodOverloading m = new MethodOverloading();
		AccessModifierBase modiferList = new AccessModifierSubSamePackage();
		m.method2(modiferList);
	}

	// Even main method can be overloaded, but only above method matches the call of
	// JVM needed main method
	static public void main(String[] arguments, boolean value) {

	}

	public AccessModifierBase method(int x, int y) {
		return new AccessModifierBase();
	}

	// Overloading, JVM does not consider return type. NUmber of arguments
	public String method(int x) {
		return "value";
	}

	// Different arguments
	public String method(int x, float y) {
		return "value";
	}

	// sequence of arguments
	public String method(float x, int y) {
		return "value";
	}

	// sequence of arguments
	public String method(float x, int y, int... z) {
		return "value";
	}

	public void method2(AccessModifierBase modiferList) {
		System.out.println("In My class base");
	}

	public void method2(Object modiferList) {
		System.out.println("In Object class base");
	}
}
