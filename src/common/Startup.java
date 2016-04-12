package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Startup {

    public static void main(String[] args) {
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
        
        Employee e1 = new Employee("Hedding", "Joel", "111-11-1111");
        Employee e2 = new Employee("Jones", "James", "222-22-2222");
        Employee e3 = new Employee("Smith", "Bob", "222-22-2222");
        Employee e4 = new Employee("Chang", "David", "333-33-3333");
        
        Map<String,Employee> employees = new HashMap<>();
        employees.put(e1.getSsn(), e1);
        employees.put(e2.getSsn(), e2);
        employees.put(e3.getSsn(), e3);
        employees.put(e4.getSsn(), e4);
        
        Employee retrieved = employees.get("333-33-3333");
        
        
        // looping through with keys
        Set<String> ekeys = employees.keySet();
        
        for (String key : ekeys) {
            Employee e = employees.get(key);
            System.out.println(e);
        }
        
        // looping through with values
        Collection<Employee> empColl = employees.values();
        
        for (Employee e : empColl) {
            System.out.println(e);
        }
        
        Map<String,Employee> empMap = new TreeMap<>();
        empMap.put(e1.getSsn(), e1);
        empMap.put(e2.getSsn(), e2);
        empMap.put(e3.getSsn(), e3);
        empMap.put(e4.getSsn(), e4);
        
        Set<Employee> empSet = new TreeSet<>();
        empSet.add(e1);
        empSet.add(e2);
        empSet.add(e3);
        empSet.add(e4);
        
        for (Employee e : empSet) {
            System.out.println(e);
        }
        
        
    }
}
