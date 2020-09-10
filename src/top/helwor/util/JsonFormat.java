package top.helwor.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class JsonFormat {
    public static String toBodyJson(String phone,String address){
        String bodyJson = null;
        try {
            bodyJson = "phone="+phone+"&jqqx="+ URLEncoder.encode(address, "utf-8")+ Api.BODY_JSON;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return bodyJson;
    }
}
