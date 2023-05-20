package com.rays.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStr2 {
	public static void main(String[] args) {
 List<String>items = new ArrayList<String>();
 
 items.add("Mango");
 items.add("banana");
 items.add("orange");
 items.add("kewi");
 items.add("Apple");
 
 Stream<String>Stream  = items.stream();
 items.stream().map(e ->
 e.toUpperCase()).forEach(e ->{
	 System.out.println(e);
 });
	 
 }
 
 
	}


