package com.niit.msa.itemreview.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.msa.itemreview.dao.ItemReviewDao;
import com.niit.msa.itemreview.data.Item;
import com.niit.msa.itemreview.data.ItemReview;
import com.niit.msa.itemreview.dto.ItemReviewDTO;
import com.niit.msa.itemreview.exception.InvalidItemReviewRequestExpection;

@Service
public class ItemReviewServiceImpl implements ItemReviewService {

	@Autowired
	private ItemReviewDao dao;
	
	@Override
	public ItemReviewDTO addItemReview(ItemReviewDTO itemReviewDto) {
		// TODO Auto-generated method stub
		ItemReview itemReview = ItemConverter.convertDTO(itemReviewDto);
		dao.save(itemReview);
		return ItemConverter.convertDO(itemReview);
	}

	@Override
	public ItemReviewDTO retrieve(Long id) {
		ItemReview itemReview = dao.findOne(id);
		if(itemReview != null) {
			return ItemConverter.convertDO(itemReview);
		}
		throw new InvalidItemReviewRequestExpection("Item not found for id = " + id);
	}

	@Override
	public List<ItemReviewDTO> findReviewsByItem(Long itemId) {
		Item item = new Item();
		item.setItemId(itemId);
		Set<ItemReview> reviews = dao.findByItem(item);
		if(reviews != null && !reviews.isEmpty()) {
			return ItemConverter.convertDOList(reviews);
		}
		return Collections.emptyList();
	}
}
