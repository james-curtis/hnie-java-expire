package com.example.phone.entity;

import com.example.phone.common.BasePhone;

/**
 * @author th
 */
public class XiaomiPhone extends BasePhone {
    public XiaomiPhone(){
        super.setBrand("小米");
        super.setModel("小米6s");
        super.setOs("mi_9");
        super.setPrice(4999);
        super.setMemory(6);
    }
}
