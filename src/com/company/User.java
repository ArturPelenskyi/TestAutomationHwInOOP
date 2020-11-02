package com.company;

public class User {
    private int n;

    public  User(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void ThreeCheck(){
        int temp = (int) Math.pow(n,2);
        System.out.println("Квадрат числа n: "+temp);
        String temp1 = Double.toString(temp);
        char[] ArrayTemp = temp1.toCharArray();
        String Messege = null;

        for (var i=0; i< ArrayTemp.length; i++)
        {
            if(ArrayTemp[i]=='3')
            {
                Messege = "Квадрат числа n містить цифру 3!";
                break;
            }
            else
            {
                Messege = "Квадрат числа n не містить цифру  3!";
            }
        }

        System.out.println(Messege);
    }

    public void NReverseAndReplacementOfTheExtremeNumbers(){
        String N = Integer.toString(n); // Первід n в String


        char[] ArrayN = N.toCharArray(); // Запис кожної цифри запису числа n в масив сисмолів ArrayN

        System.out.println("Число n");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        System.out.println();


        for (int i = 0; i < ArrayN.length / 2; i++) { // Розворот числа n
            char tmp = ArrayN[i];
            ArrayN[i] = ArrayN[ArrayN.length - i - 1];
            ArrayN[ArrayN.length - i - 1] = tmp;
        }

        System.out.println("Розвернуте число n");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        for (int i = 0; i < ArrayN.length / 2; i++) { // Розворот щоб повенути n до початкового вигляду
            char tmp = ArrayN[i];
            ArrayN[i] = ArrayN[ArrayN.length - i - 1];
            ArrayN[ArrayN.length - i - 1] = tmp;
        }

        System.out.println();

        char Temp = ArrayN[0];
        ArrayN[0]=ArrayN[ArrayN.length-1];   // Заміна місцями крайніх чисел числа n
        ArrayN[ArrayN.length-1]= Temp;

        System.out.println("Число n з зміненими місцями крайніми числами");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        System.out.println();
    }

    public void  AddingOneAtTheEdgesN()
    {
        String N = Integer.toString(n); // Первід n в String
        System.out.println("Число n до якого по краях додали 1" );
        System.out.println("1"+N+"1");

    }






}
