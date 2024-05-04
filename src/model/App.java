package model;

import enums.Menu;


public class App {
    private static Menu currentMenu = Menu.LoginMenu;
    private static GameBoard currentGame = null;
    private static User loggedInUser;

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }

    public static GameBoard getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(GameBoard currentGame) {
        App.currentGame = currentGame;
    }

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User loggedInUser) {
        App.loggedInUser = loggedInUser;
    }
}
