package org.academiadecodigo.mapeditor.keyboard;

import org.academiadecodigo.mapeditor.file.FileManager;
import org.academiadecodigo.mapeditor.Game;
import org.academiadecodigo.mapeditor.grid.Cursor;
import org.academiadecodigo.mapeditor.grid.Direction;
import org.academiadecodigo.mapeditor.grid.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MapKeyboardHandler implements KeyboardHandler {

    private final Cursor cursor;
    private final Grid grid;
    private final Game game;
    private String path;

    public MapKeyboardHandler(Game game, Cursor cursor, Grid grid) {
        this.game = game;
        this.cursor = cursor;
        this.grid = grid;
        this.path = "/Users/marianabarros/Documents/AC/PROJECTS/MapEditor/resources/lastdrawing.txt";
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_L:
                grid.load(FileManager.load(path));
                break;
            case KeyboardEvent.KEY_S:
                FileManager.save(path, grid.toString());
                //System.out.println(grid.toString());
                break;
            case KeyboardEvent.KEY_C:
                grid.clear();
                break;
            case KeyboardEvent.KEY_P:
                game.setPlay();
                break;
            case KeyboardEvent.KEY_UP:
                cursor.move(Direction.UP);
                cursor.updateColor();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.move(Direction.DOWN);
                cursor.updateColor();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.move(Direction.LEFT);
                cursor.updateColor();
                break;
            case KeyboardEvent.KEY_RIGHT:
                cursor.move(Direction.RIGHT);
                cursor.updateColor();
                break;
            case KeyboardEvent.KEY_SPACE:
                cursor.paint();
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
