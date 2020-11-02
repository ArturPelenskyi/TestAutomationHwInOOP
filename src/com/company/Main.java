package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Main {

    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("n:");
        int  n = Integer.parseInt(br.readLine());
        User user = new User(n);
        user.ThreeCheck();
        user.NReverseAndReplacementOfTheExtremeNumbers();
        user.AddingOneAtTheEdgesN();

    }
}
