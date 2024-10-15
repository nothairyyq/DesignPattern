package com.priska.design.imple;

import com.priska.design.IVideoUserService;

/**
 * @program: IntelliJ IDEA
 * @description: VIP用户服务
 * @author: Priska
 * @create: 2024-10-14
 */
public class VipVideoUserService implements IVideoUserService {

    @Override
    public void definition() {
        System.out.println("VIP用户，1080P视频");
    }


    @Override
    public void advertisement() {
        System.out.println("VIP用户，没广告");
    }
}
