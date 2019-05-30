import java.awt.*;
public class AppWindow extends Frame {
    String msg = "";
    int mouseX = 0, mouseY = 0;
    public AppWindow() {
        addWindowListener(new Closing());
        addMouseListener(new Mouse(this));
        addKeyListener(new MyKey(this));
    }
    public void paint(Graphics g) {
        g.drawString(msg, 10, 40);
    }
}