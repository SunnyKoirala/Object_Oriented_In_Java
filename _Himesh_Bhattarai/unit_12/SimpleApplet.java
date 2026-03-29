// Unit 12: Java Applets (Deprecated but Educational)
// Concept: Applets are Java programs that run in web browsers
// Note: Deprecated since Java 9, but included for educational purposes

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {

    // init() - Called once when applet is loaded
    @Override
    public void init() {
        setBackground(Color.LIGHT_GRAY);
        System.out.println("Applet initialized");
    }

    // start() - Called when applet becomes visible
    @Override
    public void start() {
        System.out.println("Applet started");
    }

    // paint() - Draws applet content
    @Override
    public void paint(Graphics g) {
        // Set font
        Font font = new Font("Arial", Font.BOLD, 24);
        g.setFont(font);

        // Draw string
        g.drawString("Hello from Java Applet!", 50, 50);

        // Draw shapes
        g.setColor(Color.BLUE);
        g.fillRect(50, 100, 200, 100);  // Rectangle

        g.setColor(Color.RED);
        g.fillOval(300, 100, 100, 100); // Circle

        g.setColor(Color.GREEN);
        g.drawLine(50, 250, 400, 250);  // Line

        // Display applet information
        g.setColor(Color.BLACK);
        g.drawString("Applet Width: " + getWidth(), 50, 300);
        g.drawString("Applet Height: " + getHeight(), 50, 330);
    }

    // stop() - Called when applet is no longer visible
    @Override
    public void stop() {
        System.out.println("Applet stopped");
    }

    // destroy() - Called before applet is removed
    @Override
    public void destroy() {
        System.out.println("Applet destroyed");
    }
}

/*
APPLET HTML FILE (save as SimpleApplet.html):

<html>
<body>
    <h1>Java Applet Example</h1>
    <applet code="SimpleApplet.class" width="500" height="400">
        Your browser does not support applets.
    </applet>
</body>
</html>

