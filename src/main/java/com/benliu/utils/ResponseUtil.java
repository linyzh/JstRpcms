package com.benliu.utils;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class ResponseUtil {

    public static void responseJSON(HttpServletResponse response, JSONObject ret) {
        response.setHeader("Content-type", "text/html;charset=GBK");
        try {
            OutputStream os = response.getOutputStream();
            os.write(ret.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void responseJSON(HttpServletResponse response, String str) {
        response.setHeader("Content-type", "text/html;charset=GBK");
        try {
            OutputStream os = response.getOutputStream();
            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
