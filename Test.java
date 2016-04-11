package naveed.practice.test;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
/*
		StringBuffer fileName = new StringBuffer("D:CR_uploadedDoc/853/null");
		System.out.println(fileName.delete(fileName.length() - 4,
				fileName.length()));
		
		
//====================================================================
		String a = "Abraham";
		String b = "Best Friend";
		
		a = String.format("%0$-" + b.length()+ "s   ", a);
		b = String.format("%0$-" + b.length() + "s   ", b);
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		//====================================================================
		  String split_vls = "11. Welcome to java programming |1. Oops concepts |12. Encapsulation |3.Abstraction  |14.Inheritance  |5.Polymorphism";
	         String[] Numeric_split = split_vls.split("\\|*(\\w+\\.)\\s*");
	         for ( String pipes_Split : Numeric_split) {
	       System.out.println(pipes_Split);
	         }
		StringTokenizer st= new StringTokenizer(split_vls, "\\|*(\\w+\\.)\\s*");
		
		while (st.hasMoreElements())
			System.out.println(st.nextToken());
			
		
		
		

	

	}
}
