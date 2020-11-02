

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("a:");
            double a = Double.parseDouble(br.readLine());
            System.out.print("b:");
            double b = Double.parseDouble(br.readLine());
            System.out.print("c:");
            double c = Double.parseDouble(br.readLine());
            System.out.print("x:");
            double x = Double.parseDouble(br.readLine());
            System.out.print("y:");
            double y = Double.parseDouble(br.readLine());
            Brick brick = new Brick(a,b,c);
            Hole hole = new Hole(x,y);

            if((brick.getA() <= hole.getX() && brick.getB() <= hole.getY()) ||
                    (brick.getA() <= hole.getY() && brick.getB() <= hole.getX())){
                System.out.println("Можна просунути");
            }
            else if((brick.getA() <= hole.getX() && brick.getC() <= hole.getY()) ||
                    (brick.getA() <= hole.getY() && brick.getC() <= hole.getX())){
                System.out.println("Можна просунути");
            }
            else if((brick.getC() <= hole.getX() && brick.getB() <= hole.getY()) ||
                    (brick.getC() <= hole.getY() && brick.getB() <= hole.getX())){
                System.out.println("Можна просунути");
            }
            else{
                System.out.println("Неможна просунути");
            }
        }







    }



