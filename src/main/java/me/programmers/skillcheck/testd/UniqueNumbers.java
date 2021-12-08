package me.programmers.skillcheck.testd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        final Map<Integer, Long> numberMap = numbers.stream()
            .collect(groupingBy(Function.identity(), counting()));

        return numberMap.entrySet().stream()
            .filter(e -> e.getValue() == 1L)
            .map(Map.Entry::getKey)
            .collect(toList());
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
