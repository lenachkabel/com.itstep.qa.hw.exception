package com.itstep.qa.exception.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []array = new int[5];
        for (int i=0; i<array.length; i++){
            System.out.println("Ввести элементы массива");
            try {
                array[i] = scanner.nextInt();

            }catch (InputMismatchException ex){
                System.out.println();
                ex.printStackTrace();
                array[i] = 0;}
        }


    }

}
