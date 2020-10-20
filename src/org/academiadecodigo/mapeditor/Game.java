package org.academiadecodigo.mapeditor;

import org.academiadecodigo.mapeditor.grid.Cursor;
import org.academiadecodigo.mapeditor.grid.Grid;
import org.academiadecodigo.mapeditor.keyboard.MapKeyboardHandler;
import org.academiadecodigo.mapeditor.keyboard.MapKeyboardManager;

public class Game {
    private Grid grid;
    private Cursor cursor;
    private boolean isPlaying;
    private MapKeyboardManager keyboardManager;

    public Game() {

        this.grid = new Grid(16, 16);
        this.cursor = new Cursor(this.grid);
        isPlaying = true;
        this.keyboardManager = new MapKeyboardManager(new MapKeyboardHandler(this, this.cursor, this.grid));

    }

    public void init() {
        grid.init();
    }

    public void start() throws InterruptedException {
        while (true) {

           if(!isPlaying)
               continue;

            play();
        }
    }

    public void setPlay() {
        isPlaying = !isPlaying;
        System.out.println(isPlaying());
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void play() throws InterruptedException {
        for (int c = 0; c < grid.getCols(); c++) {
            Thread.sleep(100);
            for (int r = 0; r < grid.getRows(); r++) {

                if (grid.getCell(c, r).isFilled()) {
                    grid.getCell(c, r).getSound().play(true);

                }
            }
        }
    }
}
