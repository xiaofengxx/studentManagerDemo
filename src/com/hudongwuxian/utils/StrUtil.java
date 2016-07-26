package com.hudongwuxian.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.jfinal.kit.StrKit;

public class StrUtil extends StrKit{
	static final char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    static final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final Random rand = new Random();
	static final String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	//检查是否为email地址
    public static boolean isEmail(String email) {
        if (isBlank(email)) {
            return false;
        } else {
            Pattern pattern = Pattern.compile(check);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    }
	//安全的转换字符串为数字
	public static int parseInt(String s){
		if(s == null || s.equals(""))
			return 0;
		return Integer.parseInt(s);
	}
	//用于生成唯一标识码
	public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
	//生成16进制随机数字符串 传入长度
	public static String randomString(int length) {
        StringBuffer sb = new StringBuffer();
        for (int loop = 0; loop < length; ++loop) {
            sb.append(hexDigits[rand.nextInt(hexDigits.length)]);
        }
        return sb.toString();
    }
	//生成十进制随机数字符串 传入长度
	public static String randomNumber(int length) {
        StringBuffer sb = new StringBuffer();
        for (int loop = 0; loop < length; ++loop) {
            sb.append(digits[rand.nextInt(digits.length)]);
        }
        return sb.toString();
    }
	//得到当前时间字符串 默认采用yyyy-MM-dd HH:mm:ss
	public static String getDate(){
		return getDate("yyyy-MM-dd HH:mm:ss");
	}
	public static String getDate(String format){
		SimpleDateFormat df = new SimpleDateFormat(format);//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
	}
}
