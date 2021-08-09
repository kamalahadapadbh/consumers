package com.example.demo.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ServicesInShop {
	private Long id;
	private String serviceName;
	private Boolean status;
	
	public ServicesInShop() {
		super();
	}

	public ServicesInShop(Long id, String serviceName,Boolean status) {
		super();
		this.id = id;
		this.setServiceName(serviceName);
		this.setStatus(status);
			}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	

}
