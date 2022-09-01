package com.Day5;

public class Shapes {
	
	
	/*Static polymorphism or overloading means same methods name but
	 different arguments. 
	  */
	 
	
	 public void area(int a) {
//	  Circle c=new Circle();
        System.out.println("Radious is:"+a);
		 
	 }
	 
	 
     public void area(int b,int c) {
//    	 Rectangle r=new Rectangle();
    	 System.out.println("Rectnagle length is:"+b);
    	System.out.println("Rectangle breadth is:"+c);
   

    	 
     }
     public void area(byte b) {
//    	 Square s=new Square();
         System.out.println("Square side is:"+b);

     }


	public static void main(String[] args) {
		
//		Shapes h=new Shapes();
//		h.area();
	
		

	}

}
