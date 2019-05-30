import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        AppWindow appWindow = new AppWindow();
        appWindow.setSize(new Dimension(500,500));
        appWindow.setTitle("appWindow");
        appWindow.setVisible(true);
    }
}