package top.helwor.util;

public class Api {
    // 登录接口（未完成）
    public static final String LOGIN_URL = "";

    // 健康上报接口
    public static final String HEALTH_URL = "http://61.163.246.8:82/Health/Submit";

    // 登陆人信息接口
    public static final String LOGIN_INFO = "http://61.163.246.8:82/User/GetCardInfoByAccountNoParm";

    // 部分上报信息，用于拼接，意思是健康，未与高危人员接触
    public static final String BODY_JSON = "&jqqxbz=&cxzz=1000000000&mqzz=0&whpl=0&yqryjc=0&backdate=&zzbz=&json=true";

}
