import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    @Test
    void textMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, five.amount);
        product = five.times(3);
        assertEquals(15,product.amount);
    }
}
