import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Main {
    public static void main(String[] args) {
        drawLines(20, 20);
    }

    public static void drawLines(int n, int p) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        for (int m = 0; m < n; m++) {
                            g.drawLine(0, m * p, n * p - (++m) * p, 0);
                        }

                        for (int m = 0; m < n; m++) {
                            g.drawLine(0, m * p, n * p - (++m) * p, 0);
                        }
                    }
                });
                setSize(n * p, n * p);
                setVisible(true);
            }
        };
    }
}