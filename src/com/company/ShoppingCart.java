package com.company;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<groceryItem> groceryItems;

    public ShoppingCart()
    {
        groceryItems = new ArrayList<groceryItem>();

    }

    public void addGroceryItem(groceryItem toAdd)
    {
        this.groceryItems.add(toAdd);
    }

    public double getTotal()
    {
        double totalPrice = 0;
        for(groceryItem g: groceryItems)
        {
            totalPrice+=g.getPrice();
        }

        return totalPrice;
    }

    public String displayItems()
    {
        String toDisplay="";

        for(groceryItem g: groceryItems)
        {
            toDisplay+=g.getName()+"                "+g.getPrice()+"\n";
        }

        return toDisplay;

    }
}