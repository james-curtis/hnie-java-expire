package com.example.phone.common;

/**
 * @author th
 */
public interface ICallUp {

    /**
     * 拨打指定联系人
     * @param target
     */
    void callUp(String target);

    /**
     * 拨打默认联系人
     */
    void callUp();
}
