package com.hcl.email.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.service.BufferEmailIdRequestService;

@RestController
public class BufferEmailIdRequestController {
	
	@Autowired
	private BufferEmailIdRequestService bufferEmailIdRequestService;

	@GetMapping("/getDataById")
	public BufferEmailIdRequest getMailDataById(@RequestParam("id") Long id) {
		
		return bufferEmailIdRequestService.getMailDataById(id);
	}
	
	@GetMapping("/getEmailData")
	public List<BufferEmailIdRequest> getEmailData() {
		
		return bufferEmailIdRequestService.getEmailData();
	}
	
	@PostMapping("/save")
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest) {
		
		return bufferEmailIdRequestService.save(bufferEmailIdRequest);
		
	}
}
