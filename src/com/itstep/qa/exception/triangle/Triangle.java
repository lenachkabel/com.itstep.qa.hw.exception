package com.itstep.qa.exception.triangle;

import com.itstep.qa.exception.runner.TringleRunner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону");
        int a = inputWithControl();
        System.out.println("Введите вторую сторону");
        int b = inputWithControl();
        System.out.println("Введите третью сторону");
        int c = inputWithControl();
        double result = suqare(a,b,c);
        if(result >0){
            System.out.println("Площадь рех равна "+result);
        }

        }
        private static int inputWithControl(){
            int a;
            Scanner scanner = new Scanner(System.in);
            while (true){
                try{
                    a=scanner.nextInt();
                    break;
                }catch (InputMismatchException ex){
                    scanner.nextLine();
                    System.out.println("Ввенное значение не корректно");
                }
            }
            return a;
        }
        private static double suqare (int a, int b, int c){
        double square = 0;
        try {
            if ((a+b<=c)||(a+c<=b)||(b+c>=a)){
                throw  new TringleRunner();
            }
            double p = (a+b+c)/2.0;
            square = Math.sqrt(((p-a)*(p-b)*(p-c)*p));
        }catch (TringleRunner ex) {
            System.out.println("Треугольник с такими сторонами "+"существовать не может");
            System.out.println("Работа программы прекращена");
        }
        return square;


            }
        }


