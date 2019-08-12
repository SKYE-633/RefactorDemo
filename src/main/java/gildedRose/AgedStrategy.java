package gildedRose;

public class AgedStrategy implements Strategy {
    @Override
    public void update(Item item) {
            if (item.getSellIn() < 1) {
                item.quality = Math.min(item.quality + 2, 50);
            }else{
                item.quality = Math.min(item.quality + 1, 50);
            }
            item.sellIn--;
    }
}

