import javax.swing.*;
import java.awt.*;

// a lot of googling and still looks like cauliflower


public class Koch extends JFrame {

    public Koch () {
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new SnowflakePanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Koch());
    }
}

class SnowflakePanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawKochSnowflake(g, 5, 250, 300, 200);
    }

    private void drawKochSnowflake(Graphics g, int level, int x1, int y1, int size) {
        int[] xPoints = new int[3];
        int[] yPoints = new int[3];

        for (int i = 0; i < 3; i++) {
            xPoints[i] = x1 + (int) (size * Math.cos(Math.toRadians(i * 270)));
            yPoints[i] = y1 + (int) (size * Math.sin(Math.toRadians(i * 270)));
        }

        drawKochCurve(g, level, xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
        drawKochCurve(g, level, xPoints[1], yPoints[1], xPoints[2], yPoints[2]);
        drawKochCurve(g, level, xPoints[2], yPoints[2], xPoints[0], yPoints[0]);
    }

    private void drawKochCurve(Graphics g, int level, int x1, int y1, int x2, int y2) {
        if (level == 0) {
            g.drawLine(x1, y1, x2, y2);
        } else {
            int deltaX = x2 - x1;
            int deltaY = y2 - y1;

            int x3 = x1 + deltaX / 3;
            int y3 = y1 + deltaY / 3;

            int x4 = (int) (0.5 * (x1 + x2) + Math.sqrt(3) * (y1 - y2) / 6);
            int y4 = (int) (0.5 * (y1 + y2) + Math.sqrt(3) * (x2 - x1) / 6);

            int x5 = x1 + 2 * deltaX / 3;
            int y5 = y1 + 2 * deltaY / 3;

            drawKochCurve(g, level - 1, x1, y1, x3, y3);
            drawKochCurve(g, level - 1, x3, y3, x4, y4);
            drawKochCurve(g, level - 1, x4, y4, x5, y5);
            drawKochCurve(g, level - 1, x5, y5, x2, y2);
        }
    }
}
