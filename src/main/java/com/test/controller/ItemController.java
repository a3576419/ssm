package com.test.controller;

import com.test.pojo.*;
import com.test.pojo.home.*;
import com.test.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Random;

import static com.test.utils.Utils.getRandomNum;

@RequestMapping("home")
@Controller
public class ItemController {
	
	@Autowired
	private GoodsService goodsService;
	@RequestMapping("test")
	public String Welcome(Model model) {

		return "welcome";
		
	}

	@RequestMapping("add0")
	public String addItem(Model model , @ModelAttribute Goods goods) {
		System.out.println("---------------------------"+goods);
		goodsService.insertItem(goods);
		return "item";
	}
	
	@RequestMapping("insertGoods")
	public Goods addItem2(Model model , @ModelAttribute Goods goodsIn) {
		System.out.println("---------------------------"+goodsIn);
		//goodsService.addItems(item);

		return goodsIn;
	}
	
	@ResponseBody
	@RequestMapping(value="insertGoodsList",produces={"text/html;charset=UTF-8;","application/json;"})
	public String getItem(@RequestBody(required = false) String goodsIn)  {
		try {
			goodsIn = new String(goodsIn.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(goodsIn);

		return goodsIn;
		
	}
//		List<Item> itemList = goodsIn.getItemList();
//		if(itemList==null) {
//			System.out.println("null");
//		}
//		if(itemList.size()==0) {
//			System.out.println("0");
//			
//		}
//		for (Item item : itemList) {
//			if (item==null) {
//				System.out.println("null2");
//			}
//			System.out.println(item.getG_title());
//		}
// 		return goodsIn;
//	}

	public int itemCount(){
		int count = goodsService.getItemCount();
		return count;
	}
	@ResponseBody
	@RequestMapping("getItemList")
	public BaseBean getItemList(MyShopBean myShopBean){					//入参:页码,每页商品数量
		MyShopBean myShopBean1 = new MyShopBean();						//实例化商品数据模型
		int count = itemCount();										//商品总数
		int page = myShopBean.getPage();								//当前页码
		int itemCount = myShopBean.getItemCount();						//每页商品数量
		int start = (page-1)*itemCount;									//每页起始位置
		int theRest = count-start-page; 								//剩余商品数量
		BaseBean baseBean = new BaseBean();
		myShopBean.setStart(start);										//每页起始位置=(页码-1)*每页商品数量
		List<Goods> goods = goodsService.getItemListByPage(myShopBean);//得到商品数据
		myShopBean1.setPage(page);										//设置页码
		myShopBean1.setStart(start);									//设置每页起始位置
		myShopBean1.setItemList(goods);									//将商品数据添加到MyShopBean
		myShopBean1.setItemCount(itemCount);							//设置每页商品数量
		baseBean.setData(myShopBean1);									//将商品信息列表添加到ConfData
		if(theRest>0){
			baseBean.setCode(200);
			baseBean.setMsg("还有"+(theRest)+"条数据");
		}else if (theRest==0){
			baseBean.setCode(201);
			baseBean.setMsg("没有更多数据啦");
		}else{
			baseBean.setCode(404);
			baseBean.setMsg("错误");

		}
//		confData.setItems(goods);
//		confData.setPage(myShopBean.getPage());
//		confData.setItemCount(myShopBean.getRows());
		//System.out.println("-------------------------------"+confData);
//		String str = goodsL.toString();
//		System.out.println(str);
//		List<MyShopBean.Item> items = myShopBean.getItemList();
//		for (MyShopBean.Item item:items) {
//			System.out.println("--------------------------"+item);
//		}
		return baseBean;

	}
	@ResponseBody
    @RequestMapping("responseHeadData")
	public BaseBean responseHeadData(Stores stores){
	    BaseBean baseBean =new BaseBean();
        List<BannerDataList>bannerDataList = goodsService.getBannerDataList();
        List<ClassifyDataList>classifyDataList = goodsService.getClassifyDataList(stores);
        List<SingleItem_1_DataList> singleItem_1_dataList = goodsService.getSingleItem_1_DataList(stores);
        List<SingleItem_2_DataList> singleItem_2_dataList = goodsService.getSingleItem_2_DataList(stores);
        List<UnionClassifyDataList> unionClassifyDataList = goodsService.getUnionClassifyDataList(stores);
		List<UnionItemDataList> unionItemDataList = goodsService.getUnionItemDataList(stores);
		HeadData headData = new HeadData();
		//Random random = new Random();
		int rand = getRandomNum(1,5);
		int rand2 = getRandomNum(1,5);
		int rand3 = getRandomNum(1,2);
		String SingleItem_1_TitleImgName = "single_head_"+rand+".png";
		String SingleItem_2_TitleImgName = "single_head_"+rand2+".png";
		String unionTitleImgName = "union_head_"+rand3+".png";
//		String SingleItem_1_TitleImgPath = "http://127.0.0.1:8080/ShopDemo/public/images/single_head/"+SingleItem_1_TitleImgName;
//		String SingleItem_2_TitleImgPath = "http://127.0.0.1:8080/ShopDemo/public/images/single_head/"+SingleItem_2_TitleImgName;
//		String unionTitleImgPath ="http://127.0.0.1:8080/ShopDemo/public/images/union_head/"+unionTitleImgName;
//		String goods_headPath = "http://127.0.0.1:8080/ShopDemo/public/images/goods_head/goods_head_1.png";
		String SingleItem_1_TitleImgPath = "http://139.196.212.61:8080/ShopDemo_war/public/images/single_head/"+SingleItem_1_TitleImgName;
		String SingleItem_2_TitleImgPath = "http://139.196.212.61:8080/ShopDemo_war/public/images/single_head/"+SingleItem_2_TitleImgName;
		String unionTitleImgPath ="http://139.196.212.61:8080/ShopDemo_war/public/images/union_head/"+unionTitleImgName;
		String goods_headPath = "http://139.196.212.61:8080/ShopDemo_war/public/images/goods_head/goods_head_1.png";
		headData.setBannerDataList(bannerDataList);
		headData.setClassifyDataList(classifyDataList);
		headData.setSingleItem_1_dataList(singleItem_1_dataList);
		headData.setSingleItem_2_dataList(singleItem_2_dataList);
		headData.setUnionClassifyDataList(unionClassifyDataList);
		headData.setUnionItemDataList(unionItemDataList);
		headData.setSingleItem_1_TitleImg(SingleItem_1_TitleImgPath);
		headData.setSingleItem_2_TitleImg(SingleItem_2_TitleImgPath);
		headData.setUnionTitleImg(unionTitleImgPath);
		headData.setGoods_head(goods_headPath);
		headData.setUnionTitleBgColor("#53aa76");
		baseBean.setData(headData);
		baseBean.setCode(200);
		baseBean.setMsg("test");
        return baseBean;

    }



}
