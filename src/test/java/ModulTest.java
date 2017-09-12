import org.junit.Test;

import static org.junit.Assert.*;

public class ModulTest{
    Modul modul = new Modul();

               @Test
    public void testModul(){
                   int a = 23;
                   int b = 10;
                   final int modul =Modul.Modul (a, b);
                   assertEquals(3, modul);
    }

}