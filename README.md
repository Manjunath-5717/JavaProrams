# Java Basic Programs

This repository contains basic Java programs created for practicing fundamental programming concepts. The programs cover loops, arrays, methods, and user input using Scanner.

## 📚 Topics Covered

- Java Basics
- For Loop
- While Loop
- Do-While Loop
- 1D Arrays
- 2D Arrays
- User Input using Scanner
- Basic Arithmetic Programs
- Methods in Java

## 📂 Programs Included

Some of the Java programs in this repository:

- Addition.java – Program for basic addition
- Array1.java – Example of 1D array
- ArrayDy.java – Dynamic array example
- ArrayEx.java – Array example program
- Arrayinp.java – Taking array input from user using Scanner
- Arrays.java – Basic array operations
- Even.java – Program to print even numbers
- ForExample.java – For loop example
- Dowhile.java – Do-while loop example
- Method.java – Example of methods in Java

## 💻 Example Code

Example of taking input in an array and printing it using a loop:

```java
import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}


Add array programs
Add loop practice programs
Add factorial and sum programs
Add scanner input examples
