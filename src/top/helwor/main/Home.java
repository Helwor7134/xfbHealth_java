package top.helwor.main;

import top.helwor.util.Api;
import top.helwor.util.HttpSubmit;

public class Home {
    public static void main(String[] args){
        HttpSubmit hs = new HttpSubmit();
        hs.doPost(Api.URL);
    }
}
