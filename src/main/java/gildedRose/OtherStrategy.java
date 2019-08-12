package gildedRose;

public class OtherStrategy implements Strategy {
    @Override
    public void update(Item item) {
        if(item.sellIn < 1){
            item.quality = Math.max(item.quality-2,0);
        }else{
            item.quality = Math.max(item.quality-1,0);
        }
        item.sellIn--;
    }
}
