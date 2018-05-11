package com.wenjie.dubbo.api.SPI.impl;

import com.wenjie.dubbo.api.SPI.SpiService;

/**
 * Created by Gongwenjie on 2018-05-10
 */
public class ExtendsSpiService implements SpiService {
    @Override
    public String getProviderName() {
        return "This is  拓展实现！";
    }
}
