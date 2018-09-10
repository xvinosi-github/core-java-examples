package org.vinod.corejava.accessmodifiers;

public class AccessModifierSubSamePackage extends AccessModifierBase {

	//varargs notation for main method
	public static void main(String... args) {
		AccessModifierSubSamePackage sub = new AccessModifierSubSamePackage();
		sub.checkAccessModifiers();
	}

	private void checkAccessModifiers() {
		//Private not accessible
		super.defaultMethodBase();
		super.protectedMethodBase();
		super.publicMethodBase();
	}
}
