package com.demo;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.entity.Purchase;
import com.demo.repository.PurchaseRepository;
import com.demo.service.CollectorService;
import com.demo.service.impl.CollectorServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTests {

	private CollectorService collectorService;
	
	@Mock private PurchaseRepository purchaseRepository;
	  
	@Mock private Purchase purchase;
	
	@Mock private Iterable<Purchase> itrPurchase;
	
	@Before
	public void onSetUp() {
		collectorService = new CollectorServiceImpl(purchaseRepository);
	}
	
	@Test
	public void testPurchaseDetails() {
		when( purchaseRepository.findAll() ).thenReturn( itrPurchase );
		assertNotNull(collectorService.getPurchaseDetails());
		verify(purchaseRepository).findAll();
	}
	
	@Test
	public void testAddNewEntry() {
		when( purchaseRepository.save(purchase) ).thenReturn(purchase);
		assertNotNull(collectorService.addNewEntry(purchase));
		verify(purchaseRepository).save(purchase);
	}

}
