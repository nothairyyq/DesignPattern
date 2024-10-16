package com.priska.matter.coupon;

/**
 * @program: IntelliJ IDEA
 * @description: 模拟优惠券服务
 * @author: Priska
 * @create: 2024-10-14
 */
public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid){
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
