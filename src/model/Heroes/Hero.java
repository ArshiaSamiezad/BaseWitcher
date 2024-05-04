package model.Heroes;

import model.Ability;
import model.Card;
import model.Factions.Faction;

public class Hero extends Card{
    public Hero(int cardNumber, String cardName, String cardType, boolean cardIsHero, Ability cardAbility,
                String cardPosition, Faction cardFaction, int power, String condition) {
        super(cardNumber, cardName, cardType, cardIsHero, cardAbility, cardPosition, cardFaction, power, condition);
    }

    @Override
    public void doAbility() {
        super.doAbility();
    }
}