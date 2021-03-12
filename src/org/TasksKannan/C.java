package org.TasksKannan;

public class C implements A,B {

	@Override
	public void add() {
		System.out.println("a+b");
		
	}
	@Override
	public void sub() {
		System.out.println("a-b");
		
	}
	@Override
	public void div() {
		System.out.println("a/b");
		
	}
	public static void main(String[] args) {
		C c=new C();
		c.add();
		c.sub();
		c.div();
	}
}
