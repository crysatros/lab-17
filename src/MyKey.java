import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class MyKey extends KeyAdapter {
    AppWindow appWindow;
    public MyKey(AppWindow appWindow) {
        this.appWindow = appWindow;
    }
    Button but = new Button("Can u see me?");
    public void keyTyped(KeyEvent ke) {
        but.setSize(new Dimension(100, 100));
        but.setLocation(250,250);
        but.setEnabled(true);
        but.addActionListener(new CustomActionListener());
        appWindow.add(but);
        appWindow.repaint();
    }
    class CustomActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            but.setVisible(false);
        }
    }
}
