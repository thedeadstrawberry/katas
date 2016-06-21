package pe.deadstrawberry.katas.fizzbuzz;

/**
 * Created by The Dead Strawberry on 20/06/16.
 */
class FizzBuzzNumber {

    private int number;

    public FizzBuzzNumber(int number) {
        this.number = number;
    }

    public boolean isInRange(int min, int max) {
        return number >= min && number <= max;
    }

    public boolean isDivisibleBy3() {
        return number % 3 == 0;
    }

    public boolean isDivisibleBy5() {
        return number % 5 == 0;
    }

    public String toString() {
        return String.valueOf(number);
    }

}
