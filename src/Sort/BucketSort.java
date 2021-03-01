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

    private static int totalOrdinal(Tshirt tshirt) {
        int total;
        total = tshirt.getColor().ordinal() + tshirt.getFabric().ordinal() + tshirt.getSize().ordinal();
        return total;
    }

    public static void myBucketSort(List<Tshirt> tShirt, int n) {
       
        List<Tshirt>[] bucket = new List[n];
             
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Tshirt>();
        }
        int index;
        for (int i = 0; i < tShirt.size(); i++) {
            index= tShirt.get(i).getColor().ordinal();
            bucket[index].add(tShirt.get(i));
        }
       int counter=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                tShirt.set(counter, bucket[i].get(j));
                counter++;
            }
        }
        for (Tshirt t : tShirt){
            System.out.println(t.toString());
        }
    }  
}

