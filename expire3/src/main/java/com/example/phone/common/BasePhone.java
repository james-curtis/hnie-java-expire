package com.example.phone.common;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author th
 */
@Data
@Slf4j
public abstract class BasePhone implements ICallUp, IListening, IPlay, IDisplay {

    protected String brand;
    protected String model;
    protected String os;
    protected int price;
    protected int memory;
    protected String defaultContactName;
    protected String defaultSongName;
    protected String defaultGameName;

    @Override
    public void play() {
        play(defaultGameName);
    }

    @Override
    public void callUp(String target) {
        log.info("使用自动拨号功能:");
        log.info("{}的号。", target);
    }

    @Override
    public void play(String name) {
        log.info("玩{}游戏。", name);
    }

    @Override
    public void listening(String song) {
        log.info("{} begin play", song);
    }

    /**
     * 拨打默认联系人
     */
    @Override
    public void callUp() {
        callUp(defaultContactName);
    }

    /**
     * 听当前的歌
     */
    @Override
    public void listening() {
        listening(defaultSongName);
    }

    @Override
    public void display() {
        log.info(this.toString());
    }

    @Override
    public String toString() {
        return "品牌：" + brand +
            "\n型号：" + model +
            "\n操作系统：" + os +
            "\n价格：" + price +
            "\n内存：" + memory;
    }
}
