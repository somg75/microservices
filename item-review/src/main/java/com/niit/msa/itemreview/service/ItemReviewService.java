package com.niit.msa.itemreview.service;

import java.util.List;

import com.niit.msa.itemreview.dto.ItemReviewDTO;

public interface ItemReviewService {

	ItemReviewDTO addItemReview(ItemReviewDTO item);
	ItemReviewDTO retrieve(Long id);
	List<ItemReviewDTO> findReviewsByItem(Long itemId);
}
