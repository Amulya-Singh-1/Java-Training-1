package com.java8.rgex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EgStringRegex {
	public static void main(String[] args) {
		
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("cs");
		boolean b=m.matches();
		System.out.println(b);
		
		System.out.println( Pattern.compile(".s").matcher("bs").matches() );
		
		
	}
}
