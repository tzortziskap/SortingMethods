/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.List;
import tzortziskap.model.Tshirt;

/**
 *
 * @author tzortziskapellas
 */
public class QuickSort {

    private static int partitionByColorInAscedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private static List<Tshirt> sortByColorInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByColorInAscedingInQuickSort(tShirt, low, high, sortOrder);
            sortByColorInAscedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByColorInAscedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByColorInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByColorInAscedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in ascending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionByColorInDescedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    public static List<Tshirt> sortByColorInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByColorInDescedingInQuickSort(tShirt, low, high, sortOrder);
            sortByColorInDescedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByColorInDescedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByColorInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByColorInDescedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in descending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionBySizeInAscedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private static List<Tshirt> sortBySizeInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionBySizeInAscedingInQuickSort(tShirt, low, high, sortOrder);
            sortBySizeInAscedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortBySizeInAscedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printBySizeInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortBySizeInAscedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in ascending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionBySizeInDescedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    public static List<Tshirt> sortBySizeInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionBySizeInDescedingInQuickSort(tShirt, low, high, sortOrder);
            sortBySizeInDescedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortBySizeInDescedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printBySizeInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortBySizeInDescedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in descending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionByFabricInAscedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private static List<Tshirt> sortByFabricInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByFabricInAscedingInQuickSort(tShirt, low, high, sortOrder);
            sortByFabricInAscedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByFabricInAscedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByFabricInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByFabricInAscedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in ascending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionByFabricInDescedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    public static List<Tshirt> sortByFabricInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByFabricInDescedingInQuickSort(tShirt, low, high, sortOrder);
            sortByFabricInDescedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByFabricInDescedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByFabricInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByFabricInDescedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in descending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int totalOrdinal(Tshirt tshirt) {
        int total;
        total = tshirt.getColor().ordinal() + tshirt.getFabric().ordinal() + tshirt.getSize().ordinal();
        return total;
    }

    private static int partitionByAllInAscedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (totalOrdinal(arr.get(j)) < totalOrdinal(pivot)) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    private static List<Tshirt> sortByAllInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByAllInAscedingInQuickSort(tShirt, low, high, sortOrder);
            sortByAllInAscedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByAllInAscedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByAllInAscedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByAllInAscedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in ascending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }

    private static int partitionByAllInDescedingInQuickSort(List<Tshirt> arr, int low, int high, int sortOrder) {
        Tshirt pivot = arr.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (totalOrdinal(arr.get(j)) > totalOrdinal(pivot)) {
                i++;
                Tshirt temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        Tshirt temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    public static List<Tshirt> sortByAllInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {

        if (low < high) {
            int pi = partitionByAllInDescedingInQuickSort(tShirt, low, high, sortOrder);
            sortByAllInDescedingInQuickSort(tShirt, low, pi - 1, sortOrder);
            sortByAllInDescedingInQuickSort(tShirt, pi + 1, high, sortOrder);
        }
        return tShirt;
    }

    public static void printByAllInDescedingInQuickSort(List<Tshirt> tShirt, int low, int high, int sortOrder) {
        List<Tshirt> tshirts = sortByAllInDescedingInQuickSort(tShirt, low, high, sortOrder);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in descending in quick sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt tshirt : tshirts) {
            System.out.println(tshirt.toString());
        }
    }
}
