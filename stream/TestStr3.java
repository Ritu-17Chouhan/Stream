package com.rays.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStr3 {
public static void main(String[] args) {
	
	List<String>items = new ArrayList <String>();
	
	items.add("One");
	items.add("Two");
	items.add("Three");
	items.add("Four");
	items.add("Five");
	
	Stream<String>Stream = items.stream();
	
	items.stream().filter(e -> 
	e.startsWith("T")).distinct().map(e ->
	e.toUpperCase()).sorted().forEach(e -> {
	System.out.println(e);
	});
	
}
}
