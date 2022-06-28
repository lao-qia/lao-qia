package com.ltzsy.date;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @description: 这里用一句话描述这个类的作用 <br>
 * @version: 1.0 <br>
 * @author: leevi.li <br>
 * @create: 2022/6/28 10:14 <br>
 * @update: 2022/6/28 10:14 <br>
 * @since jdk11.0.5_10
 */
public class DateUtil {

    public static void main(String[] args) {
        System.out.println(getCalendar());
    }

    /**
     * @description: 获取格式化后的时间 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 10:50 <br>
     * @update: 2022/6/28 10:50 <br>
     * @param: format 格式
     * @return java.lang.String
     */
    public static String getFormatedCurrentTime(String format){
        Calendar calendar = getCalendar();
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateStr = sdf.format(date);
        return dateStr;
    }

    /**
     * @description: 获取当前年份 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 11:34 <br>
     * @update: 2022/6/28 11:34 <br>
     * @param:
     * @return int
     */
    public static int getCurrentYear(){
        Calendar calendar = getCalendar();
        return calendar.get(Calendar.YEAR);
    }

    /**
     * @description: 获取当前月份 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 11:38 <br>
     * @update: 2022/6/28 11:38 <br>
     * @param:
     * @return int
     */
    public static int getCurrentMonth(){
        Calendar calendar = getCalendar();
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * @description: 获取当前月天数 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 11:38 <br>
     * @update: 2022/6/28 11:38 <br>
     * @param:
     * @return int
     */
    public static int getCurrentDayOfMonth(){
        Calendar calendar = getCalendar();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * @description: 获取当前年的天数 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 11:39 <br>
     * @update: 2022/6/28 11:39 <br>
     * @param:
     * @return int
     */
    public static int getCurrentDayOfYear(){
        Calendar calendar = getCalendar();
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    /**
     * @description: 获取当前时间 <br>
     * @version: 1.0 <br>
     * @author: leevi.li <br>
     * @create: 2022/6/28 11:33 <br>
     * @update: 2022/6/28 11:33 <br>
     * @param:
     * @return java.util.Calendar
     */
    public static Calendar getCalendar(){
        TimeZone timeZone = TimeZone.getTimeZone("GMT+8");
        Locale locale = Locale.CHINESE;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        return  calendar;
    }
}
