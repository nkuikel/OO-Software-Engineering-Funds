// Consider the following Python program:

// def main():
// 	epsilon = 0.00001
// 	x = float(input('Enter a number and I will guess its square root: '))
// 	guess = 1.0
// 	while abs(guess * guess - x) > epsilon:
// 		guess = (guess + x/guess)/2	
// 	print('I guess the square root of', x , 'is', guess)
// main()

// Write a Java program that implements the same algorithm.

import java.util.Scanner;

public class Java_Translation {

    public static void main(String[] args) {
        final double epsilon = 0.00001;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and I will guess its square root: ");
        double x = scanner.nextDouble();

        double guess = 1.0;

        while (Math.abs(guess * guess - x) > epsilon) {
            guess = (guess + x / guess) / 2.0;
        }

        System.out.println("I guess the square root of " + x + " is " + guess);

        scanner.close();
    }
}
