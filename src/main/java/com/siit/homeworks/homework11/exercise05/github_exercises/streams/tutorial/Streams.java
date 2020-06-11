package com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
//import homework11test.exercise5.streams.tutorial.exercise5.*;

public class Streams {

    public static class NotImplementedException extends RuntimeException {
        public NotImplementedException() {
            super("This method hasn't been implemented yet!");
        }
    }

    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        //throw new NotImplementedException();
        return numbers.stream()
                .map(Math::sqrt)
                .mapToInt(Double::intValue)
                .boxed()
                .collect(Collectors.toList());

    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        //throw new NotImplementedException();
        return user.stream()
                .map(User::getAge)
                .collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .map(User::getAge)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        //throw new NotImplementedException();
        return users.stream()
                .limit(limit)
                .collect(Collectors.toList());

    }

    public static Integer countUsersOlderThen25(List<User> users) {
        //throw new NotImplementedException();
        return (int) users.stream()
                .map(User::getAge)
                .filter(t -> t > 25)
                .count();

    }

    public static List<String> mapToUpperCase(List<String> strings) {
        // throw new NotImplementedException();
        return strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Integer sum(List<Integer> integers) {
        // throw new NotImplementedException();
        return integers.stream()
                .reduce(0, Integer::sum);

    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        //throw new NotImplementedException();
        return integers.stream()
                .skip(toSkip)
                .collect(Collectors.toList());
    }

    public static List<String> getFirstNames(List<String> names) {
        // throw new NotImplementedException();
        return names.stream()
                .map(x -> x.split(" ")[0])
                .collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        //throw new NotImplementedException();
        return names.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static String separateNamesByComma(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .map(User::getName)
                .reduce("", (a, b) -> a + "," + b);
    }

    public static double getAverageAge(List<User> users) {
        // throw new NotImplementedException();
        return users.stream()
                .mapToDouble(User::getAge)
                .average()
                .getAsDouble();

    }

    public static Integer getMaxAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .map(User::getAge)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
    }

    public static Integer getMinAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .map(User::getAge)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale));

    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .collect(groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .collect(Collectors.groupingBy(User::isMale, Collectors.counting()));

    }

    public static boolean anyMatch(List<User> users, int age) {
        //throw new NotImplementedException();
        return users.stream()
                .anyMatch(x -> x.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        //throw new NotImplementedException();
        return users.stream()
                .noneMatch(x -> x.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        //throw new NotImplementedException();
        return users.stream()
                .filter(x -> x.getName().equals(name))
                .findAny();

    }

    public static List<User> sortByAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))//(User x1,User x2)-> x1.getAge()-x2.getAge()
                .collect(Collectors.toList());

    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        //throw new NotImplementedException();
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        //throw new NotImplementedException();
        return IntStream.rangeClosed(2, 100)
                .filter(Streams::isPrime)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        //throw new NotImplementedException();
        Random random = new Random();
        return random.ints()
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .get();

    }

    public static int sumAge(List<User> users) {
        //throw new NotImplementedException();
        return users.stream()
                .mapToInt(User::getAge)
                .sum();
    }

}
