package com.shoppingmall.shop.repository;

import com.shoppingmall.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
