package exercise5;

import java.util.Scanner;
import java.util.Arrays;

public class Search {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int size = input.nextInt();

        int[] numbers = new int[size];


        System.out.println("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.print("Search for number: ");
        int number = input.nextInt();

        int numberIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] == number) {
            numberIndex = i;
          }
        }
        System.out.println("Number index: " + numberIndex);




        }

    }
