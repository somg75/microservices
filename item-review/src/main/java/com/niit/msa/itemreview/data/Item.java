package com.niit.msa.itemreview.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	private Long itemId;

	private Set<ItemReview> itemReviews;
	
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_id")
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	
	@OneToMany(mappedBy="item", targetEntity=ItemReview.class, orphanRemoval=true)
	public Set<ItemReview> getItemReviews() {
		return itemReviews;
	}
	public void setItemReviews(Set<ItemReview> itemReviews) {
		this.itemReviews = itemReviews;
	}
	
}
