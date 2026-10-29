package util;

import java.util.*;

import model.Printable;

public final class PrintUtil {

    private PrintUtil() {
    }

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        for (T item : list) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(List<T> list) {
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        for (T item : sortedList) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] array) {
        List<T> sortedList = new ArrayList<>(Arrays.asList(array));
        Collections.sort(sortedList);

        for (T item : sortedList) {
            System.out.println(item);
        }
    }
}