package com.zito.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;

import com.zito.swaggerui.utils.HttpUtil;
import com.zito.swaggerui.utils.MD5Util;
import com.zito.swaggerui.utils.ParameterUtil;

public class ApiTest {
	public static String basePath = "http://localhost:8080/demo/user/login.do";

	@BeforeClass
	public static void initOnce() {

	}

	@org.junit.Test
	public void test101() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		params.put("userAccount", "zitoAdmin11");
		params.put("password", MD5Util.encode("123"));
		String req = ParameterUtil.toString(params);
		System.out.println(req);
		String res = HttpUtil.httpSendMessage(req, basePath);
		System.out.println(res);

	}

}
