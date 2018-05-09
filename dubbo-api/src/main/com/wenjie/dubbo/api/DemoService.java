package com.wenjie.dubbo.api;

import java.util.List;

/**
 * Created by Gongwenjie on 2018-05-09
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
