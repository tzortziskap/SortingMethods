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
public class BucketSort {

    private static int totalOrdinal(Tshirt tshirt) {
        int total;
        total = tshirt.getColor().ordinal() + tshirt.getFabric().ordinal() + tshirt.getSize().ordinal();
        return total;
    }

    private static List<Tshirt>[] splitTheObjectsByColor(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = new List[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Tshirt>();
        }
        int index;
        for (int i = 0; i < tShirt.size(); i++) {
            index = tShirt.get(i).getColor().ordinal();
            bucket[index].add(tShirt.get(i));
        }
        return bucket;
    }

    public static void sortByColorInAscedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();
        List<Tshirt>[] bucket = splitTheObjectsByColor(tShirt, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                newTshirt.add(bucket[i].get(j));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in ascending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    public static void sortByColorInDescedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = splitTheObjectsByColor(tShirt, n);
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();

        for (int i = n; i > 0; i--) {
            for (int j = bucket[i - 1].size(); j > 0; j--) {
                newTshirt.add(bucket[i - 1].get(j - 1));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by color in descending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    private static List<Tshirt>[] splitTheObjectsBySize(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = new List[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Tshirt>();
        }
        int index;
        for (int i = 0; i < tShirt.size(); i++) {
            index = tShirt.get(i).getSize().ordinal();
            bucket[index].add(tShirt.get(i));
        }
        return bucket;
    }

    public static void sortBySizeInAscedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();
        List<Tshirt>[] bucket = splitTheObjectsBySize(tShirt, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                newTshirt.add(bucket[i].get(j));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in ascending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    public static void sortBySizeInDescedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = splitTheObjectsBySize(tShirt, n);
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();

        for (int i = n; i > 0; i--) {
            for (int j = bucket[i - 1].size(); j > 0; j--) {
                newTshirt.add(bucket[i - 1].get(j - 1));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by size in descending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    private static List<Tshirt>[] splitTheObjectsByFabric(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = new List[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Tshirt>();
        }
        int index;
        for (int i = 0; i < tShirt.size(); i++) {
            index = tShirt.get(i).getFabric().ordinal();
            bucket[index].add(tShirt.get(i));
        }
        return bucket;
    }

    public static void sortByFabricInAscedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();
        List<Tshirt>[] bucket = splitTheObjectsByFabric(tShirt, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                newTshirt.add(bucket[i].get(j));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in ascending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    public static void sortByFabricInDescedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt>[] bucket = splitTheObjectsByFabric(tShirt, n);
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();

        for (int i = n; i > 0; i--) {
            for (int j = bucket[i - 1].size(); j > 0; j--) {
                newTshirt.add(bucket[i - 1].get(j - 1));
            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by fabric in descending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    private static List<Tshirt>[][][] splitTheObjectsByAll(List<Tshirt> tShirt, int n) {
        List<Tshirt>[][][] bucket = new List[n][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    bucket[i][j][k] = new ArrayList<Tshirt>();
                }

            }

        }
        int size;
        int color;
        int fabric;
        for (int i = 0; i < tShirt.size(); i++) {
            size = tShirt.get(i).getSize().ordinal();
            color = tShirt.get(i).getColor().ordinal();
            fabric = tShirt.get(i).getFabric().ordinal();
            bucket[size][color][fabric].add(tShirt.get(i));
        }
        return bucket;
    }

    public static void sortByAllInAscedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();
        List<Tshirt>[][][] bucket = splitTheObjectsByAll(tShirt, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < bucket[i][j][k].size(); l++) {
                        newTshirt.add(bucket[i][j][k].get(l));
                    }

                }

            }
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in ascending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

    public static void sortByAllInDescedingInBucketSort(List<Tshirt> tShirt, int n) {
        List<Tshirt>[][][] bucket = splitTheObjectsByAll(tShirt, n);
        List<Tshirt> newTshirt = new ArrayList<Tshirt>();
        
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                for (int k = n; k > 0; k--) {
                    for (int l = bucket[i-1][j-1][k-1].size(); l > 0; l--) {
                        newTshirt.add(bucket[i-1][j-1][k-1].get(l-1));
                    }

                }

            }
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("The T-Shirts by all in descending in bucket sort:");
        System.out.println("--------------------------------------------------------");
        for (Tshirt t : newTshirt) {
            System.out.println(t.toString());
        }
    }

}
