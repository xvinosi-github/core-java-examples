package org.vinod.corejava.overriding;

import java.io.IOException;

import org.vinod.corejava.accessmodifiers.AccessModifierBase;
import org.vinod.corejava.accessmodifiers.AccessModifierSubSamePackage;

public class Base {

	public void display(String s) {
		System.out.println("Base display" + s);
	}

	public void display(Integer s) throws IOException {
		System.out.println("Base display Exception" + s);
	}

	public AccessModifierSubSamePackage display() throws IOException {
		return new AccessModifierSubSamePackage();
	}
}
