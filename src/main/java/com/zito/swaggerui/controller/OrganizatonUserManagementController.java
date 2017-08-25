package com.zito.swaggerui.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import com.zito.swaggerui.enums.AppStatusEnum;
import com.zito.swaggerui.pojo.OrganizationUserManagement;
import com.zito.swaggerui.service.OrganizationUserManagementService;
import com.zito.swaggerui.utils.MyMapUtil;

@Controller
@Api(value = "人员", description = "有关于人员的CURD操作")
@RequestMapping("user")
public class OrganizatonUserManagementController {

	private static final ObjectMapper MAPPER = new ObjectMapper();

	@Autowired
	private OrganizationUserManagementService organizationUserManagementService;

	/**
	 * @deprecated 根据账号密码登录
	 * @param account
	 * @param password
	 * @return
	 */
	// @ApiImplicitParams(value = { @ApiImplicitParam(name = "userAccount",
	// value = "账号", paramType = "form", dataType = "String"),
	// @ApiImplicitParam(name = "password", value = "密码", paramType = "form",
	// dataType = "String") })
	@RequestMapping(value = "login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	@ResponseBody
	@ApiOperation(value = "根据账号和密码登录", httpMethod = "POST", response = String.class, produces = MediaType.APPLICATION_JSON_VALUE, notes = "登录的方法")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "success", response = String.class), @ApiResponse(code = 500, message = "error", response = String.class) })
	public String login(@RequestParam("userAccount") String userAccount, @RequestParam("password") String password) {

		Map<String, Object> map2Json = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		try {
			paramMap.put("userAccount", userAccount);
			paramMap.put("password", password);
			paramMap.put("isDel", 1);
			OrganizationUserManagement user = organizationUserManagementService.queryByMap(paramMap);

			if (user != null) {
				map2Json = MyMapUtil.putResult(AppStatusEnum.STATUS_OK.value(), AppStatusEnum.STATUS_OK.des(), user);
			} else {
				map2Json = MyMapUtil.putResult(AppStatusEnum.STATUS_FAILED.value(), AppStatusEnum.STATUS_FAILED.des(), null);
			}
			System.out.println(MAPPER.writeValueAsString(map2Json));
			return MAPPER.writeValueAsString(map2Json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			MyMapUtil.putResult(AppStatusEnum.STATUS_ERROR.value(), AppStatusEnum.STATUS_ERROR.des(), null);
		}
		try {
			return MAPPER.writeValueAsString(map2Json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
