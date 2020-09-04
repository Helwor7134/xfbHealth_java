package top.helwor.main;

import top.helwor.util.Api;
import top.helwor.util.HttpSubmit;

public class Home {
    public static void main(String[] args){
        HttpSubmit hs = new HttpSubmit();
        // 运行前先去top.helwor.util.HttpSubmit里设置好自己的信息
        hs.doPost(Api.URL);
    }
}
