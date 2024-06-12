import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class TriangleWithTriangles {
    public static void main(String[] args) {
        drawTriangleWithTriangles(400, 400, 5);
    }

    public static void drawTriangleWithTriangles(int width, int height, int levels) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        drawNestedTriangles(g, width / 2, height - 50, width / 2, levels);
                    }

                    private void drawNestedTriangles(Graphics g, int x, int y, int size, int levels) {
                        if (levels == 0) {
                            return;
                        }

                        // Draw the outer triangle
                        int x1 = x - size / 2;
                        int y1 = y - size / 3;
                        int x2 = x + size / 2;
                        int y2 = y - size / 3;
                        int x3 = x;
                        int y3 = y + size / 3 * 2;
                        g.drawLine(x1, y1, x2, y2);
                        g.drawLine(x2, y2, x3, y3);
                        g.drawLine(x3, y3, x1, y1);

                        // Recursively draw three smaller triangles inside
                        drawNestedTriangles(g, (x1 + x2) / 2, (y1 + y2) / 2, size / 2, levels - 1);
                        drawNestedTriangles(g, (x2 + x3) / 2, (y2 + y3) / 2, size / 2, levels - 1);
                        drawNestedTriangles(g, (x3 + x1) / 2, (y3 + y1) / 2, size / 2, levels - 1);
                    }
                });
                setSize(width, height);
                setVisible(true);
            }
        };
    }
}
