package com.skoti.books.concepts.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparatorConcepts {

    public static void main(String[] args) {

        Set integerTreeSet = new TreeSet(new IntegerComparator());
        integerTreeSet.add(5);
        integerTreeSet.add(3);
        integerTreeSet.add(7);
        integerTreeSet.add(2);
        integerTreeSet.add(10);

        System.out.println("Custom sorting for Integers");
        System.out.println(integerTreeSet);

        Set naturalSortingTreeSet = new TreeSet();
        naturalSortingTreeSet.add(5);
        naturalSortingTreeSet.add(3);
        naturalSortingTreeSet.add(7);
        naturalSortingTreeSet.add(2);
        naturalSortingTreeSet.add(10);

        System.out.println("Natural sorting for Integers");
        System.out.println(naturalSortingTreeSet);

        Set stringTreeSet = new TreeSet(new StringComparator());
        stringTreeSet.add("Shashi");
        stringTreeSet.add("Kumar");
        stringTreeSet.add("Zeeshan");
        stringTreeSet.add("Abhi");
        stringTreeSet.add("Ram");

        System.out.println("Custom sorting for Strings");
        System.out.println(stringTreeSet);

        Set stringTreeSet2 = new TreeSet();
        stringTreeSet2.add("Shashi");
        stringTreeSet2.add("Kumar");
        stringTreeSet2.add("Zeeshan");
        stringTreeSet2.add("Abhi");
        stringTreeSet2.add("Ram");

        System.out.println("Natural sorting for Strings");
        System.out.println(stringTreeSet2);

    }
}

class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return num2.compareTo(num1);
    }
}


class StringComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}
