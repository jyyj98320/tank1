package com.mashibing.tank;

import sun.tools.attach.HotSpotVirtualMachine;

/**
 * @version: 1.0 2020-09-01-11:03 下午
 * @author: Yao
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();

        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }

    }



}
