package com.company;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        new Window();
    }


}

class Window extends JFrame{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static ArrayList<BodySneake> bodySneakeArrayList;
    public static boolean game;
    static Canvas canvas;
    public Window(){
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(WIDTH,HEIGHT);
    setResizable(false);
    setLayout(null);
    setVisible(true);
    canvas = new Canvas();
    add(canvas);
    canvas.setBounds(0,0,WIDTH,HEIGHT);
    bodySneakeArrayList.add(new BodySneake(HeadSneake.x-HeadSneake.WIDTH,HeadSneake.y));
    bodySneakeArrayList.add(new BodySneake(HeadSneake.x-2*HeadSneake.WIDTH,HeadSneake.y));
    game = false;
    new DrawThread().start();
    }
}

class Canvas extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.green.darker().darker());
        g.fillRect(0,0,Window.WIDTH,Window.HEIGHT);

        g.drawImage(HeadSneake.image,)
        /*
        Рисуем изображение головы
        Рисуем нужное количество тел
        Рисуем хвост
        Рисуем сено
        (Нужны картинки)
         */
    }
}

class DrawThread extends Thread{
    @Override
    public void run() {
        while (Window.game){
            Window.canvas.repaint();
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}