package top.helwor.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import top.helwor.entity.LoginInfo;

import java.io.IOException;

public class HttpSubmit {

    private String url;
    private String phone;
    private String address;
    private String cookie;

    public HttpSubmit() {}

    /**
     * @param url 接口地址
     * @param phone 电话号码
     * @param address 现居住地
     * @param cookie cookie信息
     */
    public HttpSubmit(String url, String phone, String address, String cookie) {
        this.url = url;
        this.phone = phone;
        this.address = address;
        this.cookie = cookie;
    }

    public HttpSubmit(String url, LoginInfo loginInfo) {
        this.url = url;
        this.phone = loginInfo.getPhone();
        this.address = loginInfo.getAddress();
        this.cookie = loginInfo.getCookie();
    }



    public String doPost(){
        // 准备请求体数据
        String jsonBody = JsonFormat.toBodyJson(phone,address);

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try{
            HttpPost httpPost = new HttpPost(url);
            httpPost.addHeader("Host", "61.163.246.8:82");
            httpPost.addHeader("Connection", "keep-alive");
            httpPost.addHeader("Pragma", "no-cache");
            httpPost.addHeader("Cache-Control", "no-cache");
            httpPost.addHeader("Accept", "application/json, text/javascript, */*; q=0.01");
            httpPost.addHeader("Origin", "http://61.163.246.8:82");
            httpPost.addHeader("X-Requested-With", "XMLHttpRequest");
            httpPost.addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 6.0.1; MuMu Build/V417IR; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/52.0.2743.100 Mobile Safari/537.36");
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
            httpPost.addHeader("Referer", "http://61.163.246.8:82/PPage/ComePage");
            httpPost.addHeader("Accept-Encoding", "gzip, deflate");
            httpPost.addHeader("Accept-Language", "zh-CN,en-US;q=0.8");
            httpPost.addHeader("Cookie", cookie);
            String jsonStr = jsonBody;
            StringEntity entity = new StringEntity(jsonStr);
            httpPost.setEntity(entity);
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(),"utf-8");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭资源
            if(response != null){
                try {
                    response.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            if(httpClient != null){
                try{
                    httpClient.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
        }
        return result;
    }
}
