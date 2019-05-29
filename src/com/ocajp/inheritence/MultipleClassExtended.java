package com.ocajp.inheritence;


class Employee3 {
	public void receiveSalary() {
		System.out.println("PayDues");
	}
}
class Philanthropist {
	public void receiveSalary() {
		System.out.println("Donate");
	}
}
 
/*
class ProgrammerMultipleClassExtended extends Philanthropist,Employee3 {}


class Test {
public void main(String args[]) {
	ProgrammerMultipleClassExtended p = new ProgrammerMultipleClassExtended();
p.receiveSalary();
}

In this case, the class
can access two
methods with identical
method signatures but different implementations, so it’s impossible to resolve this
method call. This is why classes aren’t allowed to inherit multiple classes in Java.
}
*/

/*so why multiple interface allowed but not multiple class
 * 
 * 1)prior rto java 8 So even if a class inherited methods with the same name from different
	interfaces, it came without an implementation.*/

//interface can allow two same methd in interface 
/*with same siignature to be implemented in class (with same retyuurn type*)
 * will give compile rerror for same signature but different return type**/
interface a1{
	void print();
}
interface a2{
	void print();
}

class checkMultipleInterfaceWithSameName implements a2,a1
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

