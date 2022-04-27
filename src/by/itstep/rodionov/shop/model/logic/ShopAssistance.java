package by.itstep.rodionov.shop.model.logic;

import by.itstep.rodionov.shop.model.entity.container.Basket;

public class ShopAssistance {
    public static double calcTotalPrice(Basket basket) {
        double total = 0;

        for (int i = 0; i < basket.getOranges(); i++) {
            total+= basket.getOrange(i).getCost();
        }

        for (int i = 0; i < basket.getMilks(); i++) {
            total+= basket.getMilk(i).getMoney();
        }

        return total;
    }
}
