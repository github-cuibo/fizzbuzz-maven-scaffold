import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void should_input1_return1() {
        assertEquals("1", FizzBuzz.of(1));
    }

    @Test
    public void should_input3_returnFizz() {
        assertEquals("Fizz", FizzBuzz.of(3));
    }

    @Test
    public void should_input5_returnBuzz() {
        assertEquals("Buzz", FizzBuzz.of(5));
    }

    @Test
    public void should_input15_returnFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.of(15));
    }
}
