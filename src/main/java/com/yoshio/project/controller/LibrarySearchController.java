package com.yoshio.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.yoshio.project.common.resource.external.ndlSearchApi.NdlSearchResponse;

@RestController
public class LibrarySearchController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/ndlSearch")
	public NdlSearchResponse ndlSearchApi(HttpServletRequest request) {

		String query = request.getQueryString();
		System.out.println(query);

		return new NdlSearchResponse("11", "0");
	}

}
