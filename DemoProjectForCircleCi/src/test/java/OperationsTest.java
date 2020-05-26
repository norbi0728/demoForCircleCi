import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {
    @Test
    public void addTest(){
        System.out.println("addTest");
        assertEquals(Operations.add(3,5),8);
        assertEquals(Operations.add(-3,5),2);
        assertEquals(Operations.add(-3,-5),-8);
        assertEquals(Operations.add(3,0),3);
        
        assertEquals(Operations.add(0,-3),-3);
    }

    @Test
    public void subTest(){
        System.out.println("divTest");
        assertEquals(Operations.sub(3, 5), -2);
        assertEquals(Operations.sub(-1, 5), -6);
        assertEquals(Operations.sub(0, 5), -5);
        assertEquals(Operations.sub(8, 5), 3);
    }

    @Test
    public void multTest(){
        System.out.println("multTest");
        assertEquals(Operations.mult(3, 4), 12);
    }

    @Test()
    public void divTest(){
        System.out.println("divTest");
        assertEquals(Operations.div(3, 4), 0.75, 1);
        assertEquals(Operations.div(0, 3), 0, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void divTestException(){
        System.out.println("divTestWithException");
        assertEquals(Operations.div(3, 0), 0.75, 1);
    }

}