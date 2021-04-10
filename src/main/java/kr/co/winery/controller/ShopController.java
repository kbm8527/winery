package kr.co.winery.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import kr.co.winery.service.ShopService;
import kr.co.winery.vo.MemberVo;
import kr.co.winery.vo.ProductsVo;



@Controller
public class ShopController {

	@Autowired
	private ShopService service;
	
	
	@GetMapping("shop/list")
	public String list(Model model) {
		
		List<ProductsVo> items = service.selectProducts();
	
		
		model.addAttribute("items",items); //그냥 items와의 차이?
		
		return "shop/list";
	}
	
	@GetMapping("shop/view")
	public String view() {
		
		
		
		
		return "shop/view";
	}
	
	@GetMapping("shop/winelist")
	public String winelist(Model model) {
		
	List<ProductsVo> items = service.selectProducts();
	
		
		model.addAttribute("items",items); //그냥 items와의 차이?
		
	
		
		
		return "shop/winelist";
	}
	
	@GetMapping("shop/wineview")
	public String wineview(int code, Model model, HttpSession sess) {
	MemberVo member = (MemberVo) sess.getAttribute("member");	
		
	ProductsVo vo = service.selectProduct(code);
	
	model.addAttribute(vo);
	model.addAttribute("member", member);
		
		
		return "shop/wineview";
	}
	
	@GetMapping("shop/order")
	public String order() {
		
		
		
		
		return "shop/order";
	}
	
	@GetMapping("shop/payment")
	public String payment() {
		
		
		
		
		return "shop/payment";
	}
	
	
}
