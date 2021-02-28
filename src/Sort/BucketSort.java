/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tzortziskap.model.Tshirt;

/**
 *
 * @author tzortziskapellas
 */
public class BucketSort {

    public static void myBucketSort(List<Tshirt> tShirt, int n) {
        if (n <= 0) {
            return;
        }

        List<Tshirt>[] bucket = new ArrayList[n];
        

        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Tshirt>();
        }
        for (int i = 0; i < n; i++) {
            int ordinal = tShirt.get(i).getColor().ordinal() * n;
            bucket[ordinal].add(tShirt.get(i));
        }
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                tShirt.set(index++, bucket[i].get(j));
            }
        }
        
        for (int k = 0; k < tShirt.size(); k++) {
            System.out.println(k + "  " + "Sorted B->" + tShirt.get(k).toString());
        }

    }

}
