package model;

import model.Factions.Faction;

public class Card {
    private int cardNumber;
    private String cardName;
    private String cardType;
    private boolean cardIsHero;
    private Ability cardAbility;
    private String cardPosition;
    private Faction cardFaction;
    private int power;
    private String condition;

    public Card(int cardNumber, String cardName, String cardType, boolean cardIsHero, Ability cardAbility,
                String cardPosition, Faction cardFaction, int power, String condition) {
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardType = cardType;
        this.cardIsHero = cardIsHero;
        this.cardAbility = cardAbility;
        this.cardPosition = cardPosition;
        this.cardFaction = cardFaction;
        this.power = power;
        this.condition = condition;
    }

    public void doAbility(){

    }
}