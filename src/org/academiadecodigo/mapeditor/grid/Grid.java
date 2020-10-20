package org.academiadecodigo.mapeditor.grid;
import org.academiadecodigo.mapeditor.audio.AudioNotes;

public class Grid {
    private static final int PADDING = 10;
    private int cols;
    private int rows;
    private Cell[][] cells;

    public Grid(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        this.cells = new Cell[cols][rows];

    }

    public void init() {

        for(int r = 0; r<rows; r++){
            for(int c = 0; c< cols; c++){
                //atribuir audio
                cells[c][r] = new Cell(c,r, AudioNotes.values()[r].getAudioPath());
            }

        }

    }
    //init()
    public void load(String s){
        //receives the string from the file and prints everycell
        clear();
        String[] S = s.split("\n");
        for(int r = 0; r<rows; r++){
            char[]C = S[r].toCharArray();
            for(int c = 0; c< (C.length <= cols ? C.length : cols); c++) {
                if(C[c]=='1'){
                    paint(c,r);
                }
            }
        }



    }

    public String toString(){
        String s = "";

        for(int r = 0; r<rows; r++){
            for(int c = 0; c< cols; c++) {
                s += (cells[c][r].isFilled() ? "1" : "0");
            }
            s+="\n";

        }
        return s;
    }


    public void paint(int col, int row){
        cells[col][row].paint();
    }

    public void unpaint(int col, int row){
        cells[col][row].unpaint();
    }

    public boolean isFilledAt(int col, int row){
        return cells[col][row].isFilled();
     }

    public void clear(){

        for(int r = 0; r<rows; r++){
            for(int c = 0; c< cols; c++){
                cells[c][r].unpaint();
            }
        }
    }

    public static int getPADDING() {
        return PADDING;
    }

    public Cell getCell(int col, int row) {
        return cells[col][row];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
