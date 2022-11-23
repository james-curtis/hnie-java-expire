package com.example.phone.service;

import com.example.phone.common.BasePhone;

import java.util.List;

/**
 * @author th
 */
public interface IPhoneService {

    /**
     * 加载手机列表
     * @return list of phone
     */
    List<BasePhone> loadPhoneList();

    /**
     * 测试所有手机的功能
     */
    void testAllPhone();

    /**
     * 测试所有手机的功能
     * @param phoneList 手机列表
     */
    void testAllPhone(List<BasePhone> phoneList);
}
