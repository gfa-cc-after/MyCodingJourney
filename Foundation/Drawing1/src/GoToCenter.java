import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void drawImage(Graphics graphics) {
        // Create a function that takes 3 parameters and draws a single line
        // Parameters: the x and y coordinates of the line's starting point and the graphics
        // The function shall draw a line from that point to the center of the canvas
        // Draw at least 3 lines with that function using a loop
        for (int i = 0; i < 3; i++) {
            // Generate random starting point coordinates
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);

            drawLineToCenter(x, y, graphics);
        }


    }

    // Function to draw a line from a point to the center of the canvas
    private static void drawLineToCenter(int x, int y, Graphics graphics) {
        // Calculate the center coordinates
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        // Draw a line from the specified point to the center
        graphics.drawLine(x, y, centerX, centerY);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;
    //DOES THIS EVEN WORK <<< ?????
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