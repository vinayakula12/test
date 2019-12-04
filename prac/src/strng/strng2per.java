package strng;

import java.util.Arrays;



public class strng2per {

	public static void uniqueCharactersper(String str1,String str2) {

		char[] ar1=str1.toCharArray();

		char[] ar2=str2.toCharArray();

		Arrays.sort(ar1);

		Arrays.sort(ar2);

		for (int i=0;i<ar1.length;i++) {

			if(ar1[i]==ar2[i]) {

				System.out.println("the string is perm");

				

			}

			else {

				System.out.println("the string is not perm");

				//break;

			}

		}

	}



	public static void main(String[] args) {

		uniqueCharactersper("abcferr","abcferl");



	}



}