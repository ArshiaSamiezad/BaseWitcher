package model;

public class Ability {
    public void doAbility(String ability, Player player, Player target) {
        if (ability.equals("Commander's Horn")) {
            commandersHorn(player,target);
        } else if (ability.equals("Decoy")) {
            decoy(player,target);
        } else if (ability.equals("Medic")) {
            medic(player,target);
        } else if (ability.equals("Moral Boost")) {
            moralBoost(player,target);
        } else if (ability.equals("Muster")) {
            muster(player,target);
        } else if (ability.equals("Spy")) {
            spy(player,target);
        } else if (ability.equals("Tight Bound")) {
            tightBound(player,target);
        } else if (ability.equals("Scorch")) {
            scorch(player,target);
        } else if (ability.equals("Berserker")) {
            berserker(player,target);
        } else if (ability.equals("Mardroeme")) {
            mardroeme(player,target);
        } else if (ability.equals("Transformers")) {
            transformers(player,target);
        }
    }

    private void commandersHorn(Player player, Player target) {

    }

    private void decoy(Player player, Player target) {

    }

    private void medic(Player player, Player target) {

    }

    private void moralBoost(Player player, Player target) {

    }

    private void muster(Player player, Player target) {

    }

    private void spy(Player player, Player target) {

    }

    private void tightBound(Player player, Player target) {

    }

    private void scorch(Player player, Player target) {

    }

    private void berserker(Player player, Player target) {

    }

    private void mardroeme(Player player, Player target) {

    }

    private void transformers(Player player, Player target) {

    }
}