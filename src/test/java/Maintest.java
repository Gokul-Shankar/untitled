import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Maintest {

    Main obj = new Main();

    @Test
    public void test() {
        assertEquals(30, obj.reverse(3003));
    }
}