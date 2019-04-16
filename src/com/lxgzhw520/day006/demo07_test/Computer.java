package com.lxgzhw520.day006.demo07_test;/*
# 开发人员: 理想国真恵玩-张大鹏
# 开发团队: 理想国真恵玩
# 开发时间: 2019-04-16
# 文件名称: Computer.java
# 开发工具: IDEA
*/

public class Computer {
    public void powerOn() {
        System.out.println("电脑开机");
    }

    public void powerOff() {
        System.out.println("电脑关机");
    }

    public void useDevice(USB usb) {
        usb.open();
        if (usb instanceof Keyboard) {
            Keyboard k = (Keyboard) usb;
            k.type();
        } else if (usb instanceof Mouse) {
            Mouse m = (Mouse) usb;
            m.click();
        } else {
            System.out.println("暂不支持此设备.");
        }
        usb.close();
    }
}
