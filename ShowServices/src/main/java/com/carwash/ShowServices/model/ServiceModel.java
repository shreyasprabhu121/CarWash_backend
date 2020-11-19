package com.carwash.ShowServices.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ServiceDetails")
public class ServiceModel {

	@Id
	private String Id;
	private String serviceImage;
	private String serviceName;
	private int servicePrice;
	private String serviceDescription;

	public ServiceModel(String id, String serviceImage, String serviceName, int servicePrice,
			String serviceDescription) {
		super();
		Id = id;
		this.serviceImage = serviceImage;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
		this.serviceDescription = serviceDescription;
	}

	public ServiceModel() {
		super();
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getServiceImage() {
		return serviceImage;
	}

	public void setServiceImage(String serviceImage) {
		this.serviceImage = serviceImage;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(int servicePrice) {
		this.servicePrice = servicePrice;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	@Override
	public String toString() {
		return "ServiceModel [Id=" + Id + ", serviceImage=" + serviceImage + ", serviceName=" + serviceName
				+ ", servicePrice=" + servicePrice + ", serviceDescription=" + serviceDescription + "]";
	}
	
	

}

