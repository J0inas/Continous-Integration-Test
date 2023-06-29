import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals("Test 23", true, PrimeCheck.isPrime(23));
    assertEquals("Test 11", true, PrimeCheck.isPrime(11));    
    assertEquals("Test 97", true, PrimeCheck.isPrime(97));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    /* ToDo: insert a test here */
    assertEquals("Test 16", false, PrimeCheck.isPrime(16));
    assertEquals("Test 33", false, PrimeCheck.isPrime(33));
    assertEquals("Test 120", false, PrimeCheck.isPrime(120));
    assertEquals("Test 16", false, PrimeCheck.isPrime(1024));
    assertEquals("Test 16", false, PrimeCheck.isPrime(99));
    assertEquals("Test 16", false, PrimeCheck.isPrime(111));
  }
}
