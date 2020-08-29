package com.groundgurus.day2;

// Go to definition, press Ctrl+b
public class Shop {
  String name;
  Item[] items = new Item[10]; // empty array
  int count; // 0

  public void addItem(Item item) {
    items[count] = item;
    count++;
  }

  public Item findByItemName(String name) {
    for (Item item : items) {
      if (item != null &&
          item.name.toLowerCase().startsWith(name.toLowerCase())) {
        return item;
      }
    }

    return null;
  }
}
