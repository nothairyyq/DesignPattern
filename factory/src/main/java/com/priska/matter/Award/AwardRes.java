package com.priska.matter.Award;

/**
 * @program: IntelliJ IDEA
 * @description: 发奖结果
 * @author: Priska
 * @create: 2024-10-14
 */
public class AwardRes {
    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
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
