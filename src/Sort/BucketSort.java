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
        // Create bucket array
        List<Integer>[] bucket = new List[ n + 1 ];
        // Associate a list with each index 
        // in the bucket array         
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
        // Assign numbers from array to the proper bucket
        // by using hashing function
        for (int i = 0; i < tShirt.size(); i++) {
            //System.out.println("hash- " + hash(num));
            bucket[i].add(tShirt.get(i).getColor().ordinal());
        }
       int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i].size(); j++) {
                tShirt.set(index++, bucket[i].get(j));
            }
        }
        for (Tshirt t : tShirt){
            System.out.println(t.toString());
        }
    }  
}

