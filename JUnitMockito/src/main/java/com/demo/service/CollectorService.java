package com.demo.service;

import java.util.List;
import com.demo.entity.Purchase;

public interface CollectorService {

	public List<Purchase> getPurchaseDetails();
	
	public Purchase addNewEntry(Purchase purchaseDetails);

}
