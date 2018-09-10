package org.vinod.corejava.overriding;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.vinod.corejava.accessmodifiers.AccessModifierSubSamePackage;

public class Sub extends Base {
	public void display(String s) {
		System.out.println("Sub display" + s);
	}

	// Not valid, broder exception
//	public void display(Integer s) throws Exception{
	public void display(Integer s) throws IOException {
		System.out.println("Base display Exception" + s);
	}

//Not valid, overriden return type should be sub type or same of return type in base class
//	public AccessModifierBase display() throws IOException {
	public AccessModifierSubSamePackage display() throws IOException {
		ArrayList<String> s = new ArrayList<String>();
		return new AccessModifierSubSamePackage();
	}
}
