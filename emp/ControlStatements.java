package org.emp;

import java.util.Scanner;

public class ControlStatements {
    public static void main(String[] args){
        ControlStatements d = new ControlStatements();
        //d.IfElse();
        //d.ForLoop();
        System.out.println("Enter your choice:\n1. IfElse\n2. ForLoop\n3. Calculator");
        Scanner getInput = new Scanner(System.in);
        int input = getInput.nextInt();
        if(input==1){
            d.IfElse();
        }
        else if(input==2){
            d.ForLoop();
        }
        else if(input==3){
            d.CalcProg();
        }
        else{
            System.out.println("Invalid input :(");
        }
    }

    public void IfElse(){
        //int n = 5;
        System.out.println("Enter a number: ");
        Scanner getInput = new Scanner(System.in);
        int n = getInput.nextInt();
        if(n==5){
            System.out.println("Welcome :)");
        }
        else{
            System.out.println("The input is not 5 :(");
        }
    }

    public void ForLoop(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int j = getInput.nextInt();
        System.out.println("Enter the final range: ");
        int k = getInput.nextInt();
        for(int i=j; i<k; i++){
            System.out.println("Loop No." + i);
        }
    }

    public void CalcProg(){
        System.out.println("functions:\n1. Add\n2. Sub\n3. Div\n4. Multi");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the function option(1-4):");
        int func = getInput.nextInt();
        System.out.println("Enter the first num:");
        int first = getInput.nextInt();
        System.out.println("Enter the second num:");
        int secon = getInput.nextInt();
        switch (func){
            case 1:
                System.out.println("sum of the two num is: "+(first+secon));
                break;
            case 2:
                System.out.println("Difference between two num is: "+(first-secon));
                break;
            case 3:
                System.out.println("Division of two num is: "+(first/secon));
                break;
            case 4:
                System.out.println("Multiplication of two num is: "+(first*secon));
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}
