public class PokemonApp {
    public static void main(String[] args) {

        PokemonCard charizardCard = new PokemonCard("Charizard V", 350, (short)900, 1.10, 1.90, 3.10, 2.56, 1.58);
        charizardCard.setCardHp(450);
        charizardCard.cardDescription();
        charizardCard.whatCardType();

        System.out.println("");

        YuGiOhCard darkMagicianCard = new YuGiOhCard("Dark Magician", 250, (short)350, 100, 135, 125, 128, 135);

        System.out.println("");

        System.out.println(charizardCard.getCardName() + " has a stock of " + charizardCard.getAvailableItems());
        charizardCard.setAvailableItems((short)815);
        System.out.println(charizardCard.getCardName() + " now has a stock of " + charizardCard.getAvailableItems());

        System.out.println("");

        darkMagicianCard.drawACard();

        charizardCard.drawACard();





//        PokemonCard[] pokemonCards = new PokemonCard[2];
//        pokemonCards[0] = mewtwoCard;
//        pokemonCards[1] = charizardCard;
//
//        for (PokemonCard pokemonCard : pokemonCards){
//            pokemonCard.pokemonFight();
        }
    }

 