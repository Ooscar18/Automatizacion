package pageobjects;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionExamples {

    @Test
    public void foo(){
        String actual = "pepito";
        String expected = "pepito 2";
        Assertions.assertTrue(actual.contains(expected), "the name is not the expected. Expected: " + expected + "Actual: " + actual);

        Assertions.assertEquals(1, 2);
    }
}
