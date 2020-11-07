import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Calc {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public double div(double a, double b)
    {
        return a/b;
    }

    public int readNumber(int start, int end) throws Exception {
        System.out.print("num= ");
        int  num = Integer.parseInt(br.readLine());
        try {
            if (num > start && num < end) {
                return num;
            } else {
                throw new Exception("Число не відповідає інтервалу від " + start + " до " + end);

            }
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }
        return start+1;
    }
}
