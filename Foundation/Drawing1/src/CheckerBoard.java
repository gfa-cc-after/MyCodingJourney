import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
// GOOGLE THANK YOU FOR THE HELP
public class CheckerBoard {
    public static void drawImage(Graphics graphics) {
        int rows = 8;
        int cols = 8;
        int squareSize = WIDTH / cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                drawCheckerSquare(i, j, squareSize, graphics);
            }
        }
    }

    // Function to draw a checkerboard square at the specified position
    private static void drawCheckerSquare(int row, int col, int size, Graphics graphics) {
        int x = col * size;
        int y = row * size;

        // Use alternating colors based on the row and column indices
        if ((row + col) % 2 == 0) {
            graphics.setColor(Color.WHITE);
        } else {
            graphics.setColor(Color.BLACK);
        }

        graphics.fillRect(x, y, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}
