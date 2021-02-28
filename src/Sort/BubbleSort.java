/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.ArrayList;
import java.util.List;
import tzortziskap.model.Tshirt;

/**
 *
 * @author tzortziskapellas
 */
public class BubbleSort {

    private static List<Tshirt> myBubbleSortbyColorInAsceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getColor().compareTo(tShirt.get(j + 1).getColor()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    private static List<Tshirt> myBubbleSortbyColorInDesceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getColor().compareTo(tShirt.get(j + 1).getColor()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    public static void printByColorInDesceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyColorInDesceding(tshirts);
        System.out.println("The T-Shirts by color in descending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printByColorInAsceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyColorInAsceding(tshirts);
        System.out.println("The T-Shirts by color in ascending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }
    
    private static List<Tshirt> myBubbleSortbySizeInAsceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getSize().compareTo(tShirt.get(j + 1).getSize()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    private static List<Tshirt> myBubbleSortbySizeInDesceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getSize().compareTo(tShirt.get(j + 1).getSize()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    public static void printBySizeInDesceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbySizeInDesceding(tshirts);
        System.out.println("The T-Shirts by size in descending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printBySizeInAsceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbySizeInAsceding(tshirts);
        System.out.println("The T-Shirts by size in ascending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }
    
    private static List<Tshirt> myBubbleSortbyFabricInAsceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getFabric().compareTo(tShirt.get(j + 1).getFabric()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    private static List<Tshirt> myBubbleSortbyFabricInDesceding(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getFabric().compareTo(tShirt.get(j + 1).getFabric()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    public static void printByFabricInDesceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyFabricInDesceding(tshirts);
        System.out.println("The T-Shirts by fabric in descending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printByFabricInAsceding(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyFabricInAsceding(tshirts);
        System.out.println("The T-Shirts by fabric in ascending: ");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }
}
