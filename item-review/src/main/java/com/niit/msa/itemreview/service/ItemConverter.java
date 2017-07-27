package com.niit.msa.itemreview.service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.niit.msa.itemreview.data.Item;
import com.niit.msa.itemreview.data.ItemReview;
import com.niit.msa.itemreview.dto.ItemReviewDTO;

public class ItemConverter {

	//TODO explore the possibility of better data transfer
	public static ItemReview convertDTO(ItemReviewDTO itemdto) {
		Item item = new Item();
		item.setItemId(itemdto.getItemId());
		
		ItemReview itemReview = new ItemReview();
		itemReview.setItem(item);
		itemReview.setItemReviewDate(new Date(System.currentTimeMillis()));
		itemReview.setItemReviewer(itemdto.getReviewer());
		itemReview.setItemReviewRating(itemdto.getRating());
		//TODO sql safety here
		itemReview.setItemReviewText(itemdto.getReviewText());
		
		return itemReview;
	}

	public static ItemReviewDTO convertDO(ItemReview item) {
		ItemReviewDTO itemdto = new ItemReviewDTO();
		itemdto.setId(item.getItemReviewId());
		itemdto.setItemId(item.getItem().getItemId());
		itemdto.setRating(item.getItemReviewRating());
		itemdto.setReviewDate(item.getItemReviewDate());
		itemdto.setReviewer(item.getItemReviewer());
		itemdto.setReviewText(item.getItemReviewText());
		return itemdto;
	}

	public static List<ItemReviewDTO> convertDOList(Set<ItemReview> itemReviews) {
		List<ItemReviewDTO> itemdtos = Lists.newArrayList();
		//Set<ItemReview> itemReviews = item.getItemReviews();
        for (ItemReview itemReview : itemReviews) {
        	itemdtos.add(convertDO(itemReview));
		}		
		return itemdtos;
	}

}
