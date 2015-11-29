package io.j2ffrey_2.bongsaggun;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dong on 2015-10-06.
 */
public class CalendarItem {

    int voluntaryId;
    int day;
    @SerializedName("weekday")
    String dayOfWeek;
    @SerializedName("name")
    String title;
    @SerializedName("d_day")
    int dDay;
    String region;
    int type;
    int voluntaryTime;  //Todo: 추가해달라고 말하기

    public int getVoluntaryId() {
        return voluntaryId;
    }

    public void setVoluntaryId(int voluntaryId) {
        this.voluntaryId = voluntaryId;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getdDay() {
        return dDay;
    }

    public void setdDay(int dDay) {
        this.dDay = dDay;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CalendarItem(int voluntaryId, int day, String dayOfWeek, String title, int dDay, String region, int type) {
        this.voluntaryId = voluntaryId;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
        this.title = title;
        this.dDay = dDay;
        this.region = region;
        this.type = type;
    }
}
