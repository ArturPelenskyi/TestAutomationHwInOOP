package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    User user = new User();
	    try {
			user.setC1();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e){
	    	System.out.println("Not a number!");
		}

	    try {
			user.setC2();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e) {
	    	System.out.println("Not a number!");
		}
	    try {
			user.setC3();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e){
			System.out.println("Not a number!");
		}
		try {
			user.setT1();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e){
			System.out.println("Not a number!");
		}
		try {
			user.setT2();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e){
			System.out.println("Not a number!");
		}
		try {
			user.setT3();
		}catch (IOException e)
		{
			System.out.println("Source doesn't exist!");
		}catch (NumberFormatException e){
			System.out.println("Not a number!");
		}

	    user.Counting();


    }
}
