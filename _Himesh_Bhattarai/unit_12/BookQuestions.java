// Unit 12: Book Questions - Applets Practice
// Concept: Create applets with graphics and interaction

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// Display graphics shapes
class ShapeApplet extends Applet {

    @Override
    public void init() {
        setBackground(Color.LIGHT_GRAY);
        System.out.println("Shape Applet initialized");
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 150, 100);      // Rectangle

        g.setColor(Color.RED);
        g.fillOval(250, 50, 100, 100);     // Circle

        g.setColor(Color.GREEN);
        int[] xPoints = {100, 150, 50};
        int[] yPoints = {200, 300, 300};
        g.fillPolygon(xPoints, yPoints, 3); // Triangle

        g.setColor(Color.BLACK);
        g.drawString("Shapes: Rectangle, Circle, Triangle", 50, 350);
    }
}

// Display text and colors
class TextColorApplet extends Applet {

    @Override
    public void init() {
        setBackground(Color.YELLOW);
    }

    @Override
    public void paint(Graphics g) {
        // Set font
        Font font = new Font("Arial", Font.BOLD, 20);
        g.setFont(font);

        // Draw different colored text
        g.setColor(Color.RED);
        g.drawString("Red Text", 50, 50);

        g.setColor(Color.BLUE);
        g.drawString("Blue Text", 50, 100);

        g.setColor(Color.GREEN);
        g.drawString("Green Text", 50, 150);

        // Draw grid
        g.setColor(Color.BLACK);
        for (int i = 0; i < 500; i += 50) {
            g.drawLine(i, 200, i, 500);
            g.drawLine(0, 200 + i, 500, 200 + i);
        }
    }
}

// Animation applet (circle moving)
class AnimationApplet extends Applet implements Runnable {

    int x = 50;
    int direction = 1;
    Thread thread;

    @Override
    public void init() {
        setBackground(Color.WHITE);
        setSize(500, 200);
    }

    @Override
    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, 50, 50, 50);  // Moving circle

        g.setColor(Color.BLACK);
        g.drawString("Animated Circle", 200, 100);
    }

    @Override
    public void run() {
        while (true) {
            x += direction * 5;

            if (x > 400) direction = -1;
            if (x < 0) direction = 1;

            repaint();

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//  QUESTION 4 
// Button click counter in applet
class ClickCounterApplet extends Applet implements MouseListener {

    int clickCount = 0;


    @Override
    public void init() {
        setBackground(Color.LIGHT_BLUE);
        addMouseListener(this);
    }


    @Override
    public void paint(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 24);
        g.setFont(font);

        g.setColor(Color.BLACK);
        g.drawString("Click Count: " + clickCount, 50, 100);

        g.drawString("Click anywhere to increase count", 30, 150);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        clickCount++;
        repaint();
    }


    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}

// Main class (just for documentation)
public class BookQuestions {
    /*
    COMPILATION:
    javac BookQuestions.java

    FOR EACH APPLET, CREATE AN HTML FILE:

    Q1 - ShapeApplet.html:
    <html>
    <applet code="ShapeApplet.class" width="500" height="400"></applet>
    </html>

    Q2 - TextColorApplet.html:
    <html>
    <applet code="TextColorApplet.class" width="500" height="400"></applet>
    </html>

    Q3 - AnimationApplet.html:
    <html>
    <applet code="AnimationApplet.class" width="500" height="200"></applet>
    </html>

    Q4 - ClickCounterApplet.html:
    <html>
    <applet code="ClickCounterApplet.class" width="500" height="200"></applet>
    </html>

    RUN WITH: appletviewer filename.html
    */

    public static void main(String[] args) {
        System.out.println(" APPLET QUESTIONS ");
        System.out.println("Q1: Display different shapes (Rectangle, Circle, Triangle)");
        System.out.println("Q2: Display text in different colors");
        System.out.println("Q3: Animate a moving circle");
        System.out.println("Q4: Count mouse clicks in applet");
        System.out.println("\nCreate HTML files and run with: appletviewer filename.html");
    }
}
