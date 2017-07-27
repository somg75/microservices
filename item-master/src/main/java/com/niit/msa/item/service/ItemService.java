package com.niit.msa.item.service;

import com.niit.msa.item.dto.ItemDTO;

public interface ItemService {

	ItemDTO addItem(ItemDTO item);
	ItemDTO retrieve(Long id);
}
