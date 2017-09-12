import org.junit.Test;

import static org.junit.Assert.*;

public class exponentiationTest{
    exponentiation exponentiation = new exponentiation();
    private exponentiation Exponentiation;

    @Test
    public void testexponentiation() {

        int a = 5;
        int b = 5;
        final int exponentiation = Exponentiation.exponentiation(a, b);
        assertEquals(3125,  exponentiation);
    }

}