package giorgi.gigauri.davaleba5.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AspectPrintln {

    @Before("@annotation(Println)")
    public void printAnnotationAspect(JoinPoint joinPoint) {
        System.out.println("არგუმენტები: " + Arrays.toString(joinPoint.getArgs()));
    }
}
