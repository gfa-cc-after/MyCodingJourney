import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class Star111 {
    public static void main(String[] args) {
        drawStar(20, 20);
    }

    public static void drawStar(int n, int p) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        for (int m = 0; m < n; m++) {
                            g.drawLine(0, m * p, n * p - (++m) * p, 0);
                        }
                        for (int m = 0; m < n; m++) {
                            g.drawLine(n * p, m * p, n * p - (++m) * p, n * p);
                        }
                    }
                });
                setSize(n * p, n * p);
                setVisible(true);
            }
        };
    }
}




