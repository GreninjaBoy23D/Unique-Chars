/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Chars word = new Chars();
		String input = "What is me, and What is I";
		if(word.isAllUnique(input))
		{
		    System.out.println("The String " + input + " has all unique characters");
		}
		else
		{
		    System.out.println("The String " + input + " has duplicate characters");
		}
	}
}
