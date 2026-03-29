// Unit 12: Interactive Applet - Drawing with Mouse
// Concept: Applet with user interaction

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class InteractiveApplet extends Applet implements MouseListener, MouseMotionListener {

    int x = 0, y = 0;
    int[] xPoints = new int[100];
    int[] yPoints = new int[100];
    int pointCount = 0;

    @Override
    public void init() {
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
        System.out.println("Interactive Applet initialized - Click to draw");
    }

    @Override
    public void paint(Graphics g) {
        // Draw title
        g.setColor(Color.BLACK);
        g.drawString("Click and drag to draw", 10, 20);

        // Draw lines connecting points
        g.setColor(Color.BLUE);
        for (int i = 0; i < pointCount - 1; i++) {
            g.drawLine(xPoints[i], yPoints[i], xPoints[i + 1], yPoints[i + 1]);
        }

        // Draw points
        g.setColor(Color.RED);
        for (int i = 0; i < pointCount; i++) {
            g.fillOval(xPoints[i] - 3, yPoints[i] - 3, 6, 6);
        }
    }

    // MouseListener methods
    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        if (pointCount < 100) {
            xPoints[pointCount] = e.getX();
            yPoints[pointCount] = e.getY();
            pointCount++;
            repaint();  // Redraw applet
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}

/*
HTML FILE (save as InteractiveApplet.html):

<html>
<body>
    <h1>Interactive Drawing Applet</h1>
    <applet code="InteractiveApplet.class" width="500" height="400">
        Your browser does not support applets.
    </applet>
</body>
</html>
*/
