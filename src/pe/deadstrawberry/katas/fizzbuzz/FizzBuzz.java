package pe.deadstrawberry.katas.fizzbuzz;

/**
 * Created by The Dead Strawberry on 15/06/16.
 */

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int MIN = 1;
    public static final int MAX = 100;

    public String print() {
        StringBuilder result = new StringBuilder();
        for (int i = MIN; i <= MAX; i++) {
            result.append(parseNumber(i));
            insertSpace(result);
        }
        return result.toString();
    }

    public String printOne(int i) throws OutOfRange {
        if (isNotInRange(i))
            throw new OutOfRange();
        return parseNumber(i);
    }

    private String parseNumber(int i) {
        if (isDivisibleBy3(i) && isDivisibleBy5(i))
            return FIZZ + BUZZ;
        if (isDivisibleBy3(i))
            return FIZZ;
        if (isDivisibleBy5(i))
            return  BUZZ;
        return String.valueOf(i);
    }

    private static boolean isNotInRange(int i) { return i < MIN || i > MAX; }

    private void insertSpace(StringBuilder result) { result.append(" "); }

    private boolean isDivisibleBy5(int i) {
        return i % 5 == 0;
    }

    private boolean isDivisibleBy3(int i) {
        return i % 3 == 0;
    }

    public static class OutOfRange extends Exception { }
}
