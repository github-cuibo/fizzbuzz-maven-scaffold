public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            String result = of(i);
            System.out.println(result);
        }
    }

    public static String of(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
