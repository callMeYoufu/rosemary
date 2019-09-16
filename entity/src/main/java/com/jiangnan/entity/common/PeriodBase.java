package com.jiangnan.entity.common;

/**
 * @CalssName PeriodBase
 * @Description 会计期
 * @Author grolia 1421764055@qq.com
 * @Date 2019/9/1610:43
 * @Version 1.0
 **/
public class PeriodBase {
    /**
     * 年会计期
     * */
    private String periodYear;

    /**
     * 半年会计期
     * */
    private String periodHalfYear;

    /**
     * 季会计期
     * */
    private String periodQuarter;

    /**
     * 月会计期
     * */
    private String periodMonth;

    /**
     * 周会计期
     * */
    private String periodWeek;

    /**
     * 日会计期
     * */
    private String periodDay;


    public String getPeriodYear() {
        return periodYear;
    }

    public void setPeriodYear(String periodYear) {
        this.periodYear = periodYear;
    }

    public String getPeriodHalfYear() {
        return periodHalfYear;
    }

    public void setPeriodHalfYear(String periodHalfYear) {
        this.periodHalfYear = periodHalfYear;
    }

    public String getPeriodQuarter() {
        return periodQuarter;
    }

    public void setPeriodQuarter(String periodQuarter) {
        this.periodQuarter = periodQuarter;
    }

    public String getPeriodMonth() {
        return periodMonth;
    }

    public void setPeriodMonth(String periodMonth) {
        this.periodMonth = periodMonth;
    }

    public String getPeriodWeek() {
        return periodWeek;
    }

    public void setPeriodWeek(String periodWeek) {
        this.periodWeek = periodWeek;
    }

    public String getPeriodDay() {
        return periodDay;
    }

    public void setPeriodDay(String periodDay) {
        this.periodDay = periodDay;
    }
}
