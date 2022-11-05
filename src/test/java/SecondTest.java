import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test
    public void test_add() {
        int a = 56, b = 4;
        int actual = a + b;
        Assert.assertEquals(actual, 60);
    }
}
