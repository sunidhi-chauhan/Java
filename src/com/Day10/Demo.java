package com.Day10;

public class Demo {
	
//	public void fun1(Object obj)
//	{
//		System.out.println("Inside fun1 of Demo");
//	}
	
	public Object fun1( int x)
	{
		
		
	
		System.out.println("Inside fun1 of Demo");
		
		if(x > 10)
		
		return new A();
		
		else
			
		return new LgOldTv();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LgOldTv remote = new LgOldTv();
//		
//		remote.start();
//		remote.increaseVolume();
//		remote.chnageChannel(); //old way
		
		
//		LgSmartTv remote = new LgSmartTv();
//		
//		    remote.start();
//		    remote.increaseVolume();
//		    remote.chnageChannel();//smart way
//		    remote.playGame();
		
		
//		
//		LgOldTv remote = new LgSmartTv();
//		
//		  remote.start();
//		  remote.increaseVolume();
//		  remote.chnageChannel(); //smart way ....Dyanamic polymorphism
          //remote.playGame();//you can't call spacific methods
		  
		 // LgSmartTv nRemote new LgSmartTv();
		  
//		LgSmartTv  sRemote = (LgSmartTv)remote;
//		
//		sRemote.playGame();
		
		Demo d1 =new Demo(); 
		    
//		d1.fun1( new A());
//		d1.fun1( new LgOldTv()); 
//		d1.fun1( null); 
		
		 Object obj = d1.fun1(2); //supre class ref pointing to the child class obj
		 if(obj instanceof A)
		 {
			A a1 = (A)obj;
			a1.funA();
		
		 }
		 else
		 {
			 LgOldTv b1 = (LgOldTv)obj;
			 b1.start();
		 }
		 
	}

}
