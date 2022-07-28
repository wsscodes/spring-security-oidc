package com.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/oidc-principal")
	public OidcUser getOidcUserPrincipal(@AuthenticationPrincipal OidcUser principal) {
		OidcUser principal1 = null;
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication.getPrincipal() instanceof OidcUser) {
			principal1 = ((OidcUser) authentication.getPrincipal());

		}
		return principal1;
	}
}
