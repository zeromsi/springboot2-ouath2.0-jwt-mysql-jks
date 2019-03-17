package com.ngfs.business.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TokenController {
	
	@Autowired
	private DefaultTokenServices defaultTokenServices;

	@RequestMapping(value = "/oauth/revoke/token", method = RequestMethod.POST)
	public boolean  create(@RequestParam("token") String value){
		return defaultTokenServices.revokeToken(value);	
	}
	
}