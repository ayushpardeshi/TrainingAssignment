package com;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Compare implements Comparator<String>{
    @Override
    public int compare(String a, String b){
        return a.compareTo(b);
    }
}
public class SortMaps {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(new Compare());
        map.put("Ayush", "Computers");
        map.put("Vikas","Mechanical");
        map.put("Rohit", "Electornics");
        map.forEach((k,v)-> System.out.println(k +" "+v));
    }
}