import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Closing extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}