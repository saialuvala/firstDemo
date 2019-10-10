package com.interview.practise;

 abstract class Demo {

	
	public abstract void display();
}

public class AbstartDemo extends Demo implements DemoInterfacr{

	@Override
	public void display() {
		System.out.println("Callig display methodmmmmmmmmmm");
	}
	
	public static void  main(String args[]) {
		AbstartDemo d = new AbstartDemo();
		d.display();
		System.out.println("hi");
	}
	
}
