package io.j2ffrey_2.bongsaggun;

/**
 * Created by Dong on 2015-11-12.
 */
public class ZzimListItem {

    Integer imgSumnail;
    String title;
    Integer dDay;
    String voluntaryPeriodStart;
    String voluntaryPeriodEnd;
    String voluntaryLocation;
    String voluntaryOragination;
    Integer voluntaryTime;

    public ZzimListItem() {
        this.imgSumnail = 0;
        this.title = "";
        this.dDay = 0;
        this.voluntaryPeriodStart = "";
        this.voluntaryPeriodEnd = "";
        this.voluntaryLocation = "";
        this.voluntaryOragination = "";
        this.voluntaryTime = 0;
    }

    public ZzimListItem(Integer imgSumnail, String title, Integer dDay, String voluntaryPeriodStart, String voluntaryPeriodEnd, String voluntaryLocation, String voluntaryOragination, Integer voluntaryTime) {
        this.imgSumnail = imgSumnail;
        this.title = title;
        this.dDay = dDay;
        this.voluntaryPeriodStart = voluntaryPeriodStart;
        this.voluntaryPeriodEnd = voluntaryPeriodEnd;
        this.voluntaryLocation = voluntaryLocation;
        this.voluntaryOragination = voluntaryOragination;
        this.voluntaryTime = voluntaryTime;
    }



    public Integer getImgSumnail() {
        return imgSumnail;
    }

    public void setImgSumnail(Integer imgSumnail) {
        this.imgSumnail = imgSumnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getdDay() {
        return dDay;
    }

    public void setdDay(Integer dDay) {
        this.dDay = dDay;
    }

    public String getVoluntaryPeriodStart() {
        return voluntaryPeriodStart;
    }

    public void setVoluntaryPeriodStart(String voluntaryPeriodStart) {
        this.voluntaryPeriodStart = voluntaryPeriodStart;
    }

    public String getVoluntaryPeriodEnd() {
        return voluntaryPeriodEnd;
    }

    public void setVoluntaryPeriodEnd(String voluntaryPeriodEnd) {
        this.voluntaryPeriodEnd = voluntaryPeriodEnd;
    }

    public String getVoluntaryLocation() {
        return voluntaryLocation;
    }

    public void setVoluntaryLocation(String voluntaryLocation) {
        this.voluntaryLocation = voluntaryLocation;
    }

    public String getVoluntaryOragination() {
        return voluntaryOragination;
    }

    public void setVoluntaryOragination(String voluntaryOragination) {
        this.voluntaryOragination = voluntaryOragination;
    }

    public Integer getVoluntaryTime() {
        return voluntaryTime;
    }

    public void setVoluntaryTime(Integer voluntaryTime) {
        this.voluntaryTime = voluntaryTime;
    }


}