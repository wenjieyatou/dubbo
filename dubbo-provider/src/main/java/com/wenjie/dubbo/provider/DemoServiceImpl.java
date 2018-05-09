package com.wenjie.dubbo.provider;

import com.wenjie.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gongwenjie on 2018-05-09
 */
public class DemoServiceImpl implements DemoService {
    public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }
}
