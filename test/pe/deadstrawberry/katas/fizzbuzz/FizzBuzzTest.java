package pe.deadstrawberry.katas.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by The Dead Strawberry on 15/06/16.
 */

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;
    private StringBuilder expected;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
        expected = new StringBuilder();
    }

    @Test
    public void testPrintOneThroughOneHundred() {
        expected.append("1 2 ").append(FizzBuzz.FIZZ).append(" 4 ").append(FizzBuzz.BUZZ).append(" ").append(FizzBuzz.FIZZ).append(" 7 8 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" ");
        expected.append("11 ").append(FizzBuzz.FIZZ).append(" 13 14 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" 16 17 ").append(FizzBuzz.FIZZ).append(" 19 ").append(FizzBuzz.BUZZ).append(" ");
        expected.append(FizzBuzz.FIZZ).append(" 22 23 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" 26 ").append(FizzBuzz.FIZZ).append(" 28 29 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" ");
        expected.append("31 32 ").append(FizzBuzz.FIZZ).append(" 34 ").append(FizzBuzz.BUZZ).append(" ").append(FizzBuzz.FIZZ).append(" 37 38 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" ");
        expected.append("41 ").append(FizzBuzz.FIZZ).append(" 43 44 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" 46 47 ").append(FizzBuzz.FIZZ).append(" 49 ").append(FizzBuzz.BUZZ).append(" ");
        expected.append(FizzBuzz.FIZZ).append(" 52 53 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" 56 ").append(FizzBuzz.FIZZ).append(" 58 59 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" ");
        expected.append("61 62 ").append(FizzBuzz.FIZZ).append(" 64 ").append(FizzBuzz.BUZZ).append(" ").append(FizzBuzz.FIZZ).append(" 67 68 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" ");
        expected.append("71 ").append(FizzBuzz.FIZZ).append(" 73 74 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" 76 77 ").append(FizzBuzz.FIZZ).append(" 79 ").append(FizzBuzz.BUZZ).append(" ");
        expected.append(FizzBuzz.FIZZ).append(" 82 83 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" 86 ").append(FizzBuzz.FIZZ).append(" 88 89 ").append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ).append(" ");
        expected.append("91 92 ").append(FizzBuzz.FIZZ).append(" 94 ").append(FizzBuzz.BUZZ).append(" ").append(FizzBuzz.FIZZ).append(" 97 98 ").append(FizzBuzz.FIZZ).append(" ").append(FizzBuzz.BUZZ).append(" ");

        assertEquals(expected.toString(), fizzbuzz.print());
    }

    @Test (expected = FizzBuzz.OutOfRange.class)
    public void whenNumberLowerThanOne_ExpectNumberOutOfRangeException() throws FizzBuzz.OutOfRange {
        fizzbuzz.printOne(0);
    }

    @Test (expected = FizzBuzz.OutOfRange.class)
    public void whenNumberHigherThanOneHundred_ExpectNumberOutOfRangeException() throws FizzBuzz.OutOfRange {
        fizzbuzz.printOne(101);
    }

    @Test
    public void whenNumberDivisibleByThree_ReturnFizz() throws FizzBuzz.OutOfRange {
        expected.append(FizzBuzz.FIZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(9));
    }

    @Test
    public void whenNumberDivisibleByFive_ReturnBuzz() throws FizzBuzz.OutOfRange {
        expected.append(FizzBuzz.BUZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(25));
    }

    @Test
    public void whenNumberDivisibleByThreeAndFive_ReturnFizzBuzz() throws FizzBuzz.OutOfRange {
        expected.append(FizzBuzz.FIZZ).append(FizzBuzz.BUZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(15));
    }

    @Test
    public void whenNumberIsNotDivisibleByThreeOrFive_ReturnNumber() throws FizzBuzz.OutOfRange {
        expected.append(8);
        assertEquals(expected.toString(), fizzbuzz.printOne(8));
    }

    @After
    public void tearDown() {
        fizzbuzz = null;
        expected = null;
    }

}
