package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.ServicesInShop;
import com.example.demo.VO.ShopDetails;
import com.example.demo.entity.Consumers;
import com.example.demo.service.ConsumerService;

@RestController
@RequestMapping(value = "/consumerController")
public class ConsumerController {
	
	@Autowired
	ConsumerService cSer;
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/saveConsumers",method = RequestMethod.POST)
	public HashMap<String, Object> saveConsumers(@RequestBody Consumers c) {
	 	Consumers data = cSer.saveConsumers(c);
	 	HashMap<String, Object> map = new HashMap<>();
	 	if (data!=null) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
		}
		return map;
	}

	
	@GetMapping(value = "/getConsumerById")
	public HashMap<String, Object> getConsumerById(Long id) {
		 Optional<Consumers> data  = cSer.getConsumerById(id);
		 HashMap<String, Object> map = new HashMap<>();
			if (data!=null) {
				//Consumers umap =restTemplate.getForObject("http://localhost:8091/consumerController/getConsumerById?id=",data.get().getClass());
				//Object u = ((Map<String,Object>) umap).get("content");
				
				map.put("code", "200");
				map.put("content", data);
				//map.put("users", u);
				
			} else {
				map.put("code", "201");
				map.put("content", "success");
				
			}
			return map;
	}
	@GetMapping(value = "/getConsumerByPhone/{phone}")
	public HashMap<String, Object> getConsumerByPhone(@PathVariable("phone") String phone) {
		Optional<Consumers> data = cSer.getConsumerByPhone(phone);
		HashMap<String, Object> map = new HashMap<>();
		if (data.isPresent()) {
			map.put("code", "200");
			map.put("content", data);
		} else {
			map.put("code", "201");
			map.put("content", "no data");
			
		}
		return map;
		
	}
	
	@PostMapping(value = "/getConsumerByPhoneAndPassword")
	public HashMap<String, Object> getConsumerByPhoneAndPassword(String phone, String psw) {
		Optional<Consumers> data = cSer.getConsumerByPhoneAndPassword(phone,psw);
		 HashMap<String, Object> map = new HashMap<>();
			if (data.isPresent()) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
				
			}
			return map;
		
	}
	@GetMapping(value = "/getConsumerByUserName/{name}")
	public HashMap<String, Object> getConsumerByUserName(@PathVariable ("name") String userName) {
		 List<Consumers> data = cSer.getConsumerByUserName(userName);
		 HashMap<String, Object> map = new HashMap<>();
			if (data!=null) {
				map.put("code", "200");
				map.put("content", data);
			} else {
				map.put("code", "201");
				map.put("content", "no data");
				
				
			}
			return map;
}
	
	
	@GetMapping("/shopDetailsByshopId")
	public String getShopDetailsByShopId(Long shopId) {
		String  data = cSer.getShopDetailsByShopId(shopId);
		return data;
	}
	
	@GetMapping(value = "/getShopDetailsByOwnerId")
	public String getShopDetailsByOwnerId(Long ownerId) {
		String data = cSer.getShopDetailsByOwnerId(ownerId);
		return data;
	}
	@GetMapping("/getShopServicesByShopId")
	public String getShopServicesByShopId(Long shopId) {
		String data= cSer.getShopServicesByShopId(shopId);
		return data;
	}
}
