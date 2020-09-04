package top.helwor.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpSubmit {

    // 发送请求
    public String doPost(String url){
        //创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String result = "";
        try{
            //创建http请求
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
            httpPost.addHeader("Cookie", "这里换成你自己的");
            //创建请求内容
            String jsonStr = "这里就是你要提交的信息内容，也要换成自己的";
            StringEntity entity = new StringEntity(jsonStr);
            httpPost.setEntity(entity);
            response = httpClient.execute(httpPost);
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            // 输出返回信息
            System.out.println(result);
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
