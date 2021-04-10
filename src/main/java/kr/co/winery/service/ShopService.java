package kr.co.winery.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.winery.vo.CategoriesVo;
import kr.co.winery.dao.ShopDao;
import kr.co.winery.vo.ProductsVo;

@Service
public class ShopService {

	@Autowired
	private ShopDao dao;
	
	public List<ProductsVo> selectProducts(){
		return dao.selectProducts();
	
	}

	public ProductsVo selectProduct(int code) {
		return dao.selectProduct(code);
	}
	}

