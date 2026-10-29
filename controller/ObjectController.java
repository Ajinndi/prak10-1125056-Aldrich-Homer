package controller;

import java.util.*;

import model.BelajarPboList;
import model.Box;
import model.Mahasiswa;
import util.PrintUtil;
import view.ObjectView;

public class ObjectController {
    private ObjectView view;

    public ObjectController() {
        view = new ObjectView();
    }

    public void start() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        view.printTitle("list:");
        PrintUtil.printList(numbers);

        Integer[] numberArray = {40, 15, 25};

        view.printTitle("array:");
        PrintUtil.printList(numberArray);

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Aldrich", 1125056));
        mahasiswaList.add(new Mahasiswa("Kang Dedi Mulyadi", 1125544));
        mahasiswaList.add(new Mahasiswa("Kang Solo", 3245678));

        view.printTitle("Printable list:");
        PrintUtil.printPrintableList(mahasiswaList);

        view.printTitle("sort list:");
        PrintUtil.printListSorted(numbers);

        view.printTitle("list stlh sort:");
        PrintUtil.printList(numbers);

        view.printTitle("print sort array:");
        PrintUtil.printListSorted(numberArray);

        view.printTitle("array stlh sort:");
        PrintUtil.printList(numberArray);

        BelajarPboList<Box<Integer>> myList = new BelajarPboList<>();
        myList.add(new Box<>(123));
        myList.add(new Box<>(45));
        myList.add(new Box<>(78));

        view.printTitle("BelajarPboList:");
        myList.printList();

        view.printTitle("BelajarPboList sortd");
        myList.printListSorted();

        view.printTitle("BelajarPboList stlh sort:");
        myList.printList();
    }
}