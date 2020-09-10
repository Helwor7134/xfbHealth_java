package top.helwor.main;

import top.helwor.entity.LoginInfo;
import top.helwor.util.Api;
import top.helwor.util.HttpSubmit;

public class Home {
    public static void main(String[] args){
        /**
         * 使用演示
         * 1.创建LoginInfo对象
         * 2.发起请求
         * 返回值为json字符串，msg的值为null就代表请求成功，-404表示请求失败
         */
        LoginInfo loginInfo = new LoginInfo("电话号码","现居住地","cookie信息");

        String result = new HttpSubmit(Api.HEALTH_URL,loginInfo).doPost();

        System.out.println(result);
    }
}
