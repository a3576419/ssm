package com.test.pojo;

public class Stores {
    //s_id        商店ID
    //s_remarks   简介
    //s_longLat   位置
    //s_title     名称
    //s_img       图片
    //g_id        gid
    //g_img

    private int s_id;
    private String s_remarks;
    private String s_longLat;
    private String s_title;
    private String s_img;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_remarks() {
        return s_remarks;
    }

    public void setS_remarks(String s_remarks) {
        this.s_remarks = s_remarks;
    }

    public String getS_longLat() {
        return s_longLat;
    }

    public void setS_longLat(String s_longLat) {
        this.s_longLat = s_longLat;
    }

    public String getS_title() {
        return s_title;
    }

    public void setS_title(String s_title) {
        this.s_title = s_title;
    }

    public String getS_img() {
        return s_img;
    }

    public void setS_img(String s_img) {
        this.s_img = s_img;
    }

    @Override
    public String toString() {
        return "Stores{" +
                "s_id=" + s_id +
                ", s_remarks='" + s_remarks + '\'' +
                ", s_longLat='" + s_longLat + '\'' +
                ", s_title='" + s_title + '\'' +
                ", s_img='" + s_img + '\'' +
                '}';
    }
}
