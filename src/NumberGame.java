import java.util.Scanner;


/*the computer will generate a random number between 1-100,
 and the user gets 10 guesses to find out what that number is.*/

public class NumberGame {


    public static void main(String args[]){
        System.out.println("I choose a number for you between 1-100 ");

        System.out.println("Try to guess it: ");

        int number= (int)(Math.random()*100+1);
        System.out.println(number);
        boolean verificare=false;



        for(int i=10; i>0; i--) {



            Scanner scanner=new Scanner(System.in);
            System.out.println("enter your number:");

            System.out.println("you have "+ i+ " chances left ");
            int inputNumber= scanner.nextInt();


             if (inputNumber>number){
                System.out.println("the number is lower than"+inputNumber );


            }
            else if (inputNumber<number){
                System.out.println("the number is greater than: "+ inputNumber);

            }
            else if(number==inputNumber){
                verificare=true;
                break;
            }


        }

        if (verificare){

            System.out.println(" you win ");}

        else
        {System.out.println("You lost");}



    }
}
