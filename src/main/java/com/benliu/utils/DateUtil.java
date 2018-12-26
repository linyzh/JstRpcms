package com.benliu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月24日
 */
public class DateUtil {

	public static String FULL_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static String FULL_PATTERN_WITHOUT_YEAR = "MM-dd HH:mm:ss";
	public static String SIMPLE_DATE_PATTERN = "yyyy-MM-dd";
	public static String MMDD_HHMM = "MM-dd HH:mm";
	
    private static final String START_DATE_SUFFIX = " 00:00:00";
    private static final String END_DATE_SUFFIX = " 23:59:59";
    /**
     * 	最近N小时内
     * @param hour
     * @return
     */
	public static Date recent(int hour) {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.HOUR, -hour);
		return calendar.getTime();
	}
	
	/**
	 * 	指定日期的最近N小时内
	 * @param date
	 * @param hour
	 * @return
	 */
	public static Date recent(Date date, int hour) {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, -hour);
		return calendar.getTime();
	}
	
	/**
	 * 	指定日期的开始时间
	 * @param dateStr
	 * @return
	 */
	public static String startDate(String dateStr) {
		return dateStr.concat(START_DATE_SUFFIX);
	}
	
	/**
	 * 	指定日期的结束时间
	 * @param dateStr
	 * @return
	 */
	public static String endDate(String dateStr) {
		return dateStr.concat(END_DATE_SUFFIX);
	}
	
	/**
	 * 	转换成指定日期的完整格式日期
	 * @param dateStr
	 * @return
	 */
	public static Date getFullDate(String dateStr) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(FULL_DATE_PATTERN);
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 	转换成完整格式的字符串日期
	 * @param date
	 * @return
	 */
	public static String getDateStr(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(FULL_DATE_PATTERN);
		return sdf.format(date);
	}
	/**
	 * 	转换成不带时间的日期
	 * @param dateStr
	 * @return
	 */
	public static Date getSimpleDate(String dateStr) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(SIMPLE_DATE_PATTERN);
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 	转换成指定格式的日期
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static Date getDate(String dateStr, String pattern) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
