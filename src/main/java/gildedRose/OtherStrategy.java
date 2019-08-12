package gildedRose;

public class OtherStrategy implements Strategy {
    @Override
    public void update(Item item) {
        if(item.getSellIn() < 1){
            item.setQuality(Math.max(item.getQuality() - 2, 0));
        }else{
            item.setQuality(Math.max(item.getQuality() - 1, 0));
        }
        item.setSellIn(item.getSellIn()-1);
    }
}
