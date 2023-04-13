package chap_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> stream = Arrays.stream(langs);

        List<String> langList = new ArrayList();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // 스트림사용
        // 중간연산(intermediate operation) : filter, map, sorted, distinct, skip, ...
        // 최종연산(terminal operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        Arrays.stream(scores).filter((x -> x >= 90)).forEach(System.out::println);
        System.out.println("------------------------------------------");

        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println("count = " + count);

        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);

        Arrays.stream(langs).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("================================");
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("================================");
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).sorted().forEach(System.out::println);

        boolean yn = langList.stream().filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println("yn = " + yn);

        boolean yn2 = langList.stream().filter(x -> x.length() <= 4).allMatch(x -> x.contains("c"));
        System.out.println("yn2 = " + yn2);
        System.out.println("================================");

        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).map(x -> x.concat("어려워요")).forEach(System.out::println);
        System.out.println("================================");

        langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("================================");

        List<String> c = langList.stream().filter(x -> x.contains("c")).map(String::toUpperCase).collect(Collectors.toList());

        c.stream().forEach(System.out::println);


    }
}
