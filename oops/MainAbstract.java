package org.oops;

import java.util.Scanner;

public class MainAbstract {
    public static void main(String[] args){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = getInput.nextInt();
        System.out.println("Enter the second number: ");
        int b = getInput.nextInt();
        System.out.println("The available calculations:");
        System.out.println("1. Addition\n2. Subraction\n3. Multiplication\n4. Division");
        System.out.println("Enter the option to perform:");
        int result = getInput.nextInt();
        if(result==1){
            Addition obj = new Addition();
            obj.calculate(a,b);
        }
        else if(result==2){
            Subraction obj = new Subraction();
            obj.calculate(a,b);
        }
        else if(result==3){
            Multiplication obj = new Multiplication();
            obj.calculate(a,b);
        }
        else if(result==4){
            Division obj = new Division();
            obj.calculate(a,b);
        }
        else{
            System.out.println("The given input is not valid, pls try a valid input!!");
        }
    }
}
