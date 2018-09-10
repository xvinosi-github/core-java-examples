package org.vinod.corejava.accessmodifiers;

public class AccessModifierSamePackageNonChildClass {

	// varargs notation for main method
	public static void main(String... args) {
		AccessModifierBase base = new AccessModifierBase();
		
		//public
		base.publicMethodBase();
		//protected
		base.protectedMethodBase();
		//deffault - accessible since in same package
		base.defaultMethodBase();
	}
}
