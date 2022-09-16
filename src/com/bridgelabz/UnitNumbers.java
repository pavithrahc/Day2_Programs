/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author PAVITHRA C
 *
 */
public class UnitNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the numbers");
		int i =sc.nextInt(); 
		if(i== 1)
			{ System.out.println(" zero");
			}
			else if(i==10)
	{
				System.out.println(" ten");
	}
			else if(i==100)
	{
				System.out.println("Hundred");
	}
			else if(i==1000)
	{
				System.out.println("thousand");
	}
			else
			{
				System.out.println(" default values");
			}

}
}
