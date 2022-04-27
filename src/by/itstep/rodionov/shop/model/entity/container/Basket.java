package by.itstep.rodionov.shop.model.entity.container;

import by.itstep.rodionov.shop.model.entity.Milk;
import by.itstep.rodionov.shop.model.entity.Orange;

public class Basket {
    private Orange[] oranges;
    private Milk[] milks;

    public Basket() {
        oranges = new Orange[0];
        milks = new Milk[0];
    }

    public Basket(Orange[] oranges, Milk[] milks) {
        this();

        if(oranges != null){
            this.oranges = oranges;
        }

        if (milks != null){
            this.milks = milks;
        }
    }

    public void add(Orange orange){
        Orange[] temp = new Orange[this.oranges.length + 1];
        int i = 0;
        for (; i < oranges.length; i++) {
            temp[i] = oranges[i];
        }
        temp[i] = orange;
        oranges = temp;
    }

    public void removeOrange(int index){
        Orange[] temp = new Orange[this.oranges.length - 1];
        for (int i = 0, j = 0 ;i < oranges.length; i++) {
            if(i!= index){
                temp[j++] = oranges[i];
            }
        }
        oranges = temp;
    }

    public void add(Milk milk){
        Milk[] temp = new Milk[this.milks.length + 1];
        int i = 0;
        for (; i < milks.length; i++) {
            temp[i] = milks[i];
        }
        temp[i] = milk;
        milks = temp;
    }

    public void removeMilk(int index){
        Milk[] temp = new Milk[this.milks.length - 1];
        for (int i = 0, j = 0 ;i < milks.length; i++) {
            if(i!= index){
                temp[j++] = milks[i];
            }
        }
        milks = temp;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        if (oranges == null || milks == null){
            builder.append("Empty basket");
        } else{
            builder.append("Basket:\n");
            for (Orange orange:oranges) {
                builder.append("\n").append(orange);
            }
            for (Milk milk:milks) {
                builder.append("\n").append(milk);
            }
        }
        return builder.toString();
    }

    public int getOranges(){
        return oranges.length;
    }

    public int getMilks(){
        return milks.length;
    }

    public Orange getOrange(int index){
        return oranges[index];
    }

    public Milk getMilk(int index){
        return milks[index];
    }
}
