import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class flip1 {
    public static void main(String[] args) {
        drawMirroredStar(20, 20);
    }

    public static void drawMirroredStar(int n, int p) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        // Mirrored loops
                        for (int m = 0; m < n; m++) {
                            g.drawLine(n * p, m * p, 0, n * p - m * p);
                        }
                        for (int m = 0; m < n; m++) {
                            g.drawLine(0, m * p, n * p, n * p - m * p);
                        }
                    }
                });
                setSize(n * p, n * p);
                setVisible(true);
            }
        };
    }
}
