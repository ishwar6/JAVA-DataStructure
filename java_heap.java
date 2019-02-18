package com.journaldev.test;

public class Memory {

	public static void main(String[] args) { // Line 1
		int i=1; 
		Object obj = new Object(); // Line 3
		Memory mem = new Memory(); // Line 4
		mem.foo(obj); // Line 5
	} // Line 9

	private void foo(Object param) { // Line 6
		String str = param.toString(); //// Line 7
		System.out.println(str);
	} // Line 8

}
class Person {
    int pid;
    String name;
     
    // constructor, setters/getters
}
 
public class Driver {
    public static void main(String[] args) {
        int id = 23;
        String pName = "Jon";
        Person p = null;
        p = new Person(id, pName);
    }
}
