import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Card {
    String cardName;
    int cardHp;
    short availableItems;
    // 1577;
    double priceFrom;
    // 0.70;
    double priceTrend;
    // 1.78;
    double thirtyDaysAverage;
    // 2.00;
    double sevenDaysAverage;
    // 1.69;
    double oneDayAverage;
    // 1.16;

    public Card(String cardName, int cardHp, short availableItems, double priceFrom,
                double priceTrend, double thirtyDaysAverage, double sevenDaysAverage,
                double oneDayAverage) {
        this.cardName = cardName;
        this.cardHp = cardHp;
        this.availableItems = availableItems;
        this.priceFrom = priceFrom;
        this.priceTrend = priceTrend;
        this.thirtyDaysAverage = thirtyDaysAverage;
        this.sevenDaysAverage = sevenDaysAverage;
        this.oneDayAverage = oneDayAverage;
    }

    public void cardDescription(){
        System.out.println("Name: " + cardName);
        System.out.println("HP " + cardHp);
        System.out.println("Rarity: P");
        System.out.println("Printed in: SWSW Black Star Promos");
        System.out.println("Reprints: Show Versions (9), Show offers");
        System.out.println("Available items: " + availableItems);
        System.out.println("Price from: " + priceFrom + " €");
        System.out.println("Price trend: " + priceTrend + " €");
        System.out.println("30-days average price " + thirtyDaysAverage + " €");
        System.out.println("7-days average price " + sevenDaysAverage + " €");
        System.out.println("1-day average price " + oneDayAverage + " €");
    }


    public void whatCardType(){
        System.out.println("This is a blank card");
    }

    public short getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(short availableItems) {
        this.availableItems = availableItems;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardHp(int cardHp) {
        this.cardHp = cardHp;
    }

    //    public void pokemonFight(){
//        Random randomNumberGenerator = new Random();
//        int maxNumber = 600;
//        int minNumber = 0;
//        if(randomNumberGenerator.nextInt(minNumber + maxNumber) > cardHp){
//            System.out.println(cardName + " lost the fight against the random Pokemon card");
//        } else {
//            System.out.println(cardName + " has beaten the random Pokemon card");
//        }
//    }
}
