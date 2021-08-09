package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.demo.VO.ServicesInShop;
import com.example.demo.VO.ShopDetails;
import com.example.demo.entity.Consumers;

public interface ConsumerService {

	Consumers saveConsumers(Consumers c);

	Optional<Consumers> getConsumerById(Long id);

	Optional<Consumers> getConsumerByPhone(String phone);

	Optional<Consumers> getConsumerByPhoneAndPassword(String phone, String psw);

	List<Consumers> getConsumerByUserName(String userName);

	String getShopDetailsByShopId(Long shopId);

	String getShopDetailsByOwnerId(Long ownerId);

	String getShopServicesByShopId(Long shopId);


}