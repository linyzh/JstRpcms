package com.benliu.utils;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月24日
 */
public class StringUtils {

	/**
	 * data can not be blank or null, undefined else.
	 * 
	 * @author yzh.lin
	 * @since 2015-10-24 AM 1:19:46
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		boolean result = false;
		if (null != str && clearBlank(str).length() > 0 && !"null".equalsIgnoreCase(str)
				&& !"undefined".equalsIgnoreCase(str)) {
			result = true;
		}
		return result;
	}

	public static boolean isObjNotBlank(Object obj) {
		boolean result = false;
		if (null != obj && isNotBlank(obj.toString())) {
			result = true;
		}
		return result;
	}

	public static boolean isObjBlank(Object obj) {
		boolean result = true;
		if (isObjNotBlank(obj)) {
			result = false;
		}
		return result;
	}

	/**
	 * data is blank or null, undefined.
	 * 
	 * @author yzh.lin
	 * @since 2015-10-24 AM 1:20:39
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str) {
		boolean result = true;
		if (isNotBlank(str)) {
			result = false;
		}
		return result;
	}

	public static String clearBlank(String str) {
		if (null != str) {
			str = str.replaceAll(" ", "");
			str = str.replaceAll("	", "");
		}
		return str;
	}
	
	public static boolean isTrue(String str) {
		if (isNotBlank(str)) {
			return "true".equalsIgnoreCase(str);
		}
		return false;
	}
	
	public static String lowerCaseFirst(String str){
		if(isNotBlank(str)){
			str = str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(Character.toLowerCase(str.charAt(0))));
		}
		return str;
	}
	
	public static String upperCaseFirst(String str){
		if(isNotBlank(str)){
			str = str.replaceFirst(String.valueOf(str.charAt(0)), String.valueOf(Character.toUpperCase(str.charAt(0))));
		}
		return str;
	}
	
	/**
	 * String convert to hump format
	 * @param sourceStr
	 * @param separatorStr default: "_"
	 * @return
	 */
	public static String toHumpStr(String sourceStr, String ... separatorStr){
		String result = null;
		if(isNotBlank(sourceStr)){
			if(0 == separatorStr.length){
				separatorStr = new String[]{"_"};
			}
			
			for(String s : separatorStr) {
				if(sourceStr.contains(s)) {
					String[] strArr = sourceStr.split(s);
					for(String str : strArr){
						str = str.toLowerCase();
						if(null==result){
							result = str;
						}else{
							result = result.concat(upperCaseFirst(str));
						}
					}
				}
			}
		}
		// return itself when sourceStr haven't contains separatorStr
		return null == result ? sourceStr : result;
	}
	
	/**
	 * 
	 * @param sourceStr
	 * @param separatorStr
	 * @param upperLower 1:lowerCase, 2:upperCase
	 * @return
	 */
	public static String hump2dbFieldStr(String sourceStr, String separatorStr, Integer upperLower){
		
		String resultStr = null;
		
		if(isNotBlank(sourceStr)){
			
			char[] charArr = sourceStr.toCharArray();
			
			for(char ch : charArr){
				if(null==resultStr){
					resultStr = String.valueOf(ch);
				}else if(Character.isUpperCase(ch)){
					resultStr = resultStr.concat(separatorStr).concat(String.valueOf(ch));
				}else{
					resultStr = resultStr.concat(String.valueOf(ch));
				}
				
			}
			
		}
		if(null!=upperLower){
			if(1==upperLower.intValue()){
				resultStr = resultStr.toLowerCase();
			}else if(2==upperLower.intValue()){
				resultStr = resultStr.toUpperCase();
			}
		}
		return resultStr;
	}
	
}
