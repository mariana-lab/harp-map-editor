package org.academiadecodigo.mapeditor.audio;

import java.awt.*;

public enum AudioNotes {
    A6 ("/resources/harpa/0_a6harp.wav", Color.WHITE),
    FS6("/resources/harpa/1_f#6harp.wav", Color.YELLOW),
    E6("/resources/harpa/2_e6harp.wav", Color.ORANGE),
    D6("/resources/harpa/3_d6harp.wav", Color.PINK),
    B5("/resources/harpa/4_b5harp.wav", Color.MAGENTA),
    A5("/resources/harpa/5_a5harp.wav", Color.BLUE),
    FS5("/resources/harpa/6_f#5harp.wav", Color.CYAN),
    E5("/resources/harpa/7_e5harp.wav", Color.GREEN),
    D5("/resources/harpa/8_d5harp.wav", Color.YELLOW),
    B4("/resources/harpa/9_b4harp.wav", Color.ORANGE),
    A4("/resources/harpa/10_a4harp.wav",Color.PINK),
    FS4("/resources/harpa/11_f#4harp.wav", Color.RED),
    E4("/resources/harpa/12_e4harp.wav",Color.LIGHT_GRAY),
    D4("/resources/harpa/13_d4harp.wav", Color.GRAY),
    B3("/resources/harpa/14_b3harp.wav", Color.DARK_GRAY),
    A3("/resources/harpa/15_a3harp.wav", Color.BLACK);

    private String audioPath;
    private Color color;

    AudioNotes(String audioPath, Color color){
        this.audioPath = audioPath;
        this.color = color;

    }

    public String getAudioPath() {
        return audioPath;
    }

    public Color getColor() {
        return color;
    }
}
