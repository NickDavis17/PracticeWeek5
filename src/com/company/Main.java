package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("a", "candy");
        System.out.println(mapBully(map));
        map.clear();

        map.put("a", "candy");
        map.put("b", "dirt");
        System.out.println(mapBully(map));
        map.clear();

        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c","meh");
        System.out.println(mapBully(map));
        map.clear();
        


    }

    static Map<String, String> mapBully(Map<String, String> map){
        if (map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");

        }

        return map;
    }
}
