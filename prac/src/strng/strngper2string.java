package strng;

public class strngper2string {



	public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length()) {

            return false;

        }

        String s3 = s1 + s1;

        // return isSubString(s3, s2);

        return s3.contains(s2);

    }



    

	public static void main(String[] args)

	{

		System.out.println("Is s2 a rotation of s1?(solution1) :"

                + isRotation("catdog", "dogcajt"));



	}

}