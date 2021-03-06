package com.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.demo.entity.Purchase;

public interface PurchaseRepository extends CrudRepository<Purchase, Long>{

}
