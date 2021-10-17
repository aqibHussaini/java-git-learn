package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("this is my first java project with git and intelij by dev1!!");
        System.out.println("hello pakistan!!!");
        SUM();
        subtract();
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("name","ali");
        hashMap.put("age","20");
        hashMap.put("class","mcs");
        Iterator iterator= hashMap.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry=(Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
        hashMap.forEach((key,v)->{
            System.out.println(key+" = "+v);
        });
        System.out.println("main about to end");
        System.out.println("main end");
    }
    public static void SUM()
    {
        int value=10,b=20;
        System.out.println("sum = "+value+b);
    }
    public static void subtract()
    {
        int value=10,b=20;
        System.out.println("subtract = "+(value-b));
    }
}
