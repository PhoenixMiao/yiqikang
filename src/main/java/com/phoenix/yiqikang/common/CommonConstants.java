package com.phoenix.yiqikang.common;

import java.util.*;

/**
 * @author phoenix
 * @version 2022/1/19 19:21
 */
public class CommonConstants {

    public final static String SESSION = "session";
    public final static String APP_NAME = "yiqikang";
    public final static String SHADOW_TEST = "shadow-test";
    public final static String SEPARATOR = ",";
    public final static String CHAT_RECORD_COLLECTION_NAME = "chat_record";
    public final static String WX_SESSION_REQUEST_URL = "https://api.weixin.qq.com/sns/jscode2session";

    //https://pay.weixin.qq.com/wiki/doc/apiv3/apis/chapter3_5_1.shtml
    public final static String WX_PAY_REQUEST_URL = "https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi";
    public final static String CNY_CURRENCY = "CNY";
    public final static String SIGN_TYPE_RSA = "RSA";
    public final static String SIGN_TYPE_HMAC_SHA256 = "HMAC-SHA256";
    public final static String LANG_TYPE_ZH_CN = "zh_CN";
    public final static ArrayList<String> ESTIMATE_TYPE_NAME_LIST = new ArrayList<String>(Arrays.asList("社交行为","注意力","执行功能","社会性注意","非口语社交技巧","告别","社会性注意","自我意识","问候","高阶礼仪","电话礼仪","注意稳定","注意广度","注意转移","注意分配","工作记忆","心灵灵活性"));
    public static final Map<String, Integer> ESTIMATE_TYPE_NAME_SCORE_LIST = Collections.unmodifiableMap(new HashMap<String,Integer>() {
        private static final long serialVersionUID = 1L;
        {
            put("社交行为",47);
            put("注意力",6);
            put("执行功能",7);
            put("社会性注意",7);
            put("非口语社交技巧",5);
            put("告别",7);
            put("问候",10);
            put("自我意识",7);
            put("高阶礼仪",5);
            put("抑制控制",2);
            put("电话礼仪",3);
            put("口语社交技巧",2);
            put("注意稳定",3);
            put("注意广度",1);
            put("注意分配",1);
            put("注意转移",1);
            put("工作记忆",1);
            put("心灵灵活性",4);
        }
    });
}
