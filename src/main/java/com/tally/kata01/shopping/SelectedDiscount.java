package com.tally.kata01.shopping;

import java.math.BigDecimal;

import com.tally.kata01.discounts.Discount;

/**
 * This class include all the details about the discounts which were used during the purchase
 * @author Tally
 *
 */

public class SelectedDiscount {
	 
		//The discount name
		private String name;
		
		//The number of times the discount was applied for this product in this purchase
		//For example: in 'buy 3 for 10GBP', on purchase of 6 items the discount will be applied twice.
		//             in 'buy 4 for 2', on purchase of 6 items the discount will be applied once.
		private long discountUsages = 0;
		
		//The discount value - the amount of money to be deducted due to the applied discount
		private BigDecimal discountValue = BigDecimal.ZERO;
		
		//The product name which this discount was applied to.
		private String productName;
		
		
		public SelectedDiscount(Discount discount, BigDecimal purchasedQuantity, BigDecimal fullPricePerUnit, String productName){
			this.name = discount.getName(); 
			this.discountUsages = discount.getDiscountUsages(purchasedQuantity);
			this.discountValue = discount.getDiscountValue(purchasedQuantity, fullPricePerUnit);
			this.productName = productName;
		}


		public String getName() {
			return name;
		}

		public long getDiscountUsages() {
			return discountUsages;
		}

		public BigDecimal getDiscountValue() {
			return discountValue;
		}


		public String getProductName() {
			return productName;
		}

	}

