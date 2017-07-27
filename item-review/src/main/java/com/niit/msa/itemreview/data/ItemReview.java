package com.niit.msa.itemreview.data;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_review")
public class ItemReview {

	private Long itemReviewId; 
	private String itemReviewText;
	private String itemReviewer;
	private int itemReviewRating;
	private Date itemReviewDate;
	
	private Item item;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="item_review_id")
	public Long getItemReviewId() {
		return itemReviewId;
	}
	public void setItemReviewId(Long itemReviewId) {
		this.itemReviewId = itemReviewId;
	}
	
	@Column(name="item_review_comment")
	public String getItemReviewText() {
		return itemReviewText;
	}
	public void setItemReviewText(String itemReviewText) {
		this.itemReviewText = itemReviewText;
	}
	
	@Column(name="item_reviewer_name")
	public String getItemReviewer() {
		return itemReviewer;
	}
	public void setItemReviewer(String itemReviewer) {
		this.itemReviewer = itemReviewer;
	}
	
	@Column(name="item_review_rating")
	public int getItemReviewRating() {
		return itemReviewRating;
	}
	public void setItemReviewRating(int itemReviewRating) {
		this.itemReviewRating = itemReviewRating;
	}
	
	@Column(name="item_review_date")
	public Date getItemReviewDate() {
		return itemReviewDate;
	}
	public void setItemReviewDate(Date itemReviewDate) {
		this.itemReviewDate = itemReviewDate;
	}
	
	@ManyToOne(optional=false)
	@JoinColumn(name="item_id", referencedColumnName="item_id")
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}


}
