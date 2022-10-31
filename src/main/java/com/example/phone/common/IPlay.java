package com.example.phone.common;

/**
 * @author th
 */
public interface IPlay {

    /**
     * 玩给定的游戏
     * @param name 游戏名
     */
    void play(String name);

    /**
     * 玩默认的游戏
     */
    void play();
}
