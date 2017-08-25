package com.zito.swaggerui.enums;

/**
 * 
 * @Description : app端调用后台接口状态
 * @author pengchenyang
 *
 */
public enum AppStatusEnum {

	STATUS_OK				    ("200","成功"),
	STATUS_FAILED				("201","没有数据"),
	STATUS_PARAMISNULL			("202","参数为空"),

	STATUS_POLICYSTART_ERROR	("203","生效日期不能小于当前日期"),
	PAY_STATUS				    ("204","该订单未支付"),
	PAY_ERROR_STATUS			("205","支付失败"),

	STATUS_FROZEN				("210","账号被冻结"),
	STATUS_ACCOUNT_FAILED		("211","账号或密码不正确"),
	STATUS_PASSWORD_SAME		("212","新旧密码不能相同"),


	STATUS_ERROR				("500","服务器内部异常"),
	;

	private AppStatusEnum(String value, String des){
		this.value = value;
		this.des = des;
	}
    

	private String value;		//参数值
	private String des; 		//参数描述

	public String value(){
		return value;
	}
	
	public String des(){
		return des;
	}

	
}
