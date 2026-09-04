package com.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApplication {

	public static void main(String[] args) {
		// SpringApplication.run(StreamApplication.class, args);

		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add("To");
		list.add("Java");

		List<String> stream = list.stream().sorted().collect(Collectors.toList());
		stream.forEach(System.out::println);

		Set<String> set = list.stream().filter("Hello"::equals).collect(Collectors.toSet());
		set.forEach(System.out::println);

		List<String> list2 = list.stream().filter(s-> s.contains("hello")).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

}
