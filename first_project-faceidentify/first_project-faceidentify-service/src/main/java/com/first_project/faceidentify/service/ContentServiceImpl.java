package com.first_project.faceidentify.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentServiceImpl implements ContentService {
	@Autowired
	private TestMapper testMapper;

	@Override
	public void saveContent(String str) {
		
	}

}
