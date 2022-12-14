/*Q1) a) Why String is immutable in java and what is the difference between String and String Builder? And Write
some of the methods of String class at least 5 with example.
b) What is the difference between equals method and == operator in java? And what will be the output of the
following code snippets and giving proper explanation.

Code snippet 1 >

String s1 = new String("abc");
String s2 = new String("abc");
System.out.println(s1.equals(s2));


Code snippet 2 >

StringBuilder sb1 = new StringBuilder("abc");
StringBuilder sb2 = new StringBuilder("abc");
System.out.println(sb1.equals(sb2));

Code snippet 3 >

String s1 = new String("abc");
String s2 = new String("abc");
System.out.println(s1==s2);*/


/* Question 1(a): Why is String Immutable in Java?

Answer(a): for taking care about Security and synchronization in java, String is Immutable. String is always final in
           java therefor one can't change it or update it. The main reason behind is that String is stored in String
           context pool so so that, It can be shared.
           
           String support many underlying methods:
           --------------------------------------
           5 methods out of them
           ---------------------
           
           (1): toUpperCase(): To make a string in uppercase
             Exaple
           (2): trim(): To remove the extra spaces from beginning and last.
           (3): charAt(): It gives character at given index.
           (4): equals(): To compare if the content of given two string is true or false.
           (5): equalsIgnoreCase(): It ignores the case and return true if two strings are true, return false if false.
  
 
 Question 1(b):  What is the difference between equals method and == operator in java? And what will be the output of the
                 following code snippets and giving proper explanation.
            
 Answer(b): Difference between equals and == operator:
            ------------------------------------------
            
          (1): == Operator compare two string with the address if the address of both the string is same then return
               true else false whereas equals() method compares two string with their content, if the content is same
               return true else false.                                 
               
          Example 1: Code snippet 1 >
          
           String s1 = new String("abc");
           String s2 = new String("abc");
           System.out.println(s1.equals(s2));
           
           Explanation: equals() compares with the content so in the above example both string have same content therefore 
                        answer is true. but if we compare using == then, It will give false because both created at difference
                        memory address using new.
                        
          Example 2: Code snippet 2 >
          
          StringBuilder sb1 = new StringBuilder("abc");
          StringBuilder sb2 = new StringBuilder("abc");
          System.out.println(sb1.equals(sb2));
         
          Explanation: In the case of StringBuffer and StringBuilder they don't get data from string context pool compiler
                       separate memory address using StringBuilder and StringBuffer therefore. Answer will be false.
          
          Example 3: Code snippet 3 >
          
          String s1 = new String("abc");
          String s2 = new String("abc");
          System.out.println(s1==s2);
          
          Expalantion: In this case, Answer will be false because, Both object will create differently inside heap memory.
                       but having the same content which is already there in String Context Pool Area.
           */
package com.Evaluation2;

public class Evaluation2Q1 {

	public static void main(String[] args) {
		

		String s1=new String("abc");
		String s2=new String("abc");
		
		System.out.println(s1.equals(s2));//it will check content.
		
		
		StringBuilder s3=new StringBuilder("abc");
		StringBuilder s4=new StringBuilder("abc");
		System.out.println(s3.equals(s4));
		
		String s5=new String("abc");
		String s6=new String("abc");
		System.out.println(s5==s6);//it will check reference which will be diff,stored in heap area.
		
		
	}

}
