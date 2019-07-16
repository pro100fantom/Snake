package com.company;

public class Hay {
    //Сена может быть много, поэтому не статик
    //Все файлы java  в одном пакете поэтому модификатор доступа не нужен

    static int x;
    static int y;


    //Присваиваем изображению файл с изображением

    public static void eatHay() {
        int newX = (int) (Math.random() * Window.WIDTH);
        int newY = (int) (Math.random() * Window.HEIGHT);
        boolean flag = true;
        for (BodySneake body : Window.bodySneakeArrayList
        ) {
            if (Math.abs(newX - body.x) < HeadSneake.WIDTH && Math.abs(newY - body.y) < HeadSneake.HEIGHT) {
                flag = false;
                break;
            }
        }

        if (flag) {
            if (!(Math.abs(newX - HeadSneake.x) < HeadSneake.WIDTH) && !(Math.abs(newY - HeadSneake.y) < HeadSneake.HEIGHT)) {
                x = newX;
                y = newY;
            } else eatHay();
        } else eatHay();
    }
}
