package com.cg.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
public static void main(String[] args) {
	//No guaranty of order .....
	HashMap<String, String> map1= new HashMap<String, String>();
	map1.put("SBC", "Bangalore");
	map1.put("MMCT", "Mumbai Central");
	map1.put("BSB", "Varanasi");
	map1.put("MAS", "Chennai Central");
	System.out.println(map1);
	map1.put("SBC", "Bengaluru"); //overwrites .....
	System.out.println(map1);
	String city=map1.get("MAS");
	System.out.println(city);
	
	
   boolean b=map1.containsKey("BSB");
   System.out.println(b);
   
	//try for TreeMap and LinkedHashMap
  	Set<String> keys=  map1.keySet();
  	System.out.println("-------iterating key---------");
  	for(String k:keys) {
  		System.out.println(k);
  	}
Collection<String>values=map1.values();
System.out.println("-------iterating value--------");
for(String v:values) {
	System.out.println(v);
}

Set<Entry<String, String>>  rows=  map1.entrySet();
	System.out.println("**************");
System.out.println("Key -----------Value");
for(Entry<String, String> row :rows) {
	String k=row.getKey();
	String v=row.getValue();
	System.out.println(k+"---------"+v);
}
}
}
