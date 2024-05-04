package model.Soldiers;

import model.Ability;
import model.Card;
import model.Factions.Faction;

public class Soldier extends Card {
    public Soldier(int cardNumber, String cardName, String cardType, boolean cardIsHero, Ability cardAbility,
                   String cardPosition, Faction cardFaction, int power, String condition) {
        super(cardNumber, cardName, cardType, cardIsHero, cardAbility, cardPosition, cardFaction, power, condition);
    }

    @Override
    public void doAbility() {
        super.doAbility();
    }
}