package com.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Purchase;
import com.demo.repository.PurchaseRepository;
import com.demo.service.CollectorService;

@Service
public class CollectorServiceImpl implements CollectorService {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	public CollectorServiceImpl(PurchaseRepository stdRepository){
		purchaseRepository = stdRepository;
	}
	
	@Override
	public List<Purchase> getPurchaseDetails() {
		List<Purchase> purchaseDetails = new ArrayList<>();
		purchaseRepository.findAll().forEach(purchaseDetails :: add);
		return purchaseDetails;
	}

	@Override
	public Purchase addNewEntry(Purchase purchase) {
		return purchaseRepository.save(purchase);
	}

}
