import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class game {

    static class MyFrame extends JFrame {

        //constant
        static int BALL_WIDTH = 20;
        static int BALL_HEIGHT = 20 ;
        static int BLOCK_ROWS = 20;
        static int BLOCK_COLUMNS = 5;
        static int BLOCK_WIDTH = 70;
        static int BLOCK_HEIGHT = 40;
        static int BLOCK_GAP = 3;
        static int BAR_WIDTH = 80;
        static int BAR_HEIGHT = 20;
        static int CANVAS_WIDTH = 400 + (BLOCK_GAP * BLOCK_COLUMNS) - BLOCK_GAP;
        static int CANVAS_HEIGHT = 600;

        //variable
        MyPanel mypanel = null;
        static int score = -3000;

        static class MyPanel extends JPanel {
            static Timer time = null;
            static Block[][] blocks = new Block[BLOCK_ROWS][BLOCK_COLUMNS];
            class Block {

            }
        }


        public MyFrame (String title) {
            super(title);
        }
    }
    public static void main(String[] args) {
        new MyFrame("gamme");
    }
}
