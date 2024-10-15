package com.priska.design.imple;

import com.priska.design.IVideoUserService;

/**
 * @program: IntelliJ IDEA
 * @description: 访客用户服务
 * @author: Priska
 * @create: 2024-10-14
 */
public class GuestVideoUserService implements IVideoUserService {

    @Override
    public void definition() {
        System.out.println("访客，视频480P");
    }


    @Override
    public void advertisement() {
        System.out.println("访客，视频有广告");
    }
}
