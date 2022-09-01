package com.Day5;

public class Solution2 {
	
	void Character(char c) {
		if(c=='a'||c=='G')
		{
			System.out.println("character is vowel or consonant");
		}
		else
		{
			System.out.println("Error");
		}
	
		
	}

	public static void main(String[] args) {
	
		Solution2 s=new Solution2();
		char lower='a';
		char upper='G';
		char invalid='#';
		s.Character(lower);
		s.Character(upper);
		s.Character(invalid);
		
		
	}

}
