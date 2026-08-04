package oops2;

import OOPs.abc_jm;

public class Manager_jm extends abc_jm
{
	void display() {
		System.out.println("salary ="+salary);
	}

	public static void main(String[] args) {

		Manager_jm ob=new Manager_jm();
		ob.display();
	}

}
