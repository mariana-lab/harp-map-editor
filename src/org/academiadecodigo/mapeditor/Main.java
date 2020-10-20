package org.academiadecodigo.mapeditor;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        try {
            game.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
