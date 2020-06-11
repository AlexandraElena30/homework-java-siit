package com.siit.homeworks.homework11.exercise03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WallStreet {


    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );


    public List<Transaction> sortByYear(List<Transaction> transactions) {

        return transactions.stream()
                .filter(t -> t.getYear() == 2011).collect(Collectors.toList());
    }

    public List<String> uniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .filter(distinctByKey(b -> b.getTrader().getCity()))
                .sorted(Comparator.comparing(n -> n.getTrader().getCity()))
                .map(x -> x.getTrader().getCity())
                .collect(Collectors.toList());
    }

    public List<Trader> cambridgeTraders(List<Transaction> transactions) {
        return transactions.stream()
                .filter(e -> e.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(n -> n.getTrader().getName()))
                .filter(distinctByKey(b -> b.getTrader().getName()))
                .map(Transaction::getTrader)
                .collect(Collectors.toList());

    }

    public List<Trader> tradersNameSorted(List<Transaction> transactions) {
        return transactions.stream()
                .filter(distinctByKey(b -> b.getTrader().getName()))
                .sorted(Comparator.comparing(n -> n.getTrader().getName()))
                .map(Transaction::getTrader)
                .collect(Collectors.toList());
    }

    public boolean basedInMilan(List<Transaction> transactions) {
        return transactions.stream()
                .filter(n -> n.getTrader().getCity().startsWith("Milan"))
                .filter(distinctByKey(b -> b.getTrader().getName()))
                .map(Transaction::getTrader)
                .findAny()
                .isPresent();
    }

    public List<Integer> tradersValueCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .filter(n -> n.getTrader().getCity().startsWith("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

    }

    public int highestValue(List<Transaction> transactions) {
        return transactions.stream()
                .min((s1, s2) -> s2.getValue() - s1.getValue())
                .get()
                .getValue();


    }

    public int smallestValue(List<Transaction> transactions) {
        return transactions.stream()
                .min((s1, s2) -> s1.getValue() - s2.getValue())
                .get()
                .getValue();

    }

    //    public static void main(String... args) {
//        System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high).");
//        transactions.stream()
//                .filter(t -> t.getYear() == 2011)
//                .forEachOrdered(x -> System.out.println(x));
//        System.out.println("=================================================");
//
//        System.out.println("2. What are all the unique cities where the traders work?");
//        transactions.stream()
//                .filter(distinctByKey(b -> b.getTrader().getCity()))
//                .sorted(Comparator.comparing(n -> n.getTrader().getCity()))
//                .forEach(x -> System.out.print(x.getTrader().getCity() + " "));
//        System.out.println("\n=================================================");
//
//        System.out.println("3. Find all traders from Cambridge and sort them by name.");
//        transactions.stream()
//                .filter(e -> e.getTrader().getCity().equals("Cambridge"))
//                .sorted(Comparator.comparing(n -> n.getTrader().getName()))
//                .forEachOrdered(x -> System.out.println("Sorted by Cambridge city: " + x));
//        System.out.println("=================================================");
//
//
//        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");
//        transactions.stream()
//                .filter(distinctByKey(b -> b.getTrader().getName()))
//                .sorted(Comparator.comparing(n -> n.getTrader().getName()))
//                .forEach(x -> System.out.print(x.getTrader().getName() + " "));
//        System.out.println("\n=================================================");
//
//        System.out.println("5. Are any traders based in Milan?");
//        transactions.stream()
//                .filter(n -> n.getTrader().getCity().startsWith("Milan"))
//                .filter(distinctByKey(b -> b.getTrader().getName()))
//                .forEach(x -> System.out.print(x.getTrader() + " "));
//        System.out.println("\n=================================================");
//
//        System.out.println("6. Print all transactions’ values from the traders living in Cambridge.");
//        transactions.stream()
//                .filter(n -> n.getTrader().getCity().startsWith("Cambridge"))
//                .forEach(x -> System.out.print(x.getValue() + " "));
//        System.out.println("\n=================================================");
//
//        System.out.println("7. What’s the highest value of all the transactions?");
//        transactions.stream()
//                .min((s1, s2) -> s2.getValue() - s1.getValue())
//                .ifPresent(x -> System.out.println(x.getValue()));
//        System.out.println("=================================================");
//
//        System.out.println("8. Find the transaction with the smallest value.");
//        transactions.stream()
//                .min((s1, s2) -> s1.getValue() - s2.getValue())
//                .ifPresent(x -> System.out.println(x.getValue()));
//        System.out.println("=================================================");
//    }
//
    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}