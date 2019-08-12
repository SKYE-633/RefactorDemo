package gildedRose;

public class BackStrategy implements Strategy {
    @Override
    public void update(Item item) {
        if(item.getSellIn() < 1){
            item.setQuality(0);
        }
        if(item.getSellIn() >= 1 && item.getSellIn() < 6){
            item.setQuality(Math.min(item.getQuality() + 3, 50));
        }
        if(item.getSellIn() >=6 && item.getSellIn() < 11){
            item.setQuality(Math.min(item.getQuality() + 1, 50));
        }
        if(item.getSellIn() >= 11){
            item.setQuality(Math.min(item.getQuality() + 1, 50));
        }
        item.setSellIn(item.getSellIn()-1);
    }
}
