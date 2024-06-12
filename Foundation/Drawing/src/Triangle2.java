import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Triangle2 {
    public static void main(String[] args) {
        drawTriangle(400, 400);
    }

    public static void drawTriangle(int width, int height) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        int[] xPoints = {width / 2, width / 2 - 100, width / 2 + 100};
                        int[] yPoints = {height / 2 - 100, height / 2 + 100, height / 2 + 100};
                        int nPoints = 3;

                        g.drawPolygon(xPoints, yPoints, nPoints);
                    }
                });
                setSize(width, height);
                setVisible(true);
            }
        };
    }
}
