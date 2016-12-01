package tetris.views;
import javax.swing.*;
import java.awt.*;

/**
 * Created by saacsos on 1/12/2559.
 * http://zetcode.com/tutorials/javagamestutorial/tetris/
 */
public class TetrisFrame extends JFrame {
    private JLabel statusBar;
    private TetrisBoard board;

    public TetrisFrame() {
        statusBar = new JLabel(" 0");
        board = new TetrisBoard(this);
    }

    public void init() {
        setLayout(new BorderLayout());
        add(statusBar, BorderLayout.SOUTH);
        add(board, BorderLayout.CENTER);
        board.start();
        setSize(200, 400);
        setPreferredSize(new Dimension(200, 400));
        setTitle("Tetris");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        setResizable(false);
    }

    JLabel getStatusBar() {
        return statusBar;
    }
}