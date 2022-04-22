package com.jenicks.core.StringProblem.Excersice;

public class removefstandlst {

	public static void main(String[] args) {
		String str="Let’s discuss the ways to convert string array to string";
		String temp="";
		int len=str.length()-1;
		for (int i=0;i<=len;i++) {
			if(i==0 ) {
				continue;
				
			}else if(i==len) {
				break;
			}else {
				temp=temp+str.charAt(i);
			}
		}System.out.println(temp);

	}

}
