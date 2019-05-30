import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Mouse extends MouseAdapter {
    AppWindow appWindow;
    public Mouse(AppWindow appWindow) {
        this.appWindow = appWindow;
    }
    public void mousePressed(MouseEvent me) {
        appWindow.mouseX = me.getX();
        appWindow.mouseY = me.getY();
        appWindow.msg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}