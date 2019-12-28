 package com.test.pojo;

/**
  * 	商品数据模型
  * @author 
  *
  */

	public class Goods {
		/*g_id          商品id
		g_oldPrice      原价
		g_selfPrice     返利
		g_price         现价
		g_sharePrice    分享赚
		g_title			商品名称
		g_img			商品图片
		g_subtitle   	子标题
		g_status		状态(0/1)
		g_video			视频
		g_videoImg		视频图片
		g_salesCount    销量
		g_inventoryNum  库存
		g_maxSales		每人限购*/
		private int g_id;
		private double g_oldPrice;
		private double g_selfPrice;
		private double g_price;
		private double g_sharePrice;
		private String g_title;
		private String g_img;
		private String g_subtitle;
		private String g_status;
		private String g_video;
		private String g_videoImg;
		private String g_salesCount;
		private String g_inventoryNum;
		private String g_maxSales;






	public int getG_id() {
			return g_id;
		}
		public void setG_id(int g_id) {
			this.g_id = g_id;
		}
		public double getG_oldPrice() {
			return g_oldPrice;
		}
		public void setG_oldPrice(double g_oldPrice) {
			this.g_oldPrice = g_oldPrice;
		}
		public double getG_selfPrice() {
			return g_selfPrice;
		}
		public void setG_selfPrice(double g_selfPrice) {
			this.g_selfPrice = g_selfPrice;
		}
		public double getG_price() {
			return g_price;
		}
		public void setG_price(double g_price) {
			this.g_price = g_price;
		}
		public double getG_sharePrice() {
			return g_sharePrice;
		}
		public void setG_sharePrice(double g_sharePrice) {
			this.g_sharePrice = g_sharePrice;
		}
		public String getG_title() {
			return g_title;
		}
		public void setG_title(String g_title) {
			this.g_title = g_title;
		}
		public String getG_img() {
			return g_img;
		}
		public void setG_img(String g_img) {
			this.g_img = g_img;
		}
		public String getG_subtitle() {
			return g_subtitle;
		}
		public void setG_subtitle(String g_subtitle) {
			this.g_subtitle = g_subtitle;
		}
		public String getG_status() {
			return g_status;
		}
		public void setG_status(String g_status) {
			this.g_status = g_status;
		}
		public String getG_video() {
			return g_video;
		}
		public void setG_video(String g_video) {
			this.g_video = g_video;
		}
		public String getG_videoImg() {
			return g_videoImg;
		}
		public void setG_videoImg(String g_videoImg) {
			this.g_videoImg = g_videoImg;
		}
		public String getG_salesCount() {
			return g_salesCount;
		}
		public void setG_salesCount(String g_salesCount) {
			this.g_salesCount = g_salesCount;
		}
		public String getG_inventoryNum() {
			return g_inventoryNum;
		}
		public void setG_inventoryNum(String g_inventoryNum) {
			this.g_inventoryNum = g_inventoryNum;
		}
		public String getG_maxSales() {
			return g_maxSales;
		}
		public void setG_maxSales(String g_maxSales) {
			this.g_maxSales = g_maxSales;
		}
		@Override
		public String toString() {
			return "Goods [g_id=" + g_id + ", g_oldPrice=" + g_oldPrice + ", g_selfPrice=" + g_selfPrice + ", g_price="
					+ g_price + ", g_sharePrice=" + g_sharePrice + ", g_title=" + g_title + ", g_img=" + g_img
					+ ", g_subtitle=" + g_subtitle + ", g_status=" + g_status + ", g_video=" + g_video + ", g_videoImg="
					+ g_videoImg + ", g_salesCount=" + g_salesCount + ", g_inventoryNum=" + g_inventoryNum + ", g_maxSales="
					+ g_maxSales + "]";
		}
		
		
	}


