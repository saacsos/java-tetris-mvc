package tetris;

import tetris.views.TetrisFrame;

/**
 * Created by saacsos on 1/12/2559.
 * http://zetcode.com/tutorials/javagamestutorial/tetris/
 */
public class TetrisStartGame {
    public static void main(String[] args) {
        TetrisFrame game = new TetrisFrame();
        game.setLocationRelativeTo(null);
        game.init();
    }
}
