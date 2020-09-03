package com.mashibing.tank;

        import java.awt.*;
        import java.awt.event.*;

/**
 * @version: 1.0 2020-09-01-11:04 下午
 * @author: Yao
 */
public class TankFrame extends Frame {
    int x = 200;
    int y = 200;
    Dir dir = Dir.DOWN;
    final static int SPEED = 10;

    public TankFrame() {
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setTitle("tan war" +
                "----");

        this.addKeyListener(new MyKeyListener() {});

        //关闭窗口
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
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

    public class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            System.out.println("kp");
            setMainTankDir();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    x += 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    y += 10;
                    break;
                default:
                    break;
            }
            System.out.println("kr");
            setMainTankDir();
        }

        private void setMainTankDir() {
            if(bL) dir = Dir.LEFT;
            if(bR) dir = Dir.RIGHT;
            if(bU) dir = Dir.UP;
            if(bD) dir = Dir.DOWN;
        }
    }



}
