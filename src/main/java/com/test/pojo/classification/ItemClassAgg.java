package com.test.pojo.classification;

public class ItemClassAgg {
    private ItemDataList data;
    private int code = 200;
    private String msg = "test";
    public ItemDataList getData() {
        return data;
    }

    public void setData(ItemDataList data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
