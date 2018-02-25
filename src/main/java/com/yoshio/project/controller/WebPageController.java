package com.yoshio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yoshio.project.common.resource.external.ndlSearchApi.NdlSearchResponse;
import com.yoshio.project.common.resource.request.UserInfoResource;

@Controller
@RequestMapping("/library")
public class WebPageController {

	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@PostMapping("/home")
	public String home(UserInfoResource userInfoResource, Model model) {
		// TODO ユーザ情報チェック実装
		model.addAttribute("ndlSearchResponse", new NdlSearchResponse("11", "12"));
		return "opac/home";
	}

}
