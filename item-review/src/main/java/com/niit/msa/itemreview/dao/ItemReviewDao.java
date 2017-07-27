package com.niit.msa.itemreview.dao;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.niit.msa.itemreview.data.Item;
import com.niit.msa.itemreview.data.ItemReview;

public interface ItemReviewDao extends CrudRepository<ItemReview, Long>  {
    Set<ItemReview> findByItem(Item item);
}
