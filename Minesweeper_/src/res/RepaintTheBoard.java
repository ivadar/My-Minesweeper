package res;

import java.awt.*;

public class RepaintTheBoard implements Runnable {
    Window window;

    public RepaintTheBoard(Window window) {
        this.window = window;
    }

    @Override
    public void run() {
        this.window.repaint();
    }
}
