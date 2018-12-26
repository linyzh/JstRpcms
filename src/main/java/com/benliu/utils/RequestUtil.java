package com.benliu.utils;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RequestUtil {

    public static JSONObject getJSONObject(HttpServletRequest request) {
        JSONObject ret = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            ret = JSONObject.fromObject(new String(sb));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //LogUtil.LogError(new RequestUtil(), e.toString());
            e.printStackTrace();
        }
        return ret;
    }
}
