package General;

import java.util.Arrays;

public class StringManipulation 
{

	public static void main(String[] args) 
	{
		String a="abc123abc#abc";
				
		//Length of String
		System.out.println("length is: "+a.length());
		
		//Fetch char based on index
		System.out.println("index 5 char is: "+a.charAt(5));
		
		//index of char a
		System.out.println("index of char a is: "+a.indexOf('a'));
		
		//index of second char a
		System.out.println("index of second char a is: "+a.indexOf('a',a.indexOf('a')+1));
		
		//index of String
		System.out.println("index of String #abc is: "+a.indexOf("#ab"));
		
		//String Comparison
		System.out.println("abc".equals("Abc"));
		System.out.println("abc".equalsIgnoreCase("Abc"));
		
		//Sub string
		System.out.println(a.substring(5));
		System.out.println(a.substring(0,5));
		
		//trim spaces in start and end
		System.out.println(" abc  abc ".trim());
		
		//trim spaces in a complete string
		System.out.println(" abc  abc abc".replace(" ", ""));
		
		//replace a with XYZ in a String
		System.out.println("abc abc abc".replace("a", "XYZ"));
		System.out.println("abc abc abc".replaceAll("a", "XYZ"));
		System.out.println("01/12/2021".replace("/", "-"));
		System.out.println("01/12/2021".replace("/", " "));
		
		//Split String into String Array based on some char/String
		String [] ab="abc 123 xyz @#$".split(" ");
		System.out.println(Arrays.toString(ab));
		
		//String concatenation
		System.out.println("abc 123".concat("123"));
		
	}

}
