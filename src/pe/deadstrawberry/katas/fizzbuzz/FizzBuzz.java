package pe.deadstrawberry.katas.fizzbuzz;

/**
 * Created by The Dead Strawberry on 15/06/16.
 */

public class FizzBuzz {

    public static final int MIN = 1;
    public static final int MAX = 100;
    private FizzBuzzNumber fizzBuzzNumber;
    private FizzBuzzParser fizzBuzzParser;

    public String printOne(int i) {
        fizzBuzzParser = new FizzBuzzParser();
        fizzBuzzNumber = new FizzBuzzNumber(i);
        if(!fizzBuzzNumber.isInRange(MIN, MAX))
            throw new OutOfRange();
        fizzBuzzParser.parseNumber(fizzBuzzNumber);
        return fizzBuzzParser.getString();
    }

    public String printAll() {
        fizzBuzzParser = new FizzBuzzParser();
        for (int i = MIN; i <= MAX; i++) {
            fizzBuzzNumber = new FizzBuzzNumber(i);
            fizzBuzzParser.parseNumber(fizzBuzzNumber);
            fizzBuzzParser.addBlankSpace();
        }
        return fizzBuzzParser.getString();
    }

    public static class OutOfRange extends RuntimeException { }
}
