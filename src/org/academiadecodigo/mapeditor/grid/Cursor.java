package org.academiadecodigo.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor {

    private Rectangle rect;
    private Grid grid;
    private int col;
    private int row;
    private int x;
    private int y;
    private static final int CELL_SIZE = 50;

    public Cursor(Grid grid) {
        this.grid = grid;
        this.col = (int) Math.round(grid.getCols() * Math.random());
        this.row = (int) Math.round(grid.getRows() * Math.random());
        this.x = Grid.getPADDING() + col * CELL_SIZE;
        this.y = Grid.getPADDING() + row * CELL_SIZE;
        rect = new Rectangle(this.x, this.y, CELL_SIZE, CELL_SIZE);
        rect.setColor(Color.MAGENTA);
        rect.fill();
    }


    public void paint() {
        if (grid.isFilledAt(col, row)) {
            grid.unpaint(col,row);
        } else grid.paint(col,row);
    }


    public void move(Direction direction) {

        switch (direction) {

            case UP:
                if (row > 0) {
                    rect.translate(0,-CELL_SIZE);
                    row --;
                }

                break;
            case DOWN:
                if (row < grid.getRows()-1) {
                    rect.translate(0, CELL_SIZE);
                    row ++;
                }
                break;
            case LEFT:
                if (col > 0) {
                    rect.translate(-CELL_SIZE, 0);
                    col --;
                }
                break;
            case RIGHT:
                if (col < grid.getCols()-1) {
                    rect.translate(CELL_SIZE,0);
                    col++;
                }
                break;
        }

    }

    public void updateColor() {
        if(grid.isFilledAt(col,row)){
            rect.setColor(Color.GREEN);
        }
        else {
            rect.setColor(Color.MAGENTA);
        }
        rect.fill();
    }
}
