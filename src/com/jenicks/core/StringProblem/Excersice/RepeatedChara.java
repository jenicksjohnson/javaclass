package com.jenicks.core.StringProblem.Excersice;
import java.util.*;
public class RepeatedChara {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scn.next();
		String temp="";
		for (int i =0; i<s.length();i++) {
			char c = s.charAt(i);
			if(temp.indexOf(c)!=-1)
				continue;
			int count= getCount(s,c);
			if(count>=2) {
				System.out.println(c+":"+count);
			}
			
			temp+=c;
			
		}

	}
	static int getCount(String s,char c) {
		String d="";
		d+=s.replace(c+"","");
		return s.length()-d.length();
	}

}
