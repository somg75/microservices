package com.niit.msa.item.service;

import com.niit.msa.item.data.Item;
import com.niit.msa.item.dto.ItemDTO;

public class ItemConverter {

	public static Item convertDTO(ItemDTO itemdto) {
		Item item = new Item();
		item.setName(itemdto.getName());
		item.setSkuName(itemdto.getSkuName());
		item.setProducer(itemdto.getProducer());
		item.setCategory(itemdto.getCategory());
		item.setMrp(itemdto.getMrp());
		return item;
	}

	public static ItemDTO convertDO(Item item) {
		ItemDTO itemdto = new ItemDTO();
		itemdto.setId(item.getItemId());
		itemdto.setName(item.getName());
		itemdto.setSkuName(item.getSkuName());
		itemdto.setProducer(item.getProducer());
		itemdto.setCategory(item.getCategory());
		itemdto.setMrp(item.getMrp());
		return itemdto;
	}

}
