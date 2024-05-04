package model;

import model.Commanders.Commander;
import model.Spells.Spell;

import java.util.ArrayList;

public class GameBoard {
    private Player player1;
    private Player player2;
    private ArrayList<Card> player1FirstRow = new ArrayList<>();
    private ArrayList<Card> player1SecondRow = new ArrayList<>();
    private ArrayList<Card> player1ThirdRow = new ArrayList<>();
    private ArrayList<Card> player2FirstRow = new ArrayList<>();
    private ArrayList<Card> player2SecondRow = new ArrayList<>();
    private ArrayList<Card> player3ThirdRow = new ArrayList<>();
    private ArrayList<Spell> spellCards = new ArrayList<>();
    private Commander player1Commander;
    private Commander player2Commander;
    private Player currentPlayer;

    public ArrayList<Card> getPlayerFirstRow(Player player) {
        return null;
    }

    public void setPlayerFirstRow(ArrayList<Card> playerFirstRow, Player player) {

    }

    public void addToFirstRow(Card card, Player player){

    }

    public ArrayList<Card> getPlayerSecondRow(Player player) {
        return null;
    }

    public void setPlayerSecondRow(ArrayList<Card> playerSecondRow, Player player) {

    }

    public void addToSecondRow(Card card, Player player){

    }

    public ArrayList<Card> getPlayerThirdRow(Player player) {
        return null;
    }

    public void setPlayerThirdRow(ArrayList<Card> playerThirdRow, Player player) {

    }

    public void addToThirdRow(Card card, Player player){

    }

    public Commander getPlayerCommander(Player player) {
        return null;
    }

    public void setPlayerCommander(Commander playerCommander, Player player) {

    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public ArrayList<Spell> getSpellCards() {
        return spellCards;
    }

    public void setSpellCards(ArrayList<Spell> spellCards) {
        this.spellCards = spellCards;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}