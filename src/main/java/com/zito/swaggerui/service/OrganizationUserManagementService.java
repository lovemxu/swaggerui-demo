package com.zito.swaggerui.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zito.swaggerui.dao.OrganizationUserManagementMapper;
import com.zito.swaggerui.pojo.OrganizationUserManagement;

@Service
public class OrganizationUserManagementService {

	@Autowired
	private OrganizationUserManagementMapper organizationUserManagementMapper;

	public OrganizationUserManagement queryByMap(Map<String, Object> paramMap) {
		return organizationUserManagementMapper.queryByMap(paramMap);
	}
}
