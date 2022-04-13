package com.daodao.web.request;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";
        String encode = URLEncoder.encode(username, "UTF-8");
        System.out.println(encode);

        String decode = URLDecoder.decode(encode, "ISO-8859-1");
        System.out.println(decode);

        byte[] bytes = decode.getBytes(StandardCharsets.ISO_8859_1);
//        for (byte b : bytes) {
//            System.out.print(b + " ");
//        }
        String s = new String(bytes, "utf-8");
        System.out.println(s);

    }
}
