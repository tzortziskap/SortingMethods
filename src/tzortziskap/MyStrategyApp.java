/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tzortziskap;

import Sort.BubbleSort;
import Sort.BucketSort;
import Sort.QuickSort;
import java.util.List;
import tzortziskap.model.Cart;
import tzortziskap.model.Tshirt;

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
//        BubbleSort.printByColorInAscedingInBubbleSort(cart.getTshirts());
//        BubbleSort.printByColorInDescedingInBubbleSort(cart.getTshirts());
//
//        BubbleSort.printBySizeInAscedingInBubbleSort(cart.getTshirts());
//        BubbleSort.printBySizeInDescedingInBubbleSort(cart.getTshirts());
//
//        BubbleSort.printByFabricInAscedingInBubbleSort(cart.getTshirts());
//        BubbleSort.printByFabricInDescedingInBubbleSort(cart.getTshirts());
//
//        BubbleSort.printByAllInAscedingInBubbleSort(cart.getTshirts());
//        BubbleSort.printByAllInDescedingInBubbleSort(cart.getTshirts());
//        //End of bubble sort
        //Bucket sort
        BucketSort.myBucketSort(cart.getTshirts(), 7);
        System.out.println("--------------------------------------------------------");

//        //Quick sort
//        QuickSort.printByColorInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//        QuickSort.printByColorInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//
//        QuickSort.printBySizeInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//        QuickSort.printBySizeInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//
//        QuickSort.printByFabricInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//        QuickSort.printByFabricInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//
//        QuickSort.printByAllInAscedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//        QuickSort.printByAllInDescedingInQuickSort(cart.getTshirts(), 0, cart.getTshirts().size() - 1, 0);
//        //End of quick sort

    }
}
