package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.VO.ServicesInShop;
import com.example.demo.VO.ShopDetails;
import com.example.demo.entity.Consumers;
import com.example.demo.repository.ConsumerRepository;
import com.example.demo.service.ConsumerService;


@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	ConsumerRepository cRepo;
	
	@Autowired
	RestTemplate restTemplate;
	
	
	@Transactional
	public Consumers saveConsumers(Consumers c) {
		// TODO Auto-generated method stub
		Consumers data = cRepo.save(c);
		return data;
	}

	@Transactional
	public Optional<Consumers> getConsumerById(Long id) {
		// TODO Auto-generated method stub
		 Optional<Consumers> data =cRepo.findById(id);
		return data;
	}

	@Transactional
	public Optional<Consumers> getConsumerByPhone(String phone) {
		// TODO Auto-generated method stub
		Optional<Consumers> data = cRepo.findByphone(phone);
		return data;
	}

	@Transactional
	public Optional<Consumers> getConsumerByPhoneAndPassword(String phone, String psw) {
		// TODO Auto-generated method stub
		Optional<Consumers> data = cRepo.findByPhoneAndPassword(phone,psw);
		return data;
	}

	@Transactional
	public List<Consumers> getConsumerByUserName(String userName) {
		// TODO Auto-generated method stub
		List<Consumers> data  = cRepo.findByUserName(userName);
		return data;
	}

	@Transactional
	public String getShopDetailsByShopId(Long shopId) {
		// TODO Auto-generated method stub
		Object data = restTemplate.getForEntity("http://localhost:8091/userController/getOwnerDeatailByShopId?shopId="+shopId, Object.class);
		System.out.println("dagsjhdgahsgdgashjhsga"+data.toString());
		return data.toString();
	}

	@Transactional
	public String getShopDetailsByOwnerId(Long ownerId) {
		// TODO Auto-generated method stub
		ResponseEntity<Object> data = restTemplate.getForEntity("http://localhost:8091/userController/getShopDeatailByOwnerId?ownerId="+ownerId, Object.class);
		return data.toString();
	}

	@Transactional
	public String getShopServicesByShopId(Long shopId) {
		// TODO Auto-generated method stub
		 ResponseEntity<Object> data = restTemplate.getForEntity("http://localhost:8091/serviceInShopController/getShopServicesByShopId?shopId="+shopId, Object.class);
		return data.toString();
	}

	
}
