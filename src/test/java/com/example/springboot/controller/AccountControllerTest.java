package com.example.springboot.controller;

import org.junit.Test;

public class AccountControllerTest extends SpringBootStudyBaseControllerTest {

	@Test
	public void testQueryAccount() {
		String acctJson =  "{\"accountNo\":\"000008888888\",\"amount\":25,\"status\":\"0000\"}";
		String path = "/account/query";
		try {
			String result = this.postForRest(acctJson, path);
			System.out.println("****请求结果是****"+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testUpdateAccount() {
		String acctJson =  "{\"accountNo\":\"000008888888\",\"acctName\":\"王五\",\"amount\":25,\"status\":\"0000\"}";
		String path = "/account/update";
		try {
			String result = this.postForRest(acctJson, path);
			System.out.println("****请求结果是****"+result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
