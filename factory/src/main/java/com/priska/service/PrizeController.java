package com.priska.service;

import com.alibaba.fastjson.JSON;
import com.priska.matter.Award.AwardReq;
import com.priska.matter.Award.AwardRes;
import com.priska.matter.card.IQYCardService;
import com.priska.matter.coupon.CouponResult;
import com.priska.matter.coupon.CouponService;
import com.priska.matter.goods.DeliverReq;
import com.priska.matter.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @program: IntelliJ IDEA
 * @description: 模拟发奖
 * @author: Priska
 * @create: 2024-10-14
 */
public class PrizeController {

    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){
        AwardRes awardRes = null;
        String reqJSON = JSON.toJSONString(req);

        try {
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJSON);
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1){
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(),req.getAwardNumber(),req.getBizId());
                if ("0000".equals(couponResult.getCode())) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            } else if (req.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if (req.getAwardType() == 3) {
                String bindMobileNumber = queryUserPhoneNumber(req.getuId());
                IQYCardService iQiYiCardService = new IQYCardService();
                iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            }

        }catch (Exception e){
            logger.error("奖品发放失败{}。req:{}", req.getuId(), reqJSON, e);
            awardRes = new AwardRes("0001",e.getMessage());
        }
        return awardRes;
    }

    private String queryUserPhoneNumber(String s) {
        return "15200101232";
    }

    private String queryUserName(String s) {
        return "花花";
    }
}
