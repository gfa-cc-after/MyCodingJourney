import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Astroid {
    public static void main(String[] args) {
        drawCurvedAstroid(200, 200, 100);
    }

    public static void drawCurvedAstroid(int width, int height, int size) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        int centerX = width / 2;
                        int centerY = height / 2;

                        int points = 360;
                        double angleIncrement = 2 * Math.PI / points;
                        int radiusX = size;
                        int radiusY = size;

                        for (int i = 0; i < points; i++) {
                            double angle = i * angleIncrement;
                            int x = centerX + (int) (radiusX * Math.pow(Math.cos(angle), 3));
                            int y = centerY + (int) (radiusY * Math.pow(Math.sin(angle), 3));
                            g.drawLine(centerX, centerY, x, y);
                        }
                    }
                });
                setSize(width, height);
                setVisible(true);
            }
        };
    }
}
