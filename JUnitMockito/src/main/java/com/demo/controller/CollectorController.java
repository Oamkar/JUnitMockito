package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Purchase;
import com.demo.service.CollectorService;

@RestController("/collector")
public class CollectorController {

	@Autowired
	private CollectorService collectorService;
	
	@GetMapping("/getPurchaseDetails")
	public List<Purchase> getPurchaseDetails() {
		return collectorService.getPurchaseDetails();
	}
	
	@PostMapping("/purchase")
	public Purchase addNewEntry(@RequestBody Purchase purchaseDetails) {
		return collectorService.addNewEntry(purchaseDetails);
	}
}
