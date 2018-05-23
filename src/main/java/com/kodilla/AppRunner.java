package com.kodilla;

public class AppRunner {
    public static void main(String ...args){
        Calculator calculator= new Calculator();
        int result=calculator.addition(2,3);
        if (result==8){
            System.out.print("success");
        }else {
            System.out.print("fail");
        }
    }
}
