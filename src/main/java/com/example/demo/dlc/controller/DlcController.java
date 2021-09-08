package com.example.demo.dlc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class DlcController {

	/**
	 * <pre>
	 * //- 메뉴ID - U_U_DS_RM
	 * //- 메뉴명 - 작품 리뷰 관리
	 * //- 메뉴 영문명 - Prdct Review Mng
	 * //- URL - /prdctReviewMng/prdctReviewMngView
	 * //- 상위메뉴 - DASHBOARD
	 * //- 포털구분 - 사용자 포털
	 * </pre>
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("prdctReviewMng/prdctReviewMngView")
	public String prdctReviewMngView(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	/**
	 * <pre>
	 * //- 메뉴ID - U_U_DS_EM
	 * //- 메뉴명 - 작품 대본 평가 관리
	 * //- 메뉴 영문명 - Prdct Subtile Est Mng
	 * //- URL - /prdctSubtileEstMng/prdctSubtileEstMngView
	 * //- 상위메뉴 - DASHBOARD
	 * //- 포털구분 - 사용자 포털
	 * </pre>
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("prdctSubtileEstMng/prdctSubtileEstMngView")
	public String prdctSubtileEstMngView(
			@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	/**
	 * <pre>
	 * //- 메뉴ID - U_U_DS_SE
	 * //- 메뉴명 - 작품 대본 평가
	 * //- 메뉴 영문명 - Prdct Subtile Est
	 * //- URL - /prdctSubtileEst/prdctSubtileEstView
	 * //- 상위메뉴 - DASHBOARD
	 * //- 포털구분 - 사용자 포털
	 * </pre>
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("prdctSubtileEst/prdctSubtileEstView")
	public String prdctSubtileEstView(
			@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
