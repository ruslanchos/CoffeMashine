package org.example.coffemashine;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Runner {
    public static void main (String[] args) {
        System.out.println("Кофе-машина");

        //TODO: read int from console
        int moneyAmount = 20;

        System.out.println("Вы внесли " + moneyAmount + " руб.");

        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuySomething = false;

        for(int i = 0; i < drinkPrices.length; i = i + 1) {
            if(moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " +
                        drinkNames[i]);
                canBuySomething = true;
            }
        }

        if(!canBuySomething) {
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много!))");
        }

        //TODO:
        //* SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //Date now = new Date();
        //System.out.println(formatter.format(now));*/

        //TODO: get screenshot to BufferedImage
        //BufferedImage image = null;
        //assert image != null;
        //System.out.println(image.getWidth() + "x" +
        //        image.getHeight());

        //TODO:
        //  upload screenshot(s) of the code
        //  and console output and send to Telegram-chat
        //  with #ilovejava
    }
}