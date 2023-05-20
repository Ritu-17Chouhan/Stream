package com.rays.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {
public static void main(String[] args) {
	
List<String>list=new ArrayList<String>();
list.add("One");
list.add("Two");
list.add("Three");
list.add("Four");
list.add("Five");

Stream<String>Stream = list.stream();
Stream.forEach(e -> {
	System.out.println(e + " ");
	});



}
}

