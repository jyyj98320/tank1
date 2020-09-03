package com.mashibing.tank;

import java.awt.*;

/**
 * @version: 1.0 2020-09-03-5:17 下午
 * @author: Yao
 */
public class Tank {
    private int x, y;
    private Dir dir = Dir.DOWN;
    private static final int SPEED = 10;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }
    public void paint(Graphics g){

        g.fillRect(x, y, 50, 50);

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            default:
                break;
        }
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }
}
