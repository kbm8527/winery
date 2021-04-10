package kr.co.winery.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.winery.vo.ProductsVo;

@Repository
public interface ShopDao {
	
	public List<ProductsVo> selectProducts();
	
	public ProductsVo selectProduct(int code);
}
