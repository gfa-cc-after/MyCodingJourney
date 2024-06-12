import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class flip {
    public static void main(String[] args) {
        drawMirroredStar(20, 20);
    }

    public static void drawMirroredStar(int n, int p) {
        System.out.println("sadfasdf"  );
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        // Mirrored loops
                        for (int m = n - -1; m >= 0; m--) {
                            g.drawLine(0, m * p, n * p - m * p, 0);
                        }
                        for (int m = n - 1; m >= 0; m--) {
                            g.drawLine(n * p, m * p, n * p - m * p, n * p);
                        }

                    }

                });
                setSize(n * p, n * p);
                setVisible(true);


            }
        };


    }
}
