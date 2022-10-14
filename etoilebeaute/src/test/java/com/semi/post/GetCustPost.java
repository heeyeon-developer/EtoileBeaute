package com.semi.post;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi.dto.ItemDTO;
import com.semi.dto.PostDTO;
import com.semi.service.PostService;

@SpringBootTest
class GetCustPost {

	@Autowired
	PostService service;
	
	@Test
	void contextLoads() {
		PostDTO post = null;
		try {
			post = service.getcustpost("KanghoSong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(post);
		
	}

}




