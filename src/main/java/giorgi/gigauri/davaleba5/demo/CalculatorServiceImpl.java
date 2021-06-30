package giorgi.gigauri.davaleba5.demo;

import giorgi.gigauri.davaleba5.demo.aspect.Println;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Println
    @Override
    public int multiply(int x, int y) {
        return x * y;
    }
}
