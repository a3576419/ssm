package com.test.pojo.home;

public class ClassifyDataList {
    private int g_id;
    private String s_img;
    private String s_id;
    private String s_title;
    private int type = 0;
public ClassifyDataList(){}
    public ClassifyDataList(int i, String s) {
        setG_id(i);
        setS_title(s);
    }

    public int getG_id() {
        return g_id;
    }

    public void setG_id(int g_id) {
        this.g_id = g_id;
    }

    public String getS_img() {
        return s_img;
    }

    public void setS_img(String s_img) {
        this.s_img = s_img;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_title() {
        return s_title;
    }

    public void setS_title(String s_title) {
        this.s_title = s_title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
