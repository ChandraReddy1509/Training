package com.hibernate.entity;

public class Product {
	
	
	 String pname;
		int pcode;
		int stock;
		int price;
		public Product() {
			
		}
		public Product(String pname, int pcode, int stock, int price) {
			super();
			this.pname = pname;
			this.pcode = pcode;
			this.stock = stock;
			this.price = price;
		}
		public String getpname() {
			return pname;
		}
		public void setpname(String pname) {
			this.pname = pname;
		}
		public int getpcode() {
			return pcode;
		}
		public void setpcode(int pcode) {
			this.pcode = pcode;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;

}
		@Override
		public String toString() {
			return "Product [pname=" + pname + ", pcode=" + pcode + ", stock=" + stock + ", price=" + price + "]";
		}
}
