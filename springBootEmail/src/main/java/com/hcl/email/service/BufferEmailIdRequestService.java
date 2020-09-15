package com.hcl.email.service;


import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.email.entity.BufferEmailIdRequest;

public interface BufferEmailIdRequestService {

	public BufferEmailIdRequest getMailDataById(Long id);
	
	
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest);


	public List<BufferEmailIdRequest> getEmailData();
}
