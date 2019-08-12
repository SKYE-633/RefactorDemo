package gildedRose;

public class Item {
    public static final String AGED = "Aged Brie";
    public static final String BACK = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFUR = "Sulfuras, Hand of Ragnaros";

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int sellIn;

    public int quality;

    private Strategy strategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if(name.equals(AGED)) {
            this.strategy = new AgedStrategy();
            return;
        }
        if(name.equals(BACK)){
            this.strategy = new BackStrategy();
            return;
        }
        if(name.equals(SULFUR)){
            this.strategy = new SulfurStrategy();
            return;
        }
        this.strategy = new OtherStrategy();
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void update(){
        this.strategy.update(this);
    }

}
