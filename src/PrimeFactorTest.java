import static org.junit.Assert.*;
import java.util.*;

public class PrimeFactorTest {
    PrimeFactor primeGenerator = new PrimeFactor();

    @org.junit.Test
    public void oneReturnsNil(){
        ArrayList expected = new ArrayList();
        assertEquals(expected,primeGenerator.getPrimes(1));
    }

    @org.junit.Test
    public void twoReturnsFactorsOfTwo(){
        ArrayList expected = new ArrayList();
        expected.add(2);
        assertEquals(expected,primeGenerator.getPrimes(2));
    }

    @org.junit.Test
    public void nineReturnsFactorsOfNine(){
        ArrayList expected = new ArrayList();
        expected.add(3);
        expected.add(3);
        assertEquals(expected,primeGenerator.getPrimes(9));
    }

    @org.junit.Test
    public void twelveReturnsFactorsOfTwelve(){
        ArrayList expected = new ArrayList();
        expected.add(2);
        expected.add(2);
        expected.add(3);
        assertEquals(expected,primeGenerator.getPrimes(12));
    }

    @org.junit.Test
    public void ThirteenSquared(){
        ArrayList expected = new ArrayList();
        expected.add(13);
        expected.add(13);
        assertEquals(expected,primeGenerator.getPrimes(169));
    }

    @org.junit.Test
    public void minusTen(){
        ArrayList expected = new ArrayList();
        expected.add(-1);
        expected.add(2);
        expected.add(5);
        assertEquals(expected,primeGenerator.getPrimes(-10));
    }
}