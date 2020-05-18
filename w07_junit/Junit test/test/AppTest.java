import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public int firstTest(){
        assertEquals("1 equals 2", 1, 2);
    }

    @Test
    public int secondTest(){
        if(assertEquals("sum", App.returnSum(5,10), 11)){
            return 1;
        } else {
            return -1;
        }
    }


}
