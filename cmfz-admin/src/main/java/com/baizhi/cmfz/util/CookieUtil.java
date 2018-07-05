package com.baizhi.cmfz.util;

import javax.servlet.http.Cookie;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by yx on 2018/7/5.
 */
public class CookieUtil {
    public static Cookie createCookie(String cookieName, String value, String encoding) {
        Cookie cookie = null;
        try {
            cookie = new Cookie(cookieName, URLEncoder.encode(value, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return cookie;
    }

    public static String getCookieValueByName(Cookie[] cookies, String cookieName, String encoding) {
        String result = null;
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals(cookieName)) {
                try {
                    result = URLDecoder.decode(cookie.getValue(), "utf-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }
}