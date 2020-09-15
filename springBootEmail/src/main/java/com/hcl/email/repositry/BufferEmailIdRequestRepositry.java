package com.hcl.email.repositry;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.hcl.email.entity.BufferEmailIdRequest;

public interface BufferEmailIdRequestRepositry {

	public BufferEmailIdRequest getMailDataById(Long id);
	
	public String save(@RequestBody BufferEmailIdRequest bufferEmailIdRequest);

	public List<BufferEmailIdRequest> getEmailData();
}
