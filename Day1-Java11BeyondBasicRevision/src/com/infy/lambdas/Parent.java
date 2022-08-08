package com.infy.lambdas;

@FunctionalInterface
abstract interface  Parent{
	public abstract void func();
}
class Child1 {
	public Child1() {
		Parent p=()->{System.out.println("Overriden in Child 1");};
	}
	
}
class Child2 {
	public Child2() {
		Parent p=()->{System.out.println("Overriden in Child 2");};
	}
}
