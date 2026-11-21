import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
public class Maintest{
    Main obj=new Main();
    public void test(){
        assertEquals(3003,obj.reverse(3003));
    }
}