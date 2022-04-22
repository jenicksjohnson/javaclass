package com.jenicks.core.StringProblem.Excersice;


	import java.util.Scanner;

	public class PrintNumberOnly
	{

		public static void main(String[] args)
		{
			
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter Alphanumeric String");
			String str=scn.next();
			String num="";
			for(int i=0;i<str.length();i++)
			{
				
				if(str.charAt(i)>='0' && str.charAt(i)<='9')
				{
					 num=num+str.charAt(i);
				}
			}
			
			System.out.println(num);
		}

	}
