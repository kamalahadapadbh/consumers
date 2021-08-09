package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Consumers;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumers, Long> {

	Optional<Consumers> findByphone(String phone);

	Optional<Consumers> findByPhoneAndPassword(String phone, String psw);

	List<Consumers> findByUserName(String userName);


}
