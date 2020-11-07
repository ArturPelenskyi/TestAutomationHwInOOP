import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalcTest {

    public Calc calc;
    @BeforeClass
    public void createObject(){
        calc = new Calc();
    }

    @Test
}
