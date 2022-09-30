
                           /*String in java*/
package com.java;
//String using new keyword
public class Day7Practice2 {

	public static void main(String[] args) {
		
		String a=new String("Sunidhi");
		System.out.println(a);
		
		String b=new String("Sunidhi");//object will created in heap  area.as well as SCP TOO//2 objects
		System.out.println(b);//both a nd b refer to the same object.
		
		a=a.concat("chauhan");
		System.out.println(a);//it will create new object for a and old one will destroy.
		
		

	}

}
