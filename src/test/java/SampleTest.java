import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class SampleTest {
    @Test
    public void test_add() {
        int a = 1, b = 4;
        int actual = a + b;
        Assert.assertEquals(actual, 5);
    }

    @Test
    public void test_mul() {
        int a = 1, b = 4;
        int actual = a * b;
        Assert.assertEquals(actual, 4);
    }
}