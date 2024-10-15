package com.priska;

/**
 * @program: IntelliJ IDEA
 * @description: 视频用户服务没有使用单一职责原则
 * @author: Priska
 * @create: 2024-10-14
 */
public class VideoUserService {

    public void serverGrade(String userType){
        if ("VIP用户".equals(userType)){
            System.out.println("VIP用户，视频1080P");
        } else if ("普通用户".equals(userType)) {
            System.out.println("普通用户，视频720p");
        } else if ("访客用户".equals(userType)) {
            System.out.println("访客用户，视频480p");
        }
    }
}
