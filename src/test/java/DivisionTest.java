import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest{
    Division division = new Division();

    @Test
    public void testDivision (){
        int a = 25;
        int b = 5;
        final int division = Division.division(a, b);
        assertEquals(5,division  );
    }

}