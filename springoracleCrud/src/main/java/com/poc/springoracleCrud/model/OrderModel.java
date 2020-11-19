package com.poc.springoracleCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orderdetailss")
@Data
public class OrderModel {

	@Id
	@GenericGenerator(name = "order_id", strategy = "com.poc.springoracleCrud.config.OrderIDGenerator")
	@GeneratedValue(generator = "order_id")
	@Column(name = "order_id")
	private String orderid;
	
	@Column(name = "order_name")
	private String orderName;
	
	@Column(name = "price")
	private long price;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "user_name")
	private String userName;

	@Override
	public String toString() {
		return "OrderModel [orderid=" + orderid + ", orderName=" + orderName + ", price=" + price + ", description="
				+ description + ", userName=" + userName + "]";
	}
	
	
	

}
