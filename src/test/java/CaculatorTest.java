import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Lớp test cho các phương thức của lớp Calculator
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CaculatorTest {
    // Khai báo biến tham chiếu tới lớp Calculator
    private Caculator calc;
    // Setup
    @BeforeAll // Chạy một lần duy nhất trước tất cả
    public static void setupAll(){
        System.out.println("Chạy 1 lần duy nhất trước tất cả các test.");
    }
    @BeforeEach// sẽ được gọi nhiều lần , tương ứng với @Test
    public void setup(){
        calc = new Caculator();
        System.out.println("Chạy truớc mỗi test script");
    }
    @Test
    public void testAdd(){
        int result = 10;
        assertEquals(result,calc.add(4,6));
    }
    @Test
    public void testSubtract(){
        int result = 10;
        assertEquals(result,calc.add(15,5));
    }
    // Teardown
    @AfterEach // sẽ được gọi nhiều lần , tương ứng với @Test
    public void tearDown(){
        calc = null;
        System.out.println("Thực thi sau mỗi test script");
    }
    @AfterAll
    public static void tearDownAll(){
        System.out.println("Chạy 1 lần suy nhất sau khi hoàn thành test.");
    }
}
