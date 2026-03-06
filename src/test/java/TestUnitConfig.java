import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitConfig {
    @Test
    public void testUnitConfig(){
        String str = "Test Unit Config";
        String expected = "Test Unit Config !";
        assertEquals("Test_Junit_Config", str);
        assertEquals("Test_Junit_Config",expected );
    }


}
