package com.rays.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStr1 {
public static void main(String[] args) {
	
List<String>items = new ArrayList<String>();
items.add("One");
items.add("Two");
items.add("Three");
items.add("Four");
items.add("Five");

   Stream<String>Stream =   items.stream();
   items.stream().sorted().forEach(e ->{
	   System.out.println(e);});


	

}
}





