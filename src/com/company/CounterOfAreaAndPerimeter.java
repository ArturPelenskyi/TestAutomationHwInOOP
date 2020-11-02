package com.company;

public class CounterOfAreaAndPerimeter {

    private static final double Pi =3.14;

    private double radius;
    public CounterOfAreaAndPerimeter(double radius){
        this.radius=radius;
    }

    public void CountArea()
    {
        double area = Pi*Math.pow(radius,2); // Площа квітника.
        System.out.println("Area of flower bed: "+area);
    }

    public void CountPerimeter(){
        double perimeter = 2*Pi*radius; // Периметр квітника.
        System.out.println("perimeter of flower bed: "+perimeter);

    }
}
