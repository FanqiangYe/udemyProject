public class YuGiOhCard extends Card implements DrawCard  {

    public YuGiOhCard(String cardName, int cardHp, short availableItems, double priceFrom, double priceTrend, double thirtyDaysAverage, double sevenDaysAverage, double oneDayAverage) {
        super(cardName, cardHp, availableItems, priceFrom, priceTrend, thirtyDaysAverage, sevenDaysAverage, oneDayAverage);
    }

    @Override
    public void whatCardType() {
        System.out.println("This is a Yu Gi Oh card");
    }

    @Override
    public void drawACard() {
        System.out.println("Draw a " + cardName + " card");
    }
}
