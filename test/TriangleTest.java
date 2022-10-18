import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest{

    @Test
    public void classifyTriangle0() {
        String expected ="tam giác đều";
        String result = Triangle.classifyTriangle(2,2,2);
        assertEquals(expected,result);
    }
    @Test
    public void classifyTriangle1() {
        String expected ="tam giác cân";
        String result = Triangle.classifyTriangle(2,2,3);
        assertEquals(expected,result);
    }
    @Test
    public void classifyTriangle2() {
        String expected ="tam giác thường";
        String result = Triangle.classifyTriangle(3,4,5);
        assertEquals(expected,result);
    }
    @Test
    public void classifyTriangle3() {
        String expected ="không phải tam giác";
        String result = Triangle.classifyTriangle(8,2,3);
        assertEquals(expected,result);
    }
    @Test
    public void classifyTriangle4() {
        String expected ="không phải tam giác";
        String result = Triangle.classifyTriangle(-1,2,1);
        assertEquals(expected,result);
    }
}