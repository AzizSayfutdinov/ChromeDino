import display.Display;

import java.awt.*;

public class Game implements Runnable{

    private String title;
    private int width;
    private int height;
    private Display display;


    public Game(String title, int width, int height){

        this.title = title;
        this.width = width;
        this.height = height;

        display = new Display(title, width, height);

    }


    @Override
    public void run() {



    }

    private void tick(){

    }

    private void render(Graphics g){

    }

    private void start(){

    }

    private void stop(){
        

    }


}
