//Create a program to print the even numbers from 1 to 100.
//check through the numbers and see if when divided by two the remainder is zero or no.
//if 0 then is an even
//else is an old number


public class Even {

    public static void evenNumbers() {
        for (int i = 1; i <= 100; i++){
            if(i%2 == 0)
                System.out.print(i + " ");
            else
                continue;
        }


    }


}
