package com.example.phone.service.impl;

import com.example.phone.common.BasePhone;
import com.example.phone.entity.HonorPhone;
import com.example.phone.entity.XiaomiPhone;
import com.example.phone.service.IPhoneService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author th
 */
@Slf4j
public class PhoneServiceImpl implements IPhoneService {

    private List<BasePhone> phoneList = new ArrayList<>();

    /**
     * 加载手机列表
     *
     * @return list of phone
     */
    @Override
    public List<BasePhone> loadPhoneList() {
        BasePhone honor = new HonorPhone();
        honor.setDefaultContactName("妈妈");
        honor.setDefaultSongName("好汉歌");
        honor.setDefaultGameName("猜字");
        phoneList.add(honor);
        BasePhone mi = new XiaomiPhone();
        mi.setDefaultContactName("姐姐");
        mi.setDefaultSongName("Without You");
        mi.setDefaultGameName("猜字");
        phoneList.add(mi);
        return phoneList;
    }

    /**
     * 测试所有手机的功能
     */
    @Override
    public void testAllPhone() {
        testAllPhone(phoneList);
    }

    /**
     * 测试所有手机的功能
     *
     * @param phoneList 手机列表
     */
    @Override
    public void testAllPhone(List<BasePhone> phoneList) {
        for (BasePhone phone : phoneList) {
            phone.display();
            log.info("");
            phone.callUp();
            phone.play();
            phone.listening();
            log.info("**********************");
        }
    }
}
