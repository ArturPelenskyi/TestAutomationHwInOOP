import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        int start = 0;
        int end = 0;
        System.out.print("a= ");
        try {
            a = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }
        System.out.print("b= ");
        try {
            b = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }

        Calc calc = new Calc();
        try {
            if (b == 0) {
                throw new Exception("/0 !!!");
            } else {
                System.out.print("a/b = ");
                System.out.print(calc.div(a, b) + "\n");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.print("start= ");
        try {
            start = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }
        System.out.print("end= ");
        try {
            end = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
        }


        int[] num = new int[10];
        try {
            System.out.println("Input number between " + start + " and " + end);
            num[0] = calc.readNumber(start, end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[0] = start + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[0] = start + 1;
        }
        try {
            System.out.println("Input number between " + num[0] + " and " + end);
            num[1] = calc.readNumber(num[0], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[1] = num[0] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[1] = num[0] + 1;
        }
        try {
            System.out.println("Input number between " + num[1] + " and " + end);
            num[2] = calc.readNumber(num[1], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[2] = num[1] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[2] = num[1] + 1;
        }
        try {
            System.out.println("Input number between " + num[2] + " and " + end);
            num[3] = calc.readNumber(num[2], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[3] = num[2] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[3] = num[2] + 1;
        }
        try {
            System.out.println("Input number between " + num[3] + " and " + end);
            num[4] = calc.readNumber(num[3], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[4] = num[3] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[4] = num[3] + 1;
        }
        try {
            System.out.println("Input number between " + num[4] + " and " + end);
            num[5] = calc.readNumber(num[4], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[5] = num[4] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[5] = num[4] + 1;
        }
        try {
            System.out.println("Input number between " + num[5] + " and " + end);
            num[6] = calc.readNumber(num[5], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[6] = num[5] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[6] = num[5] + 1;
        }
        try {
            System.out.println("Input number between " + num[6] + " and " + end);
            num[7] = calc.readNumber(num[6], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[7] = num[6] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[7] = num[6] + 1;
        }
        try {
            System.out.println("Input number between " + num[7] + " and " + end);
            num[8] = calc.readNumber(num[7], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[8] = num[7] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[8] = num[7] + 1;
        }
        try {
            System.out.println("Input number between " + num[8] + " and " + end);
            num[9] = calc.readNumber(num[8], end);
        } catch (IOException e) {
            System.out.println("Source doesn't exist!");
            num[9] = num[8] + 1;
        } catch (NumberFormatException e) {
            System.out.println("Not a number!");
            num[9] = num[8] + 1;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }


        System.out.println("\nDone");


    }
}

