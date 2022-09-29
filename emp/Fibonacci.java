package org.emp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Fibonacci a = new Fibonacci();
        a.facto();
    }

    public void facto(){
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the factorial length: ");
        int len = getInput.nextInt();
        int val=1;
        //int temp;
        for(int i=1; i<len+1; i++){
            //temp = val*i;
            //val=temp;
            val=val*i;
        }
        System.out.println(val);
    }
}
