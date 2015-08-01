package org.starter.ssh;

import java.util.ArrayList;
import java.util.List;

public enum ProductInMemoryDB {

	INSTANCE;
	
	private static List<ProductDto> list = new ArrayList<>();
	
	private static Integer lastId = 0;
	
	public Integer getId() {
		return ++lastId;
	}
	
	public void add(ProductDto productDto) {
		productDto.setId(getId());
		list.add(productDto);
	}
	
	public List<ProductDto> findAll() {
		return list;
	}
	
	public ProductDto findById(Integer id) {
		for (ProductDto dto : list) {
			if (dto.getId() == id) {
				return dto;
			}
		}
		return null;
	}
	
	public void remove(Integer id) {
		ProductDto toRemove = null;
		for (ProductDto dto : list) {
			if (dto.getId() == id) {
				toRemove = dto;
			}
			if (toRemove != null) {
				list.remove(toRemove);
			}
		}
	}
	
	public void edit(ProductDto productDto) {
		for (ProductDto dto : list) {
			if (dto.getId() == productDto.getId()) {
				dto.setName(productDto.getName());
			}
		}
	}
}
