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

    private static List<Tshirt> myBubbleSortbyColorInAscedingInBubbleSort(List<Tshirt> tShirt) {
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

    private static List<Tshirt> myBubbleSortbyColorInDescedingInBubbleSort(List<Tshirt> tShirt) {
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

    public static void printByColorInDescedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyColorInDescedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in descending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printByColorInAscedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyColorInAscedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in ascending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    private static List<Tshirt> myBubbleSortbySizeInAscedingInBubbleSort(List<Tshirt> tShirt) {
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

    private static List<Tshirt> myBubbleSortbySizeInDescedingInBubbleSort(List<Tshirt> tShirt) {
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

    public static void printBySizeInDescedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbySizeInDescedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in descending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printBySizeInAscedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbySizeInAscedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in ascending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    private static List<Tshirt> myBubbleSortbyFabricInAscedingInBubbleSort(List<Tshirt> tShirt) {
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

    private static List<Tshirt> myBubbleSortbyFabricInDescedingInBubbleSort(List<Tshirt> tShirt) {
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

    public static void printByFabricInDescedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyFabricInDescedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in descending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printByFabricInAscedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyFabricInAscedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in ascending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    private static List<Tshirt> myBubbleSortbyAllInAscedingInBubbleSort(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getSize().compareTo(tShirt.get(j + 1).getSize()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                } else if (tShirt.get(j).getSize().equals(tShirt.get(j + 1).getSize())
                        && tShirt.get(j).getColor().compareTo(tShirt.get(j + 1).getColor()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                } else if (tShirt.get(j).getSize().equals(tShirt.get(j + 1).getSize())
                        && tShirt.get(j).getColor().equals(tShirt.get(j + 1).getColor())
                        && tShirt.get(j).getFabric().compareTo(tShirt.get(j + 1).getFabric()) > 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    private static List<Tshirt> myBubbleSortbyAllInDescedingInBubbleSort(List<Tshirt> tShirt) {
        List<Tshirt> tmpShirt = new ArrayList<Tshirt>();
        for (int i = 1; i < tShirt.size(); i++) {
            for (int j = 0; j < tShirt.size() - i; j++) {
                if (tShirt.get(j).getSize().compareTo(tShirt.get(j + 1).getSize()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                } else if (tShirt.get(j).getSize().equals(tShirt.get(j + 1).getSize())
                        && tShirt.get(j).getColor().compareTo(tShirt.get(j + 1).getColor()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                } else if (tShirt.get(j).getSize().equals(tShirt.get(j + 1).getSize())
                        && tShirt.get(j).getColor().equals(tShirt.get(j + 1).getColor())
                        && tShirt.get(j).getFabric().compareTo(tShirt.get(j + 1).getFabric()) < 0) {
                    tmpShirt.add(tShirt.get(j + 1));
                    tShirt.set(j + 1, tShirt.get(j));
                    tShirt.set(j, tmpShirt.get(0));
                    tmpShirt.remove(0);
                }
            }
        }
        return tShirt;
    }

    public static void printByAllInDescedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyAllInDescedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in descending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }

    public static void printByAllInAscedingInBubbleSort(List<Tshirt> tshirts) {
        tshirts = myBubbleSortbyAllInAscedingInBubbleSort(tshirts);
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in ascending in bubble sort: ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < tshirts.size(); i++) {
            System.out.println(tshirts.get(i).toString());
        }
    }
}
