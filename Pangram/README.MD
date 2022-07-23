## Instructions
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.

## Tests

```
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}
```