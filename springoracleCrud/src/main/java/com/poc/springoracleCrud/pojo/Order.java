package com.poc.springoracleCrud.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Order {
	
	private String orderName;
	private long price;
	private String description;
	private String userName;
	
	public Order(String orderName, long price, String description, String userName) {
		super();
		this.orderName = orderName;
		this.price = price;
		this.description = description;
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", price=" + price + ", description=" + description
				+ ", userName=" + userName + "]";
	}
	
	
}
