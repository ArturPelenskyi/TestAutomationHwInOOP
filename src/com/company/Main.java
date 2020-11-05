package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static  void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        try {
            System.out.print("n:");
             n = Integer.parseInt(br.readLine());
        }catch (IOException e)
        {
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }
        User user = new User(n);
        user.ThreeCheck();
        user.NReverseAndReplacementOfTheExtremeNumbers();
        user.AddingOneAtTheEdgesN();

    }
}
