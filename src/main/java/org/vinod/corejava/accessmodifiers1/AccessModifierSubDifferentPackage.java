package org.vinod.corejava.accessmodifiers1;

import org.vinod.corejava.accessmodifiers.AccessModifierBase;

public class AccessModifierSubDifferentPackage extends AccessModifierBase {

	// varargs notation for main method
	public static void main(String... args) {
		AccessModifierSubDifferentPackage sub = new AccessModifierSubDifferentPackage();
		sub.checkAccessModifiers();
	}

	private void checkAccessModifiers() {
		// Private not accessible
		// Default also not accessible since in different package.
//		super.defaultMethodBase();
		super.protectedMethodBase();
		super.publicMethodBase();
	}
}
