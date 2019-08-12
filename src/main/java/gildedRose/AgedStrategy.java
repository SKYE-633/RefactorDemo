package gildedRose;

public class AgedStrategy implements Strategy {
    @Override
    public void update(Item item) {
            if (item.getSellIn() < 1) {
                item.setQuality(Math.min(item.getQuality() + 2, 50));
            }else{
                item.setQuality(Math.min(item.getQuality() + 1, 50));
            }
            item.setSellIn(item.getSellIn()-1);
    }
}

