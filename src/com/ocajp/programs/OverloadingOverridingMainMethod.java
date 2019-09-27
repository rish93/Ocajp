package com.ocajp.programs;

public class OverloadingOverridingMainMethod {
		
		  //--------------OVERLOADING------------------------------------
		  public static void main(String [] args) {
					System.out.println("main string []");
			}
			//object array integer array string builder array all will give no compilation error 
			//but will not let to run even in eclipse 
		  //hence main method can be overloaded but cant be run
		
		   public static void main(Object [] args) {
				
				System.out.println("main object []");
				
			}
		   
		   public static void main1(Object [] args,Integer i) {
				System.out.println("main object []");
			}
		   
		   public void main(Object [] args,Integer i) {
				System.out.println("main object []");
			}
		  //--------------OVERLOADING------------------------------------
}

	class child extends OverloadingOverridingMainMethod{
	
		@Override
		 public  void main(Object [] args,Integer i) {
			System.out.println("main object []");
		}
		
		//cant override static method hence cant override main static method
		//The method main1(Object[], Integer) of type child must override or implement a supertype method
		/*Static methods can not be overridden in the exact sense of the word, but they can hide parent static methods
		In practice it means that tue compiler will decide which method to execute at compile time, and not at runtime, as it does with overridden instance methods.
		For a neat example have a look here.
		And this is java documentation explaining the difference between overriding instance methods and hiding class (static) methods.
		Overriding: Overriding in Java simply means that the particular method would be called based on the run time type of the object and not on the compile time type of it (which is the case with overriden static methods)
		Hiding: Parent class methods that are static are not part of a child class (although they are accessible), so there is no question of overriding it. Even if you add another static method in a subclass, identical to the one in its parent class, 
		this subclass static method is unique and distinct from the static method in its parent class.*/
		
		
		
		
		@Override
		public static void main1(Object []args,Integer i) {
			System.out.println("main object []");
		}
		
	}
	
	
	
	
/*
 * /**
 * Java Program to show that, you can not override static method in Java.
 * If you declare same method in subclass then, It's known as method hiding.
 *
 * @author Javin Paul
 */
//public class StaticOverrideTest {
//
//
// public static void main(String args[]) {
//
//  Parent p = new Parent();
//  p.name(); // should call static method from super class (Parent)
//  // because type of reference variable
//  // p is Parent
//
//  p = new Child();
//  p.name(); // as per overriding rules this should call to child's static 
//  // overridden method. Since static method can not be overridden
//  // , it will call parent static method
//  // because Type of p is Parent.
//
//  Child c = new Child();
//  c.name(); // will call child static method because static method 
//  // get called by type of Class
//
// }
//}
//
//class Parent {
//
// /*
//  * original static method in super class which will be hidden
//  * in subclass.
//  */
// public static void name() {
//  System.out.println("static method from Parent");
// }
//}
//
//class Child extends Parent {
//
// /*
//  * Static method with same signature as in super class,
//  * Since static method can not be overridden, this is called
//  * method hiding. Now, if you call Child.name(), this method
//  * will be called, also any call to name() in this particular
//  * class will go to this method, because super class method is hidden.
//  */
// public static void name() {
//  System.out.println("static method from Child");
// }
//}
//
//Output
//static method from Parent
//static method from Parent
//static method from Child
//

	
	
	
	
	/*public class Animal {
    public static void foo() {
        System.out.println("Animal");
    }
}

public class Cat extends Animal {
    public static void foo() {  // hides Animal.foo()
        System.out.println("Cat");
    }
}
Here, Cat.foo() is said to hide Animal.foo(). Hiding does not work like overriding, because static methods are not polymorphic. So the following will happen:

Animal.foo(); // prints Animal
Cat.foo(); // prints Cat

Animal a = new Animal();
Animal b = new Cat();
Cat c = new Cat();
Animal d = null;

a.foo(); // should not be done. Prints Animal because the declared type of a is Animal
b.foo(); // should not be done. Prints Animal because the declared type of b is Animal
c.foo(); // should not be done. Prints Cat because the declared type of c is Cat
d.foo(); // should not be done. Prints Animal because the declared type of d is Animal
Calling static methods on instances rather than classes is a very bad practice, and should never be done.

Compare this with instance methods, which are polymorphic and are thus overridden. The method called depends on the concrete, runtime type of the object:

public class Animal {
    public void foo() {
        System.out.println("Animal");
    }
}

public class Cat extends Animal {
    public void foo() { // overrides Animal.foo()
        System.out.println("Cat");
    }
}
Then the following will happen:

Animal a = new Animal();
Animal b = new Cat();
Animal c = new Cat();
Animal d = null;

a.foo(); // prints Animal
b.foo(); // prints Cat
c.foo(); // prints Cat
d.foo(): // throws NullPointerException
*/
