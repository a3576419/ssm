package com.test.pojo.classification;

import com.test.pojo.BannerDataList;

import java.util.List;

public class ItemDataList {
    private List<BannerDataList>bannerDataList;
    private List<ItemData>itemDataList;

    public List<ItemData> getItemDataList() {
        return itemDataList;
    }

    public void setItemDataList(List<ItemData> itemDataList) {
        this.itemDataList = itemDataList;
    }

    public List<BannerDataList> getBannerDataList() {
        return bannerDataList;
    }

    public void setBannerDataList(List<BannerDataList> bannerDataList) {
        this.bannerDataList = bannerDataList;
    }
}
