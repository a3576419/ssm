package com.test.controller;

import com.test.pojo.BannerDataList;
import com.test.pojo.BaseBean;
import com.test.pojo.home.ClassifyDataList;
import com.test.pojo.classification.*;
import com.test.service.ClassificationService;
import com.test.service.GoodsService;
import com.test.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

import static com.test.utils.Utils.getRandomNum;

@RequestMapping("classInfo")
@Controller
public class CommodityClassController {

    @Autowired
    private ClassificationService classifiService;
    @Autowired
    private GoodsService goodsService;
    @ResponseBody
    @RequestMapping("getRecommendationList")
    public ItemClassAgg getRecommendationList(){
        int num = getRandomNum(3,8);
        List<BannerDataList>bannerDataList = goodsService.getBannerDataList();
        ItemData itemData = new ItemData();
        ArrayList<ItemData> list = new ArrayList<>();
        for (int i = 0;i<num;i++){
            int rand = getRandomNum(5,20);
            List<Item> item = classifiService.getItem(rand);
           list.add(new ItemData(item,"分类标题"+i));
        }
        ItemDataList itemDataList = new ItemDataList();
        itemDataList.setItemDataList(list);
        itemDataList.setBannerDataList(bannerDataList);
        ItemClassAgg itemClassAgg = new ItemClassAgg();
        itemClassAgg.setData(itemDataList);
        return itemClassAgg;
    }


    @ResponseBody
    @RequestMapping("getClassCount")
    public BaseBean getClassCount(){
        int count = goodsService.getItemCount()/30+1;

        ArrayList<ClassifyDataList> list = new ArrayList<>();
        for (int i = 0;i<count;i++){
           list.add(new ClassifyDataList(i,"标题"+i));
        }
      ClassCount classCount = new ClassCount();
        classCount.setClassifyDataList(list);
        BaseBean baseBean = new BaseBean();
        baseBean.setData(classCount);
        return baseBean;
    }


}
