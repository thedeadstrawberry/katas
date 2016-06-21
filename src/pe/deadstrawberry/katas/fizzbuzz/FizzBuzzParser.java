package pe.deadstrawberry.katas.fizzbuzz;

/**
 * Created by The Dead Strawberry on 20/06/16.
 */
class FizzBuzzParser {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String BLANK_SPACE = " ";

    private FizzBuzzNumber number;
    private StringBuilder stringBuilder;

    public FizzBuzzParser() {
        stringBuilder = new StringBuilder();
    }

    public void parseNumber(FizzBuzzNumber number) {
        this.number = number;
        stringBuilder.append(parse());
    }

    private String parse() {
        if (number.isDivisibleBy3() && number.isDivisibleBy5())
            return FIZZ + BUZZ;
        if (number.isDivisibleBy3())
            return FIZZ;
        if (number.isDivisibleBy5())
            return BUZZ;
        return number.toString();
    }

    public void addBlankSpace() {
        stringBuilder.append(BLANK_SPACE);
    }

    public String getString() {
        return stringBuilder.toString();
    }
}
