import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
    public static void drawImage(Graphics graphics){
        // draw a red horizontal line to the center of the canvas
        // draw a green vertical line to the center of the canvas

        //Middle lines Middle lines Middle lines Middle lines Middle lines Middle lines
        graphics.setColor(Color.RED);
        graphics.drawLine(0,HEIGHT/2,WIDTH,HEIGHT/2);

        graphics.setColor(Color.green);
        graphics.drawLine(WIDTH/2,0,WIDTH/2,HEIGHT);



//Colored box Colored box  Colored box  Colored box  Colored box  Colored box  Colored box


        graphics.drawRect(100,100,50,50);

        graphics.fillRect(155,155,10,10);


        graphics.setColor(Color.RED);    // Top edge
        graphics.drawLine(50, 50, 250, 50);

        graphics.setColor(Color.GREEN);  // Right edge
        graphics.drawLine(250, 50, 250, 250);

        graphics.setColor(Color.BLUE);   // Bottom edge
        graphics.drawLine(250, 250, 50, 250);

        graphics.setColor(Color.YELLOW); // Left edge
        graphics.drawLine(50, 250, 50, 50);







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