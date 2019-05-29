package com.ocajp.inheritence;


	class TYPE1 {
	//	private String name;//visibility of name should be protected or public
		String address;
		protected String phoneNumber;
		public float experience;
	}
	class TYPE2 extends TYPE1 {
		TYPE2 (String val) {
	//		name = val;
		}
		String getName() {
	//	return name;
			return "";
		}
	}
	public class AccessModifierTestInInheritence {
		public static void main(String args[]) {
		new TYPE2 ("Harry").getName();
		}
	}