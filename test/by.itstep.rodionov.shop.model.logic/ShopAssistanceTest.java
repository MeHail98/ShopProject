package by.itstep.rodionov.shop.model.logic;

import by.itstep.rodionov.shop.model.entity.Milk;
import by.itstep.rodionov.shop.model.entity.Orange;
import by.itstep.rodionov.shop.model.entity.container.Basket;
import org.junit.Assert;
import org.junit.Test;

public class ShopAssistanceTest {

    @Test
    public void calcTotalPriceTest(){
        Orange orange = new Orange(200, 3000, 4.5);
        Orange orange1 = new Orange(100, 2000, 4);

        Milk milk = new Milk(200, 3000, 4.5);

        Basket basket = new Basket();
        basket.add(orange);
        basket.add(orange1);
        basket.add(milk);


        double expected = 13;
        double actual = ShopAssistance.calcTotalPrice(basket);

        Assert.assertEquals(expected, actual, 0);
    }
}
