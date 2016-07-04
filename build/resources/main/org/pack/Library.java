package org.pack;

import java.util.Arrays;
import java.util.List;
//       import         j ava.util.stream.Stream;

import java8.util.stream.StreamSupport;

public class Library {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Waldinar", "Oliveira", "Neto");

//        Stream.of(list);
        list.stream().forEach(System.out::println);

        StreamSupport.stream(list)
                .filter(t -> !t.startsWith("O"))
                .forEach(System.out::println);
    }
}
