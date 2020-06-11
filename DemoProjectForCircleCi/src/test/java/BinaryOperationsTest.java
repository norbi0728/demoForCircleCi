import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryOperationsTest {

    @Test
    public void xorTest(){
        System.out.println("xorTest");
        assertEquals(4, BinaryOperations.xor(3, 4));
    }

}