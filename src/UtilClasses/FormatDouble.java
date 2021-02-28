/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilClasses;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import tzortziskap.model.Cart;

/**
 *
 * @author tzortziskapellas
 */
public class FormatDouble {
    
    private static FormatDouble formatDouble;
    
    private FormatDouble(){
        
    }

     public static FormatDouble getFormatDouble() {
        if (formatDouble == null) {
            formatDouble = new FormatDouble();
        }
        return formatDouble;
    }
     
     public static double formatDouble(double price){
         DecimalFormat df2 = new DecimalFormat("##.##");
         df2.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ENGLISH));
         price = Double.parseDouble(df2.format(price));
         return price;
     }
}
