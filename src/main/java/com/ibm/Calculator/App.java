package com.ibm.Calculator;

import java.util.Scanner;

public class App 
{
	
	public long firstNum;
	public long secondNum;
	
	
	
    public long getFirstNum() {
		return firstNum;
	}



	public void setFirstNum(long firstNum) {
		this.firstNum = firstNum;
	}



	public long getSecondNum() {
		return secondNum;
	}



	public void setSecondNum(long secondNum) {
		this.secondNum = secondNum;
	}


	public long addFunc() {
		
		return firstNum+secondNum;
		
	} 

	public long subFunc() {
		
		return firstNum-secondNum;
		
	}
	
	public long prodFunc() {
		
		return firstNum/secondNum;
		
	}

	public static void main( String[] args )
    {
        App cal = new App();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number");
        cal.setFirstNum(sc.nextLong());
        System.out.println("Enter Second Number");
        cal.setSecondNum(sc.nextLong());
        
        System.out.println("Sum is :" +cal.addFunc());
        System.out.println("Diff is :"+cal.subFunc());
        System.out.println("Prod is :"+cal.prodFunc());
        
    }
}
