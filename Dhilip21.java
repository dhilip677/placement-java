1.find the product of the digits in a given number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int p=1;
        while(n>0){
            int digit = n % 10;
            p *= digit;
            n/= 10;
        }
            System.out.println(p);
        
    }
}

2. The number of occurrences of a digit in a given number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a= sc.nextLong();
        int count=0;
        while(n>0){
            long currentdigit = n %10;
            if(currentdigit == a){
                count++ ;
        }
        n/=10;
    }
        System.out.println(count);
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}



3. Count the number of digits in a given number:


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long count=0,ld;
        while(n>0){
            ld = n%10;
            n=n/10;
            count++ ;
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

4.Write a C program to display the digits of a given number from right to left

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // Input must be >= 1
        scanner.close();

        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            System.out.print(digit + " ");
            number /= 10;             // Remove the last digit
        }
    }
}

5.Find whether the given number is Adam or Not


import java.util.Scanner;

public class AdamNumberCheck {
    
    // Function to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Input > 0
        scanner.close();

        int reversedNum = reverse(num);
        int squareOriginal = num * num;
        int squareReversed = reversedNum * reversedNum;
        int reverseSquareReversed = reverse(squareReversed);

        if (squareOriginal == reverseSquareReversed) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not a adam number");
        }
    }
}


6.Find whether the given number is armstrong or not:

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Input > 0
        scanner.close();

        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

7.Find whether the given number is strong number or not


import java.util.Scanner;

public class StrongNumberCheck {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Input > 0
        scanner.close();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
  

8.Write a C program to input amount from user and print minimum number of notes (Rs.500,100,50,20,10,5,2,1) required for the given amount in c

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] n1 = {500, 100, 50, 20, 10, 5, 2, 1};
        int[] c1 = new int[8];
        int remaining = amount;
        for (int i = 0; i < 8; i++) {
            c1[i] = remaining / n1[i];  
            remaining = remaining % n1[i]; 
        }
        System.out.println("Total number of notes:");
        for (int i = 0; i < 8; i++) {
            System.out.println(n1[i] + " : " + c1[i]);
        }

        scanner.close();
    }
}

9.Sum and Difference of Two Numbers


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        float float1 = scanner.nextFloat();
        float float2 = scanner.nextFloat();
        int intSum = int1 + int2;
        int intDiff = int1 - int2;
        float floatSum = float1 + float2;
        float floatDiff = float1 - float2;
        System.out.println(intSum + " " + intDiff);
        System.out.printf("%.1f %.1f\n", floatSum, floatDiff);

        scanner.close();
    }
}

10.Given a number, check whether it is an abundant or deficient or perfect number N number 6 , find the factors and add it eg 6 = 1 , 2 , 3

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else if (sum > n) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Deficient Number");
        }

        scanner.close();
    }
}



11.Find the sum of factors of the given number.

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        // Loop from 1 to n to find all factors and add them
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}

12.Find all the prime factors of the given number.
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 2; i <= n; i++) {
            int count = 0;  // reset count for each i
            
            while (n % i == 0) {
                count++;
                n /= i;
            }
            
            if (count > 0) {
                System.out.println(i + "->" + count + " ");
            }
        }

        scanner.close();
    }
}

13.Find the sum of factors of the given number.

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        // Loop from 1 to n to find all factors and add them
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}

14.Implement the pow function using looping statement

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        scanner.close();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}


15.Print all the factors of the given number.

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i);
                if (i != number) {
                    System.out.print(",");
                }
            }
        }
    }
}

16.Find the max,min,sum and average of the given n numbers without using array.

import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
            count++;
        }

        scanner.close();

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            float average = (float) sum / count;

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", average);
        }
    }
}


17.Find whether the given number is amicable pair or not


import java.util.Scanner;

public class AmicablePairCheck {

    // Method to calculate sum of proper divisors of n
    public static int sumOfDivisors(int n) {
        int sum = 1;  // 1 is always a divisor (except for n=1)
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();

        int sum1 = sumOfDivisors(num1);
        int sum2 = sumOfDivisors(num2);

        if (sum1 == num2 && sum2 == num1) {
            System.out.println("Amicable Pair");
        } else {
            System.out.println("Not a Amicable Pair");
        }
    }
}


19.Find whether the given number is perfect or not

import java.util.Scanner;

public class PerfectNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}

20.Find whether the given number is prime or not.

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if (num <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean isPrime = true;

        // Check divisibility up to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}

21.Find whether the given number is smooth number or not as per the given smooth.

import java.util.Scanner;

public class SmoothNumberCheck {

    // Function to find the largest prime factor of n
    public static int largestPrimeFactor(int n) {
        int largestFactor = -1;

        // Remove factors of 2
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }

        // Check for odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }

        // If remaining n is > 2, it is prime
        if (n > 2) {
            largestFactor = n;
        }

        return largestFactor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int smooth = scanner.nextInt();
        scanner.close();

        int largestPrime = largestPrimeFactor(num);

        if (largestPrime <= smooth) {
            System.out.println("Smooth Number");
        } else {
            System.out.println("Not a Smooth Number");
        }
    }
}


