package com.e4s.corporate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e4s.corporate.model.Basket;
import com.e4s.corporate.model.User;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Long> {



}
