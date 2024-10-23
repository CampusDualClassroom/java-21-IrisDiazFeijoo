package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> customHSet = new HashSet<>();
        customHSet.add("ELEMENT KPRBC");
        customHSet.add("ELEMENT YPBTM");
        customHSet.add("ELEMENT AADXU");
        customHSet.add("ELEMENT RXCGJ");
        customHSet.add("ELEMENT WYMVD");
        customHSet.add("ELEMENT WFGEJ");
        customHSet.add("ELEMENT TYGBS");
        customHSet.add("ELEMENT MAPTK");
        customHSet.add("ELEMENT GJXVE");
        customHSet.add("ELEMENT BAFGL");

        return customHSet;

    }

    public static Set<String> createTreeSet() {
        Set<String> customTSet = new TreeSet<>();
        customTSet.add("ELEMENT KPRBC");
        customTSet.add("ELEMENT YPBTM");
        customTSet.add("ELEMENT AADXU");
        customTSet.add("ELEMENT RXCGJ");
        customTSet.add("ELEMENT WYMVD");
        customTSet.add("ELEMENT WFGEJ");
        customTSet.add("ELEMENT TYGBS");
        customTSet.add("ELEMENT MAPTK");
        customTSet.add("ELEMENT GJXVE");
        customTSet.add("ELEMENT BAFGL");

        return customTSet;

    }

    private static void printSet(Set<String> customSet) {
        for (String element :  customSet){
            System.out.println(element);
        }

    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);

    }

    public static void main(String[] args) {
        Set<String> mySet = createHashSet();
        System.out.println("Elementos en el HashSet.");
        printSet(mySet);

        Set<String> myTreeSet = createTreeSet();
        System.out.println( "Elementos en el TreeSet. ");
        printSet(myTreeSet);

        String newHasSetElement =  "ELEMENT NEW HASSET";
        boolean wasAddedToHashSet = addElementToSet(mySet, newHasSetElement);

    }

}
