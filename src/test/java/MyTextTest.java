import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeRegExpExecResult.length;
import static org.junit.Assert.*;

public class MyTextTest{
    MyText t = new MyText();

    @Test
    public void testLength() {
        String line = "Apple представила iPhone 8 и iPhone X: трансляция большого анонсса";
        final int length = t.length(line);
        assertEquals(66, length);
    }



}