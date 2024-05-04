package model.Factions;

import model.Card;
import model.Commanders.Commander;

import java.util.ArrayList;

public class Skellige extends Faction{
    public Skellige() {
        super("",null,null);
    }

    @Override
    public void setCommanders(ArrayList<Commander> commanders) {
        super.setCommanders(commanders);
    }

    @Override
    public void setCards(ArrayList<Card> cards) {
        super.setCards(cards);
    }

    @Override
    public void doAbility() {
        super.doAbility();
    }
}
