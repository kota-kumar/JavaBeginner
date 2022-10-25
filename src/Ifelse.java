import java.lang.*;
import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        //1.  Write a program to input two numbers(A & B) from user and print the maximum element among A & B in each line.
    Scanner Temp = new Scanner(System.in);
    int A = Temp.nextInt();
    int B = Temp.nextInt();

    if(A>B){

        System.out.print(A+ " is the Maximum number");
    }else{

        System.out.print(B+ " is the Maximum number");
          }

//2.  Write a program to input two numbers(A & B) from user and print the minimum element among A & B in each line.

    Scanner temp = new Scanner(System.in);

     int A = temp.nextInt();
     int B = temp.nextInt();

     if(A<B){
         System.out.print(A+ " is the Minimum number");
     }else{

         System.out.print(B+ " is the Minimum number");
     }

 //3.   Write a program to input an integer from user and print whether given number is Even or Odd

      Scanner temp = new Scanner(System.in);
       int N = temp.nextInt();

       if(N%2==0){

           System.out.print(N+ " is Even number");
       }else{

           System.out.print(N+ " is Odd number");
       }

 //4.    You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

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

//5.      You are given an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.

      Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();

        if(A%5==0 && A%11==0){

            System.out.print(A+ " is divible by both 5 and 11");
        }else{

            System.out.print(A+ " is not divible by both 5 and 11");
        }

//6.      Write a program that asks the user to input their age and tells them if they're old enough to ride a roller coaster. The minimum age to ride the roller coaster in this question is 13.

       Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();

        if (A>=13){

            System.out.print("You can ride the roller coaster!");
        }else{

            System.out.print("You can't ride the roller coaster.");
        }

