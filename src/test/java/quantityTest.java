import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class quantityTest{
    quantity t =new quantity();
    @Test
    public void calc()  {
        String text = "hhhhhjjkkmlkhgfcdxxdcr";
        char s = 'h';
        final int result = t.calc(text, s);
        Assert.assertEquals(6, result);
    }

}