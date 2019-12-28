package com.test.pojo.home;

import com.test.pojo.BannerDataList;

import java.util.List;

public class HeadData {
    //bannerDataList
    //classifyDataList
    //singleItem_1_DataList
    //singleItem_1_TitleImg
    //singleItem_2_TitleImg
    //unionItemDataList
    //unionTitleBgColor
    //unionTitleImg
    private String goods_head;
    private List<com.test.pojo.BannerDataList>BannerDataList;
    private List<ClassifyDataList>classifyDataList;
    private List<SingleItem_1_DataList>singleItem_1_dataList;
    private String singleItem_1_TitleImg;
    private List<SingleItem_2_DataList>singleItem_2_dataList;
    private String singleItem_2_TitleImg;
    private List<UnionClassifyDataList>unionClassifyDataList;
    private List<UnionItemDataList>unionItemDataList;
    private String unionTitleBgColor;
    private String unionTitleImg;

    public String getGoods_head() {
        return goods_head;
    }

    public void setGoods_head(String goods_head) {
        this.goods_head = goods_head;
    }

    public List<BannerDataList> getBannerDataList() {
        return BannerDataList;
    }

    public void setBannerDataList(List<BannerDataList> bannerDataList) {
        BannerDataList = bannerDataList;
    }

    public List<ClassifyDataList> getClassifyDataList() {
        return classifyDataList;
    }

    public void setClassifyDataList(List<ClassifyDataList> classifyDataList) {
        this.classifyDataList = classifyDataList;
    }

    public List<SingleItem_1_DataList> getSingleItem_1_dataList() {
        return singleItem_1_dataList;
    }

    public void setSingleItem_1_dataList(List<SingleItem_1_DataList> singleItem_1_dataList) {
        this.singleItem_1_dataList = singleItem_1_dataList;
    }

    public String getSingleItem_1_TitleImg() {
        return singleItem_1_TitleImg;
    }

    public void setSingleItem_1_TitleImg(String singleItem_1_TitleImg) {
        this.singleItem_1_TitleImg = singleItem_1_TitleImg;
    }

    public List<SingleItem_2_DataList> getSingleItem_2_dataList() {
        return singleItem_2_dataList;
    }

    public void setSingleItem_2_dataList(List<SingleItem_2_DataList> singleItem_2_dataList) {
        this.singleItem_2_dataList = singleItem_2_dataList;
    }

    public String getSingleItem_2_TitleImg() {
        return singleItem_2_TitleImg;
    }

    public void setSingleItem_2_TitleImg(String singleItem_2_TitleImg) {
        this.singleItem_2_TitleImg = singleItem_2_TitleImg;
    }

    public List<UnionClassifyDataList> getUnionClassifyDataList() {
        return unionClassifyDataList;
    }

    public void setUnionClassifyDataList(List<UnionClassifyDataList> unionClassifyDataList) {
        this.unionClassifyDataList = unionClassifyDataList;
    }

    public List<UnionItemDataList> getUnionItemDataList() {
        return unionItemDataList;
    }

    public void setUnionItemDataList(List<UnionItemDataList> unionItemDataList) {
        this.unionItemDataList = unionItemDataList;
    }

    public String getUnionTitleBgColor() {
        return unionTitleBgColor;
    }

    public void setUnionTitleBgColor(String unionTitleBgColor) {
        this.unionTitleBgColor = unionTitleBgColor;
    }

    public String getUnionTitleImg() {
        return unionTitleImg;
    }

    public void setUnionTitleImg(String unionTitleImg) {
        this.unionTitleImg = unionTitleImg;
    }
}
