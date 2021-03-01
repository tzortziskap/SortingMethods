/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap;

import Sort.BubbleSort;
import Sort.BucketSort;
import Sort.QuickSort;
import tzortziskap.model.Cart;

/**
 *
 * @author tzortziskapellas
 */
public class MyStrategyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cart cart = Cart.getCart();
        cart.fillTshirts(40);
        cart.printTshirts();
        cart.payTotal();

        //Bubble sort
        BubbleSort.printByColorInAscedingInBubbleSort(cart.getTshirts());
        long startimeBubbleSingleSort = System.currentTimeMillis();
        BubbleSort.printByColorInDescedingInBubbleSort(cart.getTshirts());
        long endtimeBubbleSingleSort = System.currentTimeMillis();
        long durationBubbleSingleSort = endtimeBubbleSingleSort - startimeBubbleSingleSort;

        BubbleSort.printBySizeInAscedingInBubbleSort(cart.getTshirts());
        BubbleSort.printBySizeInDescedingInBubbleSort(cart.getTshirts());

        BubbleSort.printByFabricInAscedingInBubbleSort(cart.getTshirts());
        BubbleSort.printByFabricInDescedingInBubbleSort(cart.getTshirts());

        BubbleSort.printByAllInAscedingInBubbleSort(cart.getTshirts());
        long startimeBubbleMultiplySort = System.currentTimeMillis();
        BubbleSort.printByAllInDescedingInBubbleSort(cart.getTshirts());
        long endtimeBubbleMultiplySort = System.currentTimeMillis();
        long durationBubbleMultiplySort = endtimeBubbleMultiplySort - startimeBubbleMultiplySort;

        //End of bubble sort
        

        //Bucket sort
        int maxValue = 7;
        
        BucketSort.sortByColorInAscedingInBucketSort(cart.getTshirts(), maxValue);
        long startimeBucketSingleSort = System.currentTimeMillis();
        BucketSort.sortByColorInDescedingInBucketSort(cart.getTshirts(), maxValue);
        long endtimeBucketSingleSort = System.currentTimeMillis();
        long durationBucketSingleSort = endtimeBucketSingleSort - startimeBucketSingleSort;

        BucketSort.sortBySizeInAscedingInBucketSort(cart.getTshirts(), maxValue);
        BucketSort.sortBySizeInDescedingInBucketSort(cart.getTshirts(), maxValue);

        BucketSort.sortByFabricInAscedingInBucketSort(cart.getTshirts(), maxValue);
        BucketSort.sortByFabricInDescedingInBucketSort(cart.getTshirts(), maxValue);
        
        BucketSort.sortByAllInAscedingInBucketSort(cart.getTshirts(), maxValue);
        long startimeBucketMultipleSort = System.currentTimeMillis();
        BucketSort.sortByAllInDescedingInBucketSort(cart.getTshirts(), maxValue);
        long endtimeBucketMultipleSort = System.currentTimeMillis();
        long durationBucketMultipleSort = endtimeBucketMultipleSort - startimeBucketMultipleSort;

        //End of bucket sort
        
        //Quick sort

        QuickSort.printByColorInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        long startimeQuickSingleSort = System.currentTimeMillis();
        QuickSort.printByColorInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        long endtimeQuickSingleSort = System.currentTimeMillis();
        long durationQuickSingleSort = endtimeQuickSingleSort - startimeQuickSingleSort;

        QuickSort.printBySizeInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        QuickSort.printBySizeInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);

        QuickSort.printByFabricInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        QuickSort.printByFabricInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);

        QuickSort.printByAllInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        long startimeQuickMultipleSort = System.currentTimeMillis();
        QuickSort.printByAllInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
        long endtimeQuickMultipleSort = System.currentTimeMillis();
        long durationQuickMultipleSort = endtimeQuickMultipleSort - startimeQuickMultipleSort;

        //End of quick sort
        
        System.out.println("--------------------------------------------------------");
        System.out.println("Bubble Single Sort Duration---------> " + durationBubbleSingleSort);
        System.out.println("Bubble Multiple Sort Duration---------> " + durationBubbleMultiplySort);
        System.out.println("Bucket Single Sort Duration---------> " + durationBucketSingleSort);
        System.out.println("Bucket Multiple Sort Duration---------> " + durationBucketMultipleSort);
        System.out.println("Quick Single Sort Duration---------> " + durationQuickSingleSort);
        System.out.println("Quick Multiple Sort Duration---------> " + durationQuickMultipleSort);
        System.out.println("--------------------------------------------------------");
    }
}
