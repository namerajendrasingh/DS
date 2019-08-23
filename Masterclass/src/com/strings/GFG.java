package com.strings;
class GFG 
{ 
static boolean isSmaller(String str1, String str2) 
{	int n1 = str1.length(), n2 = str2.length(); 

	if (n1 < n2) 
		return true; 
	if (n2 > n1) 
		return false; 

	for (int i = 0; i < n1; i++) 
	{ 
		if (str1.charAt(i) < str2.charAt(i)) 
			return true; 
		else if (str1.charAt(i) > str2.charAt(i)) 
			return false; 
	} 
	return false; 
} 
static String findDiff(String str1, String str2) 
{ 
	if (isSmaller(str1, str2)) 
	{ 
		String t = str1; 
		str1 = str2; 
		str2 = t; 
	} 

	String str = ""; 
	int n1 = str1.length(), n2 = str2.length(); 
	int diff = n1 - n2; 
	int carry = 0; 
	for (int i = n2 - 1; i >= 0; i--) 
	{ 
		int sub = (((int)str1.charAt(i + diff) - (int)'0') - ((int)str2.charAt(i) - (int)'0') - carry); 
		if (sub < 0) 
		{ 
			sub = sub+10; 
			carry = 1; 
		} 
		else
			carry = 0; 

		str += String.valueOf(sub); 
	} 
	for (int i = n1 - n2 - 1; i >= 0; i--) 
	{ 
		if (str1.charAt(i) == '0' && carry > 0) 
		{ 
			str += "9"; 
			continue; 
		} 
		int sub = (((int)str1.charAt(i) - (int)'0') - carry); 
		if (i > 0 || sub > 0) // remove preceding 0's 
			str += String.valueOf(sub); 
		carry = 0; 

	} 
	return new StringBuilder(str).reverse().toString(); 
} 
public static void main (String[] args) 
{ 
	String str1 = "000000088"; 
	String str2 = "10000079"; 
	System.out.println(findDiff(str1, str2)); 
} 
} 
