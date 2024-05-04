package model.Factions;

import model.Card;
import model.Commanders.Commander;

import java.util.ArrayList;

public class Faction {
    private ArrayList<Commander> commanders;
    private ArrayList<Card> cards;
    private String name;

    public Faction(String name, ArrayList<Commander> commanders, ArrayList<Card> cards) {
        this.name = name;
        this.commanders=commanders;
        this.cards=cards;
    }

    public ArrayList<Commander> getCommanders() {
        return commanders;
    }

    public void setCommanders(ArrayList<Commander> commanders) {
        this.commanders = commanders;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public void doAbility(){

    }
}
