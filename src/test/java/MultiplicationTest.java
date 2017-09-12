

import org.junit.Test;


import static org.junit.Assert.*;

public class MultiplicationTest{
     Multiplication multiplication = new Multiplication();

    @Test
    public void testMultiplication() {
        //given
        int a = 5;
        int b = 5;
        //when
        final  int multiplication = Multiplication.multiplication(a,b);

        //then
        assertEquals(25, multiplication);
    }
}
