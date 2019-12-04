package strng;


import java.util.Arrays;



public class strng {

	public static void uniqueCharacters(String str) {

		char[] ar=str.toCharArray();

		Arrays.sort(ar);

		for (int i=0;i<ar.length-1;i++) {

			if(ar[i]!=ar[i+1]) {

				System.out.println("the string is unique");

				

			}

			else {

				System.out.println("the string is not unique");

				//break;

			}

		}

	}



	public static void main(String[] args) {

		uniqueCharacters("abcferr");



	}



}

