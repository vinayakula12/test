package strng;

import java.util.Arrays;

import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

public class strngper {

public static  void isPalindromePermutation(String input) {

	/* If input is null, no further processing */

	if (input == null) {

		System.out.println("is null");

	}

	/* Counter for characters who have odd count */

	int oddCount = 0;

	/* Converting to lower case to avoid comparison issues */

	input = input.toLowerCase();

	/* Map to hold count of each character */

	char[] arr=input.toCharArray();

	Map<Character, Integer> countMap = new HashMap<>();

	for (int i = 0; i < input.length(); i++) {

		char s=arr[i];

		if(countMap.containsKey(s)) {

			countMap.put(s, countMap.get(s)+1);

		}

		else {

			countMap.put(s, 1);

		}

		

		}

	int oddCount1=0;

	for (Entry<Character, Integer> key : countMap.entrySet()) {

		//if (key.getValue() % 2 != 0) {

			//oddCount++;

		//}

		if (key.getValue() % 2 != 0) {

			oddCount1++;

		}

	}

	System.out.println("jj"+oddCount1);

	//return false;

}



	public static void main(String[] args)

	{

		isPalindromePermutation("nayuan");



	}

}









