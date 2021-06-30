package giorgi.gigauri.davaleba5.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GiorgiGigauriDavaleba5ApplicationTests {

    @Autowired
    CalculatorService calculatorService;

    @Test
    void PrintlnTest() {
        Assertions.assertEquals(21, calculatorService.multiply(7, 3));
    }
}
