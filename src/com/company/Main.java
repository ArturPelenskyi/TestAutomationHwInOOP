package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input radius");
        System.out.print("radius:");
        double radius = Double.parseDouble(br.readLine());

        CounterOfAreaAndPerimeter counterOfAreaAndPerimeter = new CounterOfAreaAndPerimeter(radius);
        counterOfAreaAndPerimeter.CountArea();
        counterOfAreaAndPerimeter.CountPerimeter();


    }
}
