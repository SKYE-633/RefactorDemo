
package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void should_return_right_items_when_give_Aged_and_s_and_q_1(){
        Item[] items = new Item[]{new Item("Aged Brie",49,1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 47, 3",gildedRose.items[0].toString());
    }
    @Test
    public void should_return_right_items_when_give_Aged_and_s_and_q_2(){
        Item[] items = new Item[]{new Item("Aged Brie",2,49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 0, 50",gildedRose.items[0].toString());
    }
    @Test
    public void should_return_right_items_when_give_Back_and_s_and_q_1(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",5,2)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 5",gildedRose.items[0].toString());
    }
    @Test
    public void should_return_right_items_when_give_Back_and_s_and_q_2(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",10,48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50",gildedRose.items[0].toString());

    }
    @Test
    public void should_return_right_items_when_give_Back_and_s_and_q_3(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",12,48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 11, 49",gildedRose.items[0].toString());

    }
    @Test
    public void should_return_right_items_when_give_Back_and_s_and_q_4(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",48,48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 47, 49",gildedRose.items[0].toString());

    }
    @Test
    public void should_return_right_items_when_give_Sulf_and_s_and_q_1(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",47,2)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 47, 2",gildedRose.items[0].toString());
    }
    @Test
    public void should_return_right_items_when_give_Sulf_and_s_and_q_2(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",12,44)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        //System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 12, 44",gildedRose.items[0].toString());
    }

}

