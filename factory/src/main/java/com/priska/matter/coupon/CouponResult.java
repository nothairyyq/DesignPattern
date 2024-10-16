package com.priska.matter.coupon;

/**
 * @program: IntelliJ IDEA
 * @description: 优惠券返回结果
 * @author: Priska
 * @create: 2024-10-14
 */
public class CouponResult {
    private String code;
    private String info;
    public CouponResult(String code, String info){
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