//7.      You have been given a dataset for marks of 2 subjects, scored by students of classes ClassA and ClassB. You now want to compare the performances of class A and class B by finding out the average performance of the classes. Write a program to find if class A performed better. Print True is Class A is strictly better else return False.

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

 /*8.   Given a Number N, print the answer according to the following rules-
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

 /*9.   Mr. ST is in troubles in with numbers, he is confuse that number is positive-odd, positive-even, negative-odd OR negative-even.
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

//10.   Mr. T is struggling with a graph, he has a coordinate point (X,Y) but he doesn't which quadrant this point belongs to.
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

//11.   A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. Ask user for their name and year of service and print whether they should recieve bonus or not.

      Scanner temp = new Scanner(System.in);

        String S = temp.nextLine();
        int E = temp.nextInt();

        if(E>5){

            System.out.print("Yes "+S+ " will recieve bonus.");
        }else{

            System.out.print("No "+S+ " will not recieve bonus.");
        }

 //12.  Exams are near and Rahul is worried whether he will be allowed to take the exams or not. A student is not allowed to take the exams if his/her attendance is less than 75%. But Rahul is a little weak in math, so he wants your help to tell him whether he will be able to give exams or not. You are given the total number of classes held (T) and number of classes attended by Rahul (N),

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
//13. Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.

Scanner temp = new Scanner(System.in);
int N = temp.nextInt();
if(N>0){

    System.out.print(1);
        }
else if(N<0){
    System.out.print(-1);
        }
else if(N==0){
    System.out.print(0);
        }
        }
        }

//14. You are given an integer A. You have to tell how many days are there in the month denoted by A in a non-leap year.

        Scanner temp = new Scanner(System.in);
        int N = temp.nextInt();
        if ( N == 4 || N == 6 || N == 9 || N == 11) {
            System.out.print(30);
        } else if (N == 2) {
            System.out.print(28);
        } else if (N == 1 || N == 3 || N == 5 || N == 7 || N == 8 || N == 10 || N == 12) {

            System.out.print(31);
        }
    }
}
//15. Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.
//If percentage >= 90% : Grade A
//If percentage >= 80% but <90 : Grade B
//If percentage >= 70% but <80: Grade C
//If percentage >= 60% but <70: Grade D
//If percentage >= 40% but <60: Grade E
//If percentage < 40%: Grade F
//NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.

        Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();
        int B = temp.nextInt();
        int C = temp.nextInt();
        int D = temp.nextInt();
        int E = temp.nextInt();
        double perc = (double) (A + B + C + D + E) * 0.2;
        int percent = (int) perc;
        if (percent >= 90) {
            System.out.println(percent);
            System.out.print("A");
        } else if (percent >= 80 && percent < 90) {
            System.out.println(percent);
            System.out.print("B");
        } else if (percent >= 70 && percent < 80) {
            System.out.println(percent);
            System.out.print("C");
        } else if (percent >= 60 && percent < 70) {
            System.out.println(percent);
            System.out.print("D");
        } else if (percent >= 40 && percent < 60) {
            System.out.println(percent);
            System.out.print("E");
        }
    }
}
        //16.  Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle. You have to print if the traingle is "equilateral", "scalene" or "isosceles".
    Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();
        int B = temp.nextInt();
        int C = temp.nextInt();
        if (A == B && B == C) {

            System.out.println("equilateral");
        } else if (A == B && B != C) {

            System.out.println("isosceles");
        } else if (A != B && B != C) {

            System.out.println("scalene");
        }
    }
}
//17.   Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

        Scanner temp = new Scanner(System.in);
        int A = temp.nextInt();
        int B = temp.nextInt();
        int C = temp.nextInt();
        if (A > B && A > C) {
            System.out.println(A);
        } else if (A < B && C < B) {

            System.out.println(B);
        } else {

            System.out.println(C);
        }
    }
}

//18. Write a program that takes in a number N as input and does the following: if N is a multiple of 3, print Fizz. if N is a multiple of 5, print Buzz. if N is a multiple of both 3 and 5, print FizzBuzz

    Scanner temp = new Scanner(System.in);
        int N = temp.nextInt();

        if (N % 3 == 0) {
            System.out.print("Fizz");
        }
        if (N % 5 == 0) {
            System.out.print("Buzz");
        }
    }
}

//19.   Given marks of a student M, if his/her marks >= 50 then the student has passed the exam otherwise failed. If a student passes the exam, print PASS and also the grade of student, grading system -Marks are between [50,80] -> B. Marks are between [81,100] -> A. But if the student fails the exam, then print FAIL.

        Scanner temp = new Scanner(System.in);
        int M = temp.nextInt();

        if (M < 50) {

            System.out.print("FAIL");
        } else if (M >= 50 && M <= 80) {

            System.out.print("PASS B");
        } else if (M >= 81 && M <= 100) {

            System.out.print("PASS A");
        }
    }
}

//20.   Write a program to input an integer(A) from user and print the Ath month of the year.Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

      Scanner temp = new Scanner(System.in);

        int monthNumber = temp.nextInt();

        if (monthNumber == 1) {

            System.out.println("January");
        } else if (monthNumber == 2) {
            System.out.println("February");
        } else if (monthNumber == 3) {
            System.out.println("March");
        } else if (monthNumber == 4) {
            System.out.println("April");
        } else if (monthNumber == 5) {
            System.out.println("May");
        } else if (monthNumber == 6) {
            System.out.println("June");
        } else if (monthNumber == 7) {
            System.out.println("July");
        } else if (monthNumber == 8) {
            System.out.println("August");
        } else if (monthNumber == 9) {
            System.out.println("September");
        } else if (monthNumber == 10) {
            System.out.println("October");
        } else if (monthNumber == 11) {
            System.out.println("November");
        } else if (monthNumber == 12) {
            System.out.println("December");
        }
    }
}

//21.   You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not. A triangle is valid if sum of its angles equals to 180.

     Scanner temp = new Scanner(System.in);

        int A = temp.nextInt();
        int B = temp.nextInt();
        int C = temp.nextInt();
        int D = A + B + C;

        if (D == 180) {
            System.out.print(1);
        } else {

            System.out.print(0);
        }
    }
}

//22.   Write a program to input three numbers(A, B & C) from user and print the minimum element among A, B & C.

        Scanner temp = new Scanner(System.in);

        int A = temp.nextInt();
        int B = temp.nextInt();
        int C = temp.nextInt();

        if (A < B && A < C) {
            System.out.print(A);
        } else if (B < A && B < C) {

            System.out.print(B);
        } else {

            System.out.print(C);
        }
    }
}

//23.   Write a program that asks the user to input a number N. If N is between 10 and 20, your program should ask the user to enter another number M and then:- Print the sum of the two numbers. If the sum is greater than equal to 100, your program should also print "That is a large sum!" on a new line. If N is not between 10 and 20, your program should print -1.

 Scanner temp = new Scanner(System.in);

        int N = temp.nextInt();

        if (N >= 10 && N <= 20) {
            int M = temp.nextInt();

            int D = N + M;
            if (D >= 100) {

                System.out.println(D);
                System.out.print("That is a large sum!");

            } else {

                System.out.print(D);
            }
        } else {

            System.out.print(-1);
        }
    }
}

//24.   Write a program to input from user an integer(A) representing the rating of a person on a platform. You have to print the category of that person. If the rating is greater than or equal to 2100 then that person is "grand master". If the rating is greater than or equal to 1900 then that person is "candidate master". If the rating is greater than or equal to 1600 then that person is "expert". If the rating is greater than or equal to 1400 then that person is "pupil". If the rating is smaller than 1400 then that person is "newbie". NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE

        Scanner temp = new Scanner(System.in);

        int A = temp.nextInt();

        if (A >= 2100) {
            if (A % 2 == 0) {
                System.out.print("GRAND MASTER");
            } else {
                System.out.print("grand master");
            }
        } else if (A >= 1900) {

            if (A % 2 == 0) {

                System.out.print("CANDIDATE MASTER");
            } else {

                System.out.print("candidate master");
            }
        } else if (A >= 1600) {

            if (A % 2 == 0) {

                System.out.print("EXPERT");
            } else {
                System.out.print("expert");
            }
        } else if (A >= 1400) {

            if (A % 2 == 0) {

                System.out.print("PUPIL");
            } else {

                System.out.print("pupil");
            }
        } else if (A < 1400) {
            if (A % 2 == 0) {

                System.out.print("NEWBIE");
            } else {

                System.out.print("newbie");
            }

        }
    }

}