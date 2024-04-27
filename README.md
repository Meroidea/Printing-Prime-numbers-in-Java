Prime Number Finder
This Java program, suj.java, is designed to find and print all prime numbers within the range of 0 to 200. It employs a simple algorithm to efficiently identify prime numbers.

How it Works
The program iterates through each number from 2 to 200. For each number i, it checks if i is divisible by any number j between 2 and the square root of i. If i is divisible by any j, it is marked as non-prime. Otherwise, if no divisor is found, i is considered prime and printed to the console.

Usage
To use this program, simply compile suj.java and run the compiled class file. The program will output all prime numbers between 0 and 200.

Optimization
This program is optimized by only checking divisors up to the square root of the current number i, significantly reducing the number of iterations required to identify prime numbers.
