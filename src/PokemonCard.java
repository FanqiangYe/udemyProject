public class PokemonCard extends Card {


    public PokemonCard(String cardName, int cardHp, short availableItems, double priceFrom, double priceTrend, double thirtyDaysAverage, double sevenDaysAverage, double oneDayAverage) {
        super(cardName, cardHp, availableItems, priceFrom, priceTrend, thirtyDaysAverage, sevenDaysAverage, oneDayAverage);
    }

    @Override
    public void whatCardType() {
        System.out.println("This is a Pokemon card");
    }
}
