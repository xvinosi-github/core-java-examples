package org.vinod.corejava.accessmodifiers1;

import org.vinod.corejava.accessmodifiers.AccessModifierBase;

public class AccessModifierDiffPackageNonChildClass {

	// varargs notation for main method
	public static void main(String... args) {
		AccessModifierBase base = new AccessModifierBase();

		// public
		base.publicMethodBase();
		// protected - not accessible since in different package
//base.protectedMethodBase();
		// default - not accessible since in different package
//base.defaultMethodBase();
	}
}
