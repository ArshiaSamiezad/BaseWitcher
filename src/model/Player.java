package model;

import model.Commanders.Commander;
import model.Factions.Faction;
import model.Spells.Spell;

import java.util.ArrayList;

public class Player extends User {
    private ArrayList<Card> hand = new ArrayList<>();
    private ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Card> discardPile = new ArrayList<>();
    private ArrayList<Spell> spellCards = new ArrayList<>();
    private User user;
    private int availableCards = 0;
    private Commander commander;
    private int lives;
    private Faction currentFaction;
    private int roundsWon = 0;
    private int roundsLost = 0;
    private int roundsDrawn = 0;


    public Player(User user) {
        super(user.getUsername(), user.getNickname(), user.getPassword(), user.getEmail());
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void addToHand(Card card){

    }

    public void removeFromHand(String cardName){

    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void addToDeck(Card card){

    }

    public void removeFromDeck(String cardName){

    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(ArrayList<Card> discardPile) {
        this.discardPile = discardPile;
    }

    public void addToDiscardPile(Card card){

    }

    public void removeFromDiscardPile(String cardName){

    }

    public ArrayList<Spell> getSpellCards() {
        return spellCards;
    }

    public void setSpellCards(ArrayList<Spell> spellCards) {
        this.spellCards = spellCards;
    }

    public void addToSpellCards(Card card){

    }

    public void removeFromSpellCards(String cardName){

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAvailableCards() {
        return availableCards;
    }

    public void setAvailableCards(int availableCards) {
        this.availableCards = availableCards;
    }

    public void addToAvailableCards(Card card){

    }

    public void removeFromAvailableCards(String cardName){

    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public Faction getCurrentFaction() {
        return currentFaction;
    }

    public void setCurrentFaction(Faction currentFaction) {
        this.currentFaction = currentFaction;
    }

    public int getRoundsDrawn() {
        return roundsDrawn;
    }

    public void setRoundsDrawn(int roundsDrawn) {
        this.roundsDrawn = roundsDrawn;
    }

    public int getRoundsLost() {
        return roundsLost;
    }

    public void setRoundsLost(int roundsLost) {
        this.roundsLost = roundsLost;
    }

    public int getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(int roundsWon) {
        this.roundsWon = roundsWon;
    }


}