package com.zito.swaggerui.dao;

import java.util.Map;


import com.zito.swaggerui.pojo.OrganizationUserManagement;

public interface OrganizationUserManagementMapper {

	OrganizationUserManagement queryByMap(Map<String, Object> paramMap);

}
