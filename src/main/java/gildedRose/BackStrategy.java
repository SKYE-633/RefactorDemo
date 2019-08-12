package gildedRose;

public class BackStrategy implements Strategy {
    @Override
    public void update(Item item) {
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
}
