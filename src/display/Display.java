package display;


import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private int width;
    private int heigth;

    public Display(String title, int width, int height){

        this.title = title;
        this.width = width;
        this.heigth = height;

        createDisplay();

    }

    private void createDisplay(){

        frame = new JFrame(title);
        frame.setSize(width, heigth);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, heigth));
        canvas.setMaximumSize(new Dimension(width, heigth));
        canvas.setMinimumSize(new Dimension(width, heigth));

        frame.add(canvas);
        frame.pack();

    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
