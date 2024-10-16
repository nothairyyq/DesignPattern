package com.priska.Factory.store;

import java.util.Map;

/**
 * @program: IntelliJ IDEA
 * @description: 发放商品接口
 * @param:
 * @return:
 * @author: Priska
 * @create: 2024-10-15
 */
public interface ICommodity {
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
