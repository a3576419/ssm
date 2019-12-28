package com.test.mapper;

import com.test.pojo.*;
import com.test.pojo.home.*;

import java.util.List;

/**
 *  商品数据表持久化接口
 * @author 
 *
 */
public interface GoodsMapper {
	
	List<Goods> getItemList();
	void insertItem(Goods goods);
	Goods getItemById(int id);
	int getItemCount();
	List<Goods> getItemListByPage(MyShopBean myShopBean);
	List<BannerDataList>getBannerDataList();
	List<ClassifyDataList> getClassifyDataList(Stores stores);
	List<SingleItem_1_DataList>getSingleItem_1_DataList(Stores stores);
	List<SingleItem_2_DataList> getSingleItem_2_DataList(Stores stores);

	List<UnionClassifyDataList> getUnionClassifyDataList(Stores stores);
	List<UnionItemDataList> getUnionItemDataList(Stores stores);
}
