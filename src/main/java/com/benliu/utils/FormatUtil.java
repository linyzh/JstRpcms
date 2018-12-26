package com.benliu.utils;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/8/17.
 */
public class FormatUtil {
    private static DecimalFormat df = new DecimalFormat("#0.00");
    private static SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat timeSdf2 = new SimpleDateFormat("MM-dd HH:mm");
    private static SimpleDateFormat daySdf = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat timeSdf3 = new SimpleDateFormat("MM-dd HH:mm:ss");

    public static synchronized String StrFormat(Double number) {
        String str = df.format(number);
        return str.equals("0.00") ? "0" : str;
    }

    public static synchronized String TimeFormat(Timestamp ts) {
        return timeSdf.format(ts);
    }

    public static synchronized String TimeFormat(Date date) {
        return timeSdf.format(date);
    }

    public static synchronized String TimeFormat2(Date date) {
        return timeSdf2.format(date);
    }

    public static synchronized String TimeFormat3(Date date) {
        return timeSdf3.format(date);
    }


    public static synchronized String DayFormat(Timestamp ts) {
        return daySdf.format(ts);
    }

    public static synchronized Date StrParseDate(String dateStr) {
        try {
            Date date = daySdf.parse(dateStr);
            return date;
        } catch (java.text.ParseException parseException) {
            parseException.printStackTrace();
        }
        return new Date();
    }

    public static synchronized Date StrParseTime(String timeStr) {
        try {
            Date date = timeSdf.parse(timeStr);
            return date;
        } catch (java.text.ParseException parseException) {
            System.out.println(timeStr);
            parseException.printStackTrace();
        }
        return new Date();
    }

    public static synchronized String DayFormat(Date ts) {
        return daySdf.format(ts);
    }

    public static synchronized Map<String, String> JSONtoHashMap(JSONObject queryJson) {
        Map<String, String> data = new HashMap<>();

        Iterator<?> it = queryJson.keys();
        // 遍历jsonObject数据，添加到Map对象
        while (it.hasNext())
        {
            String key = String.valueOf(it.next());
            String value = queryJson.getString(key);
            data.put(key, value);
        }
        return data;
    }
}
