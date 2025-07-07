package methods.azamat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleMethodsTest {
    @Test
    public void testAdd() {
        ExampleMethods exampleMethods = new ExampleMethods();
        int result = exampleMethods.add(2,3);
        assertEquals(5, result);
    }
}
