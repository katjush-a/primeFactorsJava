import static org.junit.Assert.*;

public class PrimeFactorTest {
    PrimeFactor primeGenerator = new PrimeFactor();

    @org.junit.Test
    public void oneReturnsOne(){
        assertEquals(primeGenerator.getPrimes(1),1);
    }
}