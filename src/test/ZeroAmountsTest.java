package test;


import com.company.ZeroAmounts;
import org.junit.Assert;
import org.junit.Test;

public class ZeroAmountsTest extends Assert {

    @Test
    public void test10Values() {
        assertEquals(0, ZeroAmounts.getZerosCount(3));
        assertEquals(1, ZeroAmounts.getZerosCount(7));
        assertEquals(2, ZeroAmounts.getZerosCount(14));
        assertEquals(3, ZeroAmounts.getZerosCount(18));
        assertEquals(6, ZeroAmounts.getZerosCount(26));
        assertEquals(7, ZeroAmounts.getZerosCount(31));
        assertEquals(12, ZeroAmounts.getZerosCount(50));
        assertEquals(41, ZeroAmounts.getZerosCount(170));
        assertEquals(124, ZeroAmounts.getZerosCount(500));
        assertEquals(25123, ZeroAmounts.getZerosCount(100500));
    }

    @Test
    public void test0N() {
        assertEquals(0, ZeroAmounts.getZerosCount(0));
    }

    @Test
    public void test10000N() {
        assertEquals(2499, ZeroAmounts.getZerosCount(10000));
    }

    @Test
    public void testMaxN() {
        assertEquals(536870902, ZeroAmounts.getZerosCount(Integer.MAX_VALUE));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeN() {
        ZeroAmounts.getZerosCount(-1);
    }
}
