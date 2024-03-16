public class PokemonApp {
    public static void main(String[] args) {

        PokemonCard mewtwoCard = new PokemonCard("Mewtwo V", 290, (short)1577, 0.70, 1.78, 2.00, 1.69, 1.16);
        mewtwoCard.setCardHp(360);
        mewtwoCard.cardDescription();
        mewtwoCard.whatCardType();

        System.out.println("");

        PokemonCard charizardCard = new PokemonCard("Charizard V", 350, (short)900, 1.10, 1.90, 3.10, 2.56, 1.58);
        charizardCard.setCardHp(450);
        charizardCard.cardDescription();
        charizardCard.whatCardType();

        System.out.println("");

        System.out.println(charizardCard.getCardName() + " has a stock of " + charizardCard.getAvailableItems());
        charizardCard.setAvailableItems((short)815);
        System.out.println(charizardCard.getCardName() + " now has a stock of " + charizardCard.getAvailableItems());





//        PokemonCard[] pokemonCards = new PokemonCard[2];
//        pokemonCards[0] = mewtwoCard;
//        pokemonCards[1] = charizardCard;
//
//        for (PokemonCard pokemonCard : pokemonCards){
//            pokemonCard.pokemonFight();
        }
    }

 