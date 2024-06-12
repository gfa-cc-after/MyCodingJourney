import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void drawImage(Graphics graphics) {
        int[][] boxPoints = {{10, 10}, {290, 10}, {290, 290}, {10, 290}};
        int[][] otherPoints = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                {120, 100}, {85, 130}, {50, 100}};

        connectDots(boxPoints, graphics);
        connectDots(otherPoints, graphics);
    }

    // Function to connect the dots with green lines
    private static void connectDots(int[][] points, Graphics graphics) {
        graphics.setColor(Color.BLACK);
        for (int i = 0; i < points.length - 1; i++) {
            int[] start = points[i];
            int[] end = points[i + 1];
            graphics.drawLine(start[0], start[1], end[0], end[1]);
        }
        // Connect the last point to the first point to close the shape
        int[] firstPoint = points[0];
        int[] lastPoint = points[points.length - 1];
        graphics.drawLine(lastPoint[0], lastPoint[1], firstPoint[0], firstPoint[1]);
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
