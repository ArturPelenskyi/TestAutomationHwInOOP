package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input radius");
        System.out.print("radius:");
        double radius = 0;
        try {
             radius = Double.parseDouble(br.readLine());
        }catch (IOException e){
            System.out.println("Source doesn't exist!");
        }catch (NumberFormatException e){
            System.out.println("Not a number!");
        }

        CounterOfAreaAndPerimeter counterOfAreaAndPerimeter = new CounterOfAreaAndPerimeter(radius);
        counterOfAreaAndPerimeter.CountArea();
        counterOfAreaAndPerimeter.CountPerimeter();


    }
}
