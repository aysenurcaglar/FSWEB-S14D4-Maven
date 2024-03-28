package org.example.rpg;

public class RPG {
    public static void main(String[] args) {
        Monster[] monsters = new Monster[2];
        monsters[0] = new Troll("Gabagool", 100, 20);
        monsters[1] = new Werewolf("Anton", 120, 30, false);

        listMonsters(monsters);
    }

    public static void listMonsters(Monster[] monsters) {
        for (Monster monster : monsters) {
            monster.showDetails();
        }
    }
}
