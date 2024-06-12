import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D {
    public static void drawImage(Graphics graphics) {
        int size = 20; // Size of each purple square
        int steps = 6; // Number of steps

        for (int i = 0; i < steps; i++) {
            drawPurpleSquare3D(i * size, size, graphics);

        }
    }


    //   NOPE NOT WORKING SQUARES DONT GET BIGGER
    // Function to draw a 3D-like purple square at the specified coordinates
    private static void drawPurpleSquare3D(int x, int size, Graphics graphics) {
        graphics.setColor(new Color(128, 0, 128)); // Purple color
        graphics.fillRect(x, x, size, size);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, x, size, size);
        graphics.setColor(Color.WHITE);
        graphics.drawLine(x + size, x, x + size, x + size);
        graphics.drawLine(x, x + size, x + size, x + size);


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
