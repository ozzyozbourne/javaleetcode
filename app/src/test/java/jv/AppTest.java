package jv;

import org.junit.jupiter.api.Test;
import jv.FirstChapter.First.One;
import jv.FirstChapter.Second.Two;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testChapter1A(){
        int [] a = {2, 1, 5, 1, 3, 2};
        int k = 3;
        assertEquals(9, One.findMaxSum(k, a));
    }

    @Test
    public void testChapter1B(){
        int [] a = {2, 3, 4, 1, 5};
        int k = 2;
        assertEquals(7, One.findMaxSum(k, a));
    }

    @Test
    public void testChapter2A(){
        int [] a = {2, 1, 5, 2, 3, 2};
        int k = 7;
        assertEquals(2, Two.findMin(k, a));
    }

    @Test
    public void testChapter2B(){
        int [] a = {2, 1, 5, 2, 8};
        int k = 7;
        assertEquals(1, Two.findMin(k, a));
    }

    @Test
    public void testChapter2C(){
        int [] a = {3, 4, 1, 1, 6};
        int k = 8;
        assertEquals(3, Two.findMin(k, a));
    }


    
}
