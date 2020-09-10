package top.helwor.main;

import top.helwor.entity.LoginInfo;
import top.helwor.util.Api;
import top.helwor.util.HttpSubmit;
import top.helwor.util.JsonFormat;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Home {
    public static void main(String[] args){
        List<LoginInfo> loginInfoList = new ArrayList<>();
        /**
         * 使用演示
         * 1.准备数据
         * 2.发起请求
         */
        String phoneInfo = "15136568950"; // 这里是电话号码
        String addressInfo = "郑州市金水区"; // 这里是现居住地

        HttpSubmit submit = new HttpSubmit(Api.HEALTH_URL,JsonFormat.toBodyJson(phoneInfo,addressInfo),Api.COOKIE);
        System.out.println(submit.doPost());
    }
}
