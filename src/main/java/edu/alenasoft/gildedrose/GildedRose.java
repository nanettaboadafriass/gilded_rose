package edu.alenasoft.gildedrose;

import static edu.alenasoft.gildedrose.UpdaterFactory.updaterFor;

import java.util.ArrayList;
import java.util.List;

class GildedRose {

  public static List<Item> items = new ArrayList<>();

  public GildedRose(List<Item> items) {
    this.items = items;
  }

  public static void updateQuality() {
    items.forEach(item ->
            {
              Updater updaterFactory = updaterFor(item);
              updaterFactory.update(item);
              System.out.println(item.toString());
            }
    );
  }
}
