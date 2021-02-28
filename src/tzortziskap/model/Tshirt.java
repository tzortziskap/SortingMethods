package tzortziskap.model;

import UtilClasses.FormatDouble;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tzortziskapellas
 */
public class Tshirt {

    private int id;
    private String name;
    private double price;
    private Color color;
    private Size size;
    private Fabric fabric;
    private static String[] names;
   

    static {
        names = new String[]{"Aloha", "Baseball", "Camp", "Epaulette", "Lumberjack",
            "Granddad", "Golf", "Henley", "Polo", "Tuxedo", "Tunic",
            "Sweatshirt"};
    }

    public Tshirt() {
        name = randomName();
        color = randomColor();
        fabric = randomFabric();
        size = randomSize();
        price = FormatDouble.formatDouble(calculatePrice());
    }

    public Tshirt(String name, double price, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private String randomName() {
        Random random = new Random();
        int arrayLength = names.length;
        int randomNumber = random.nextInt(arrayLength);
        String randomName = names[randomNumber];
        return randomName;
    }

    private Color randomColor() {
        Random random = new Random();
        Color [] colors = Color.values();
        int index = random.nextInt(colors.length);
        Color color = colors[index];
        return color;
    }

    private Size randomSize() {
        Random random = new Random();
        Size [] sizes = Size.values();
        int index = random.nextInt(sizes.length);
        Size size = sizes[index];
        return size;
    }

    private Fabric randomFabric() {
        Random random = new Random();
        Fabric[] fabrics = Fabric.values();
        int index = random.nextInt(fabrics.length);
        Fabric fabric = fabrics[index];
        return fabric;
    }

    private double calculatePrice(){
        int colorOrdinal = color.ordinal() + 1;
        int sizeOrdinal = size.ordinal() + 1;
        int fabricOrdinal = fabric.ordinal() + 1;
        price = 5;
        price += colorOrdinal;
        price = price + (1.5 * sizeOrdinal);
        price = price + (2.0/fabricOrdinal);
        
        return price;
    }
   
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(id).append(") ")
                .append("TShirt:")
                .append("name=").append(name)
                .append(", price=").append(price)
                .append(", color=").append(color)
                .append(", size=").append(size)
                .append(", fabric=").append(fabric);
        return builder.toString();
    }

}
