import java.lang.*;
import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        // Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
    Scanner Temp = new Scanner(System.in);
    int A = Temp.nextInt();
    int B = Temp.nextInt();

    if(A>B){

        System.out.print(A+ " is the Maximum number");
    }else{

        System.out.print(B+ " is the Maximum number");
          }

//Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.

    Scanner temp = new Scanner(System.in);

     int A = temp.nextInt();
     int B = temp.nextInt();

     if(A<B){
         System.out.print(A+ " is the Minimum number");
     }else{

         System.out.print(B+ " is the Minimum number");
     }

  //Write a program to input an integer from user and print whether given number is Even or Odd

      Scanner temp = new Scanner(System.in);
       int N = temp.nextInt();

       if(N%2==0){

           System.out.print(N+ " is Even number");
       }else{

           System.out.print(N+ " is Odd number");
       }

 //You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

       Scanner temp = new Scanner(System.in);
        int C = temp.nextInt();
        int S = temp.nextInt();
        int prof =0;
        int loss =0;
        if(C<S){

            prof = S-C;
                System.out.print("you got a profit of " +prof);
        }else if(C>S){

            loss = C-S;
            System.out.print("you got a loss of " +loss);
        }

//You are given an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

      Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();

        if(A%5==0 && A%11==0){

            System.out.print(A+ " is divible by both 5 and 11");
        }else{

            System.out.print(A+ " is not divible by both 5 and 11");
        }

//Write a program that asks the user to input their age and tells them if they're old enough to ride a roller coaster. The minimum age to ride the roller coaster in this question is 13.

       Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();

        if (A>=13){

            System.out.print("You can ride the roller coaster!");
        }else{

            System.out.print("You can't ride the roller coaster.");
        }

//You have been given a dataset for marks of 2 subjects, scored by students of classes ClassA and ClassB. You now want to compare the performances of class A and class B by finding out the average performance of the classes. Write a program to find if class A performed better. Print True is Class A is strictly better else return False.

        Scanner temp = new Scanner(System.in);
        double A1 = temp.nextDouble();
        double A2 = temp.nextDouble();
        double B1 = temp.nextDouble();
        double B2 = temp.nextDouble();
        double Avg_A = (A1+A2)/2;
        double Avg_B = (B1+B2)/2;

        if(Avg_A > Avg_B){

            System.out.print("class A is strictly better than B");
        }else{

            System.out.print("class B is strictly better than A");
        }

 /*Given a Number N, print the answer according to the following rules-
1. If N is divisible by 3 print Rock
2. If N is divisible by 5 print star
3. If N is divisible by both 3 and 5 print Rockstar*/

       Scanner temp = new Scanner(System.in);
        int N = temp.nextInt();
        if(N%3==0 && N%5!=0){

            System.out.print("Rock");
        }if(N%5==0 && N%3!=0){

            System.out.print("Star");
        }if(N%3==0 && N%5==0){

            System.out.print("Rock Star");
        }

 /*Mr. ST is in troubles in with numbers, he is confuse that number is positive-odd, positive-even, negative-odd OR negative-even.
Write a code for him to figure out the Situation.
Take a number N from user and print the Situation Of Number.
if positive-odd : print -> "Number is Positive and Odd"
if positive-even : print -> "Number is Positive and Even"
if negative-odd : print -> "Number is Negative and Odd"
if negative-even : print -> "Number is Negative and Even"*/

     Scanner temp = new Scanner(System.in);
        int N = temp.nextInt();

        if(N>0 && N%2==0){

            System.out.print("Number is Positive and Even");
        }else if(N<0 && N%2==0){

            System.out.print("Number is Negative and Even");
        }else if(N>0 && N%2!=0){

            System.out.print("Number is Positive and Odd");
        }else if(N<0 && N%2!=0){

            System.out.print("Number is Negative and Odd");
        }

//Mr. T is struggling with a graph, he has a coordinate point (X,Y) but he doesn't which quadrant this point belongs to.
//Write a program to help him figure out the Quadrant of the given X,Y coordinate.

       Scanner temp = new Scanner(System.in);
        int X = temp.nextInt();
        int Y = temp.nextInt();

        if(X>0 && Y>0){

            System.out.print(X+ " , " +Y+ " belongs to First Quadrant");

        }else if(X<0 && Y>0){

            System.out.print(X+ " , " +Y+" belongs to Second Quadrant");
        }else if(X<0 && Y<0){

            System.out.print(X+ " , " +Y+" belongs to Third Quadrant");
        }else if(X>0 && Y<0){

            System.out.print(X+ " , " +Y+" belongs to Fourth Quadrant");
        }

//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their name and year of service and print whether they should recieve bonus or not.

      Scanner temp = new Scanner(System.in);

        String S = temp.nextLine();
        int E = temp.nextInt();

        if(E>5){

            System.out.print("Yes "+S+ " will recieve bonus.");
        }else{

            System.out.print("No "+S+ " will not recieve bonus.");
        }

 //Exams are near and Rahul is worried whether he will be allowed to take the exams or not. A student is not allowed to take the exams if his/her attendance is less than 75%. But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not. You are given the total number of classes held (T) and number of classes attended by Rahul (N),

 Scanner temp = new Scanner(System.in);
        double Total_Classes = temp.nextDouble();
        double Attended_Classes = temp.nextDouble();

        double Attendence_Avg = (Attended_Classes/Total_Classes)*100;

        if(Attendence_Avg >=75){

            System.out.print("Yes Rahul can attend the Exam");
        }else{

            System.out.print("No Rahul cannot attend the Exam");
        }

    }
}