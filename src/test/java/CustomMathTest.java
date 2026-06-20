import java.util.Arrays;
import java.util.Collection;

import com.laboratory.unittesting.CustomMath;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CustomMathTest {

    @Parameters
    public static Collection values() {
        return Arrays.asList(new Object[][]{
                {10, 2, 12, 5},
                {9, 3, 12, 3},
                {20, 4, 24, 5}
        });
    }

    int x, y, sumResult, divResult;

    public CustomMathTest(int x, int y, int sumResult, int divResult) {
        this.x = x;
        this.y = y;
        this.sumResult = sumResult;
        this.divResult = divResult;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testSum() {
        assertEquals(sumResult, CustomMath.sum(x, y));
        // fail("The test case is a prototype."); // Sarcina 1
    }

    // --- Sarcina 2 ---
    // @Test
    // public void testDivision() {
    //     int x = 0; int y = 0; int expResult = 0;
    //     int result = CustomMath.division(x, y);
    //     assertEquals(expResult, result);
    //     fail("The test case is a prototype.");
    // }

    @Test
    public void testDivision() {
        // Sarcina 3: Testare division cu date corecte
        assertEquals(divResult, CustomMath.division(x, y));
    }

    @Test
    public void testDivisionByZero() {
        // Sarcina 3: Testare division cu date de excepție
        try {
            CustomMath.division(x, 0);
            fail("Trebuia sa arunce excepție la împărțirea la 0!");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    public void testIsPositive() {
        assertTrue("5 este pozitiv", CustomMath.isPositive(5));
        assertTrue("100 este pozitiv", CustomMath.isPositive(100));
        assertFalse("-3 nu este pozitiv", CustomMath.isPositive(-3));
        assertFalse("0 nu este pozitiv", CustomMath.isPositive(0));
    }

    @Test
    public void testIsNegative() {
        assertTrue("-5 este negativ", CustomMath.isNegative(-5));
        assertTrue("-100 este negativ", CustomMath.isNegative(-100));
        assertFalse("3 nu este negativ", CustomMath.isNegative(3));
        assertFalse("0 nu este negativ", CustomMath.isNegative(0));
    }

    @Test
    public void testIsEven() {
        assertTrue("4 este par", CustomMath.isEven(4));
        assertTrue("0 este par", CustomMath.isEven(0));
        assertTrue("-8 este par", CustomMath.isEven(-8));
        assertFalse("7 nu este par", CustomMath.isEven(7));
        assertFalse("3 nu este par", CustomMath.isEven(3));
    }

    @Test
    public void testIsOdd() {
        assertTrue("3 este impar", CustomMath.isOdd(3));
        assertTrue("7 este impar", CustomMath.isOdd(7));
        assertTrue("-5 este impar", CustomMath.isOdd(-5));
        assertFalse("4 nu este impar", CustomMath.isOdd(4));
        assertFalse("0 nu este impar", CustomMath.isOdd(0));
    }

    @Test
    public void testIsGreater() {
        assertTrue("10 > 3", CustomMath.isGreater(10, 3));
        assertTrue("0 > -5", CustomMath.isGreater(0, -5));
        assertFalse("2 nu e mai mare ca 8", CustomMath.isGreater(2, 8));
        assertFalse("5 nu e mai mare ca 5", CustomMath.isGreater(5, 5));
    }

    @Test
    public void testIsSmaller() {
        assertTrue("3 < 10", CustomMath.isSmaller(3, 10));
        assertTrue("-5 < 0", CustomMath.isSmaller(-5, 0));
        assertFalse("8 nu e mai mic ca 2", CustomMath.isSmaller(8, 2));
        assertFalse("5 nu e mai mic ca 5", CustomMath.isSmaller(5, 5));
    }

    @Test
    public void testIsEqual() {
        assertTrue("5 == 5", CustomMath.isEqual(5, 5));
        assertTrue("0 == 0", CustomMath.isEqual(0, 0));
        assertTrue("-3 == -3", CustomMath.isEqual(-3, -3));
        assertFalse("3 != 7", CustomMath.isEqual(3, 7));
        assertFalse("-1 != 1", CustomMath.isEqual(-1, 1));
    }

    @Test
    public void testIsDivisible() {
        assertTrue("10 e divizibil cu 2", CustomMath.isDivisible(10, 2));
        assertTrue("9 e divizibil cu 3", CustomMath.isDivisible(9, 3));
        assertTrue("100 e divizibil cu 10", CustomMath.isDivisible(100, 10));
        assertFalse("7 nu e divizibil cu 2", CustomMath.isDivisible(7, 2));
        assertFalse("10 nu e divizibil cu 3", CustomMath.isDivisible(10, 3));
    }

    @Test
    public void testIsSumPositive() {
        assertTrue("3 + 4 > 0", CustomMath.isSumPositive(3, 4));
        assertTrue("-2 + 5 > 0", CustomMath.isSumPositive(-2, 5));
        assertFalse("-5 + (-3) nu e pozitiv", CustomMath.isSumPositive(-5, -3));
        assertFalse("-5 + 5 nu e pozitiv", CustomMath.isSumPositive(-5, 5));
    }

    @Test
    public void testIsProductPositive() {
        assertTrue("3 * 4 > 0", CustomMath.isProductPositive(3, 4));
        assertTrue("-3 * -4 > 0", CustomMath.isProductPositive(-3, -4));
        assertFalse("3 * -4 nu e pozitiv", CustomMath.isProductPositive(3, -4));
        assertFalse("0 * 5 nu e pozitiv", CustomMath.isProductPositive(0, 5));
    }
}