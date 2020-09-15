package com.hcl.email.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.email.entity.BufferEmailIdRequest;
import com.hcl.email.repositry.BufferEmailIdRequestRepositry;

@Service
public class BufferEmailIdRequestServiceImpl implements BufferEmailIdRequestService {
	
	@Autowired
	private BufferEmailIdRequestRepositry bufferEmailIdRequestRepositry;

	@Override
	public BufferEmailIdRequest getMailDataById(Long id) {
		
		BufferEmailIdRequest result = bufferEmailIdRequestRepositry.getMailDataById(id);
		return result;
	}

	@Override
	public String save(BufferEmailIdRequest bufferEmailIdRequest) {
		// TODO Auto-generated method stub
		return bufferEmailIdRequestRepositry.save(bufferEmailIdRequest);
	}

	@Override
	public List<BufferEmailIdRequest> getEmailData() {
		List<BufferEmailIdRequest> result =  bufferEmailIdRequestRepositry.getEmailData();
		return result;
	}

}
