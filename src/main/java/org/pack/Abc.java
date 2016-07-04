package org.pack;

import java8.util.stream.StreamSupport;

import java.util.Arrays;
import java.util.List;//
//import java.util.stsream.Stream;

public class Abc {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Waldinar", "Oliveira", "Neto");

        //Stream.of(list);

        StreamSupport.stream(list)
                .filter(t -> !t.startsWith("O"))
                .forEach(System.out::println);
    }
}
