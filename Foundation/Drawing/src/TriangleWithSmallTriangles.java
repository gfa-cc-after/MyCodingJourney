import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class TriangleWithSmallTriangles {
    public static void main(String[] args) {
        drawTriangleWithSmallTriangles(400, 400);
    }

    public static void drawTriangleWithSmallTriangles(int width, int height) {
        new Frame() {
            {
                add(new Panel() {
                    @Override
                    public void paint(Graphics g) {
                        int[] xPoints = {width / 2, width / 2 - 100, width / 2 + 100};
                        int[] yPoints = {height / 2 - 100, height / 2 + 100, height / 2 + 100};
                        int nPoints = 3;

                        g.drawPolygon(xPoints, yPoints, nPoints);

                        int smallTriangleSize = (int) (0.05 * Math.min(width, height));

                        // Draw small triangles inside the empty space
                        drawSmallTriangles(g, xPoints, yPoints, smallTriangleSize);
                    }

                    private void drawSmallTriangles(Graphics g, int[] xPoints, int[] yPoints, int smallTriangleSize) {
                        int mx1 = (xPoints[0] + xPoints[1]) / 2;
                        int my1 = (yPoints[0] + yPoints[1]) / 2;
                        int mx2 = (xPoints[1] + xPoints[2]) / 2;
                        int my2 = (yPoints[1] + yPoints[2]) / 2;
                        int mx3 = (xPoints[2] + xPoints[0]) / 2;
                        int my3 = (yPoints[2] + yPoints[0]) / 2;

                        // Draw small triangles at midpoints
                        drawSmallTriangle(g, mx1, my1, smallTriangleSize);
                        drawSmallTriangle(g, mx2, my2, smallTriangleSize);
                        drawSmallTriangle(g, mx3, my3, smallTriangleSize);

                        // Recursively draw small triangles inside
                        drawSmallTriangles(g, new int[]{xPoints[0], mx1, mx3}, new int[]{yPoints[0], my1, my3}, smallTriangleSize);
                        drawSmallTriangles(g, new int[]{mx1, xPoints[1], mx2}, new int[]{my1, yPoints[1], my2}, smallTriangleSize);
                        drawSmallTriangles(g, new int[]{mx3, mx2, xPoints[2]}, new int[]{my3, my2, yPoints[2]}, smallTriangleSize);
                    }

                    private void drawSmallTriangle(Graphics g, int x, int y, int size) {
                        int[] xPoints = {x, x - size / 2, x + size / 2};
                        int[] yPoints = {y, y + size, y + size};
                        int nPoints = 3;

                        g.fillPolygon(xPoints, yPoints, nPoints);
                    }
                });
                setSize(width, height);
                setVisible(true);
            }
        };
    }
}
