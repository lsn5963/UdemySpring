package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printOddNumberInListFunctional(numbers);
//        printSquaresOfEvenNumberInListFunctional(numbers);

        List<String> tmp = List.of("Spring", "Spring Boot", "lee", "kim", "park");
//        tmp.stream()
//                .filter(x-> x =="Spring")
//                .forEach(System.out::println);
//        tmp.stream()
//                .filter(x-> x.length()>=4)
//                .forEach(System.out::println);
        tmp.stream()
                .map(x -> x.length())
                .forEach(System.out::println);

    }
    private static void printOddNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 1)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumberInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
