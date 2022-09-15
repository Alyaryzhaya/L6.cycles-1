package ru.netology.lekcii;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.lekcii.SqrtService;

public class SqrtServiceTest {

    @Test
    public void CalcExact() {  // название тестируемого случая

        SqrtService service = new SqrtService();  // объект

        int expect = 5; // ожидаемый
        int actual = service.calcSqrt(25); // фактич

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void CalcInExact() {  // название тестируемого случая

        SqrtService service = new SqrtService();  // объект

        int expect = 6; // ожидаемый
        int actual = service.calcSqrt(27); // фактич

        Assertions.assertEquals(expect, actual);


    }
}
