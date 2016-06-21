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
        expected.append("1 2 ").append(FizzBuzzParser.FIZZ).append(" 4 ").append(FizzBuzzParser.BUZZ).append(" ").append(FizzBuzzParser.FIZZ).append(" 7 8 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("11 ").append(FizzBuzzParser.FIZZ).append(" 13 14 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" 16 17 ").append(FizzBuzzParser.FIZZ).append(" 19 ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append(FizzBuzzParser.FIZZ).append(" 22 23 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" 26 ").append(FizzBuzzParser.FIZZ).append(" 28 29 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("31 32 ").append(FizzBuzzParser.FIZZ).append(" 34 ").append(FizzBuzzParser.BUZZ).append(" ").append(FizzBuzzParser.FIZZ).append(" 37 38 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("41 ").append(FizzBuzzParser.FIZZ).append(" 43 44 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" 46 47 ").append(FizzBuzzParser.FIZZ).append(" 49 ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append(FizzBuzzParser.FIZZ).append(" 52 53 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" 56 ").append(FizzBuzzParser.FIZZ).append(" 58 59 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("61 62 ").append(FizzBuzzParser.FIZZ).append(" 64 ").append(FizzBuzzParser.BUZZ).append(" ").append(FizzBuzzParser.FIZZ).append(" 67 68 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("71 ").append(FizzBuzzParser.FIZZ).append(" 73 74 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" 76 77 ").append(FizzBuzzParser.FIZZ).append(" 79 ").append(FizzBuzzParser.BUZZ).append(" ");
        expected.append(FizzBuzzParser.FIZZ).append(" 82 83 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" 86 ").append(FizzBuzzParser.FIZZ).append(" 88 89 ").append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ).append(" ");
        expected.append("91 92 ").append(FizzBuzzParser.FIZZ).append(" 94 ").append(FizzBuzzParser.BUZZ).append(" ").append(FizzBuzzParser.FIZZ).append(" 97 98 ").append(FizzBuzzParser.FIZZ).append(" ").append(FizzBuzzParser.BUZZ).append(" ");

        assertEquals(expected.toString(), fizzbuzz.printAll());
    }

    @Test (expected = FizzBuzz.OutOfRange.class)
    public void whenNumberLowerThanOne_ExpectNumberOutOfRangeException() {
        fizzbuzz.printOne(0);
    }

    @Test (expected = FizzBuzz.OutOfRange.class)
    public void whenNumberHigherThanOneHundred_ExpectNumberOutOfRangeException() {
        fizzbuzz.printOne(101);
    }

    @Test
    public void whenNumberDivisibleByThree_ReturnFizz() {
        expected.append(FizzBuzzParser.FIZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(9));
    }

    @Test
    public void whenNumberDivisibleByFive_ReturnBuzz() {
        expected.append(FizzBuzzParser.BUZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(25));
    }

    @Test
    public void whenNumberDivisibleByThreeAndFive_ReturnFizzBuzz() {
        expected.append(FizzBuzzParser.FIZZ).append(FizzBuzzParser.BUZZ);
        assertEquals(expected.toString(), fizzbuzz.printOne(15));
    }

    @Test
    public void whenNumberIsNotDivisibleByThreeOrFive_ReturnNumber() {
        expected.append(8);
        assertEquals(expected.toString(), fizzbuzz.printOne(8));
    }

    @After
    public void tearDown() {
        fizzbuzz = null;
        expected = null;
    }

}
