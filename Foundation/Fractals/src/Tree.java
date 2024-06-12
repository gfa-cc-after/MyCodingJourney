import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Tree extends JFrame {

    public Tree() {
        super("Fractal Tree");
        setBounds(100, 100, 1000, 600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 13.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 8.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        drawTree(g, 400, 500, -90, 9);
    }

    public static void main(String[] args) {
        new Tree().setVisible(true);
    }
}