package exercise5;

import java.util.Scanner;

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

        int[] uniqueNumbers = new int[size];

        uniqueNumbers[0]=numbers[0];

        for(int i = 1; i < size;i++){
            for(int j= 0; j<size; j++){
            if(uniqueNumbers[j] == numbers[i]) {
                break;
            }else if(uniqueNumbers[j]==0){
                uniqueNumbers[j] = numbers[i];
                break;
            }
            }
        }

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);




        }

    }
