package org.academiadecodigo.mapeditor.grid;

import org.academiadecodigo.mapeditor.audio.Sound;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Cell {

    private Rectangle rect;
    private int x;
    private int y;
    private boolean isFilled;
    private static final int CELL_SIZE = 50;
    private Sound sound;

    public Cell(int col, int row, String soundPath) {


        this.x = Grid.getPADDING() + col * CELL_SIZE;
        this.y = Grid.getPADDING() + row * CELL_SIZE;
        isFilled = false;
        rect = new Rectangle(this.x,this.y,CELL_SIZE,CELL_SIZE);
        rect.setColor(Color.GRAY);
        rect.draw();
        this.sound = new Sound(soundPath);
    }

    public boolean isFilled() {
        return isFilled;
    }


    public void paint(){
        isFilled = true;
        rect.setColor(Color.BLACK);
        rect.fill();
    }

    public void unpaint(){
        isFilled = false;
        rect.setColor(Color.GRAY);
        rect.draw();
    }

    public Sound getSound() {
        return sound;
    }
}
