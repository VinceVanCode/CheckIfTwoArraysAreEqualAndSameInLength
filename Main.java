package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first array:");
        String firstStr = input.nextLine();
        String[] frstString = firstStr.split(" ");
        System.out.println(Arrays.toString(frstString));
        System.out.print("Enter second array:");
        String secStr = input.nextLine();
        String[] secndStr = secStr.split(" ");
        System.out.println(Arrays.toString(secndStr));

        int[] frstIntArray = Arrays.stream(frstString).mapToInt(Integer::parseInt).toArray();
        int[] secondIntArray = Arrays.stream(secndStr).mapToInt(Integer::parseInt).toArray();

        //compare the two strings
        if (frstIntArray.length == secondIntArray.length){

            if(Arrays.equals(frstIntArray, secondIntArray)){
                System.out.print("The two Arrays are Equal and have the same length!");
            }
        } else{
            System.out.print("The two Arrays are NOT Equal!");

        }



            
        }
    }

