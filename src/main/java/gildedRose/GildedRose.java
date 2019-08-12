package gildedRose;

public class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }


    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")) {
                keepAgedBrie(items[i]);
                continue;
            }
            if (items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                continue;
            }
            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                keepBackstage(items[i]);
                continue;
            }
            keepOtherMethod(items[i]);
        }
    }

    private void keepOtherMethod(Item item) {
        if(item.sellIn < 1){
            item.quality = Math.max(item.quality-2,0);
        }else{
            item.quality = Math.max(item.quality-1,0);
        }
        item.sellIn--;
    }
    private void keepBackstage(Item item) {
        if(item.sellIn < 1){
            item.quality = 0;
        }
        if(item.sellIn >= 1 && item.sellIn < 6){
            item.quality = Math.min(item.quality+3,50);
        }
        if(item.sellIn >=6 && item.sellIn < 11){
            item.quality = Math.min(item.quality+1,50);
        }
        if(item.sellIn >= 11){
            item.quality = Math.min(item.quality+1,50);
        }
        item.sellIn--;
    }

    private void keepAgedBrie(Item item) {
        if (item.getSellIn() < 1) {
            item.quality = Math.min(item.quality + 2, 50);
        }else{
            item.quality = Math.min(item.quality + 1, 50);
        }
        item.sellIn--;
    }
}