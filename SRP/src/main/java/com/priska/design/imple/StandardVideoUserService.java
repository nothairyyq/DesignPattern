package com.priska.design.imple;

import com.priska.design.IVideoUserService;

/**
 * @program: IntelliJ IDEA
 * @description: 普通注册用户服务
 * @author: Priska
 * @create: 2024-10-14
 */
public class StandardVideoUserService implements IVideoUserService {

    @Override
    public void definition() {
        System.out.println("普通用户，视频720P");
    }


    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
