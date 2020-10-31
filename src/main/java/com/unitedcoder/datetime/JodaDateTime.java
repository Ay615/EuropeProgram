package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.util.Set;

public class JodaDateTime {
    public static void main(String[] args) {
        //define a new joda date time
        DateTime date=new DateTime();
        System.out.println(date.toString());
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");
        System.out.println(date.toString(formatter));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println("Universal Time "+universalTime);
        DateTimeZone istanbulTimeZone=DateTimeZone.forID("Asia/Kashgar");
        DateTime istanbulTime=new DateTime(istanbulTimeZone);
        System.out.println("Asia/Kashgar time is : "+istanbulTime);
        Set<String> timeZones= ZoneId.getAvailableZoneIds();
        for(String s:timeZones){
            System.out.println(s);
        }
        //day year month
        System.out.println(universalTime.getDayOfMonth());
        System.out.println(universalTime.getMonthOfYear());
        System.out.println(universalTime.getYear());
        //get the day Name
        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsShortText());
        System.out.println(universalTime.plusDays(5));
        System.out.println(universalTime.minusDays(2));
        //get difference of two day
        DateTime beginDate=new DateTime("2020-10-20");//test case created day
        DateTime executeDate=new DateTime();
        Period period=new Period(beginDate,executeDate, PeriodType.days());
        Period period1=new Period(beginDate,executeDate,PeriodType.weeks());
        System.out.println("Total weeks: "+period1.getWeeks());
        System.out.println("Total days: "+period.getDays());
    }
}
