package com.priska.matter.goods;

import com.alibaba.fastjson.JSON;

/**
 * @program: IntelliJ IDEA
 * @description: 商品服务
 * @author: Priska
 * @create: 2024-10-14
 */
public class GoodsService {
    public Boolean deliverGoods(DeliverReq req){
        System.out.println("发货商品一个"+ JSON.toJSONString(req));
        return true;
    }
}
