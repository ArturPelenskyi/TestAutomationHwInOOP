package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        InformationGetter informationGetter = new InformationGetter();
        informationGetter.setName();
        informationGetter.setAddress();
        System.out.print("Name is "+informationGetter.getName()+"\tAddress: "+informationGetter.getAddress());


    }
}
