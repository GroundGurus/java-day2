package com.groundgurus.day2;

import java.util.Scanner;

public class ShopMain {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Define the shop and it's items
    Shop goldilocks = new Shop();
    goldilocks.name = "Goldilocks";
    goldilocks.addItem(new Item("Cheese Cake"));
    goldilocks.addItem(new Item("Vanilla Cake"));

    // find an item
    System.out.print("Enter item name: ");
    String toSearch = input.nextLine();
    Item itemSearched = goldilocks.findByItemName(toSearch);
    System.out.println("Found = " + itemSearched.name);
  }
}
