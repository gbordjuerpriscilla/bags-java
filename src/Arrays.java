//A program that takes the users input and find the max input num type and the min input to the user
//TYPE 5 NUMS
//DISPLAY YOUR MAX NO IS -----
//DISPLAY YOUR MIN NO IS -----

import java.util.Scanner;

public class Arrays {
    public static void array() {
        System.out.println("Enter five integers less than 100:");
        System.out.println("------------------------------------------------------");
        int[] userNumbers = new int[5];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < userNumbers.length; i++)

            userNumbers[i] = input.nextInt();

        int max = userNumbers[0];
        int min = userNumbers[0];
        for (int num : userNumbers){
            if(num > max )
                max = num;


            if(num < min )
                min = num;




        }
        System.out.println("----------------------------------------------------------");
        System.out.println("Max Num: " + max);
        System.out.println("Min Num: " +min);

//        for (int num : userNumbers)
//            System.out.print(num + " ");


//        out
//        in
//        name

    }

}
