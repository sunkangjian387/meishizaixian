package com.gaoshu.util;

public class YZMUtil {
    public static String getYZM(){
       String a="";
       for (int i=0;i<6;i++){
           double uzm= Math.random()*10;
           a+=(int)uzm;
        }
        return  a;
    }
}
