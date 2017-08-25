package com.zito.swaggerui.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;
import com.zito.swaggerui.utils.DateTimeUtil;

/**
 * @类名: OrganizationUserManagement
 * @简述: 经销商（机构）人员管理表
 * @作者: 史栋舟
 * @创建时间: 2017年5月4日-下午7:40:26
 */
@Table(name = "ORGANIZATION_USER_MANAGEMENT")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@ApiModel(value = "user", description = " 经销商（机构）人员管理表")
public class OrganizationUserManagement implements Serializable {
	/**
     *
     */
	private static final long serialVersionUID = 1216535656L;

	/**
	 * 主键
	 */
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	/**
	 * 姓名
	 */
	@Column(name = "USER_NAME")
	private String userName;

	/**
	 * 账号
	 */
	@Column(name = "USER_ACCOUNT")
	@ApiModelProperty(value = "账号", required = true)
	private String userAccount;

	/**
	 * 性别
	 */
	@Column(name = "USER_SEX")
	private String userSex;

	/**
	 * 证件类型
	 */
	@Column(name = "CERTIFICATE_TYPE")
	private String certificateType;

	/**
	 * 证件号
	 */
	@Column(name = "CERTIFICATE_NO")
	private String certificateNo;

	/**
	 * 手机号
	 */
	@Column(name = "PHONE_NO")
	private String phoneNo;

	/**
	 * 邮箱
	 */
	@Column(name = "MAILBOX")
	private String mailbox;

	/**
	 * 省
	 */
	@Column(name = "AREA_ONE")
	private String areaOne;

	/**
	 * 省 名称
	 */
	@Transient
	private String areaOneStr;

	/**
	 * 市
	 */
	@Column(name = "AREA_TWO")
	private String areaTwo;

	/**
	 * 市名称
	 */
	@Transient
	private String areaTwoStr;

	/**
	 * 区
	 */
	@Column(name = "AREA_THREE")
	private String areaThree;

	/**
	 * 区名称
	 */
	@Transient
	private String areaThreeStr;

	/**
	 * 详细地址
	 */
	@Column(name = "ADDRESS")
	private String address;

	/**
	 * 执业证名称
	 */
	@Column(name = "PRACTI_CERTI_NAME")
	private String practiCertiName;

	/**
	 * 执业证编号
	 */
	@Column(name = "PRACTI_CERTI_CODE")
	private String practiCertiCode;

	/**
	 * 所属公司名称
	 */
	@Column(name = "COMPANY_NAME")
	private String companyName;

	/**
	 * 执业区域
	 */
	@Column(name = "PRACTI_CERTI_AREA")
	private String practiCertiArea;

	/**
	 * 业务范围
	 */
	@Column(name = "BUSINESS_SCOPE")
	private String businessScope;

	/**
	 * 发证日期
	 */
	@Column(name = "ISSUE_DATE")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date issueDate;

	/**
	 * 发证日期String
	 */
	@Transient
	private String issueDateStr;

	/**
	 * 有效期开始
	 */
	@Column(name = "EXPIRY_DATE_BEGIN")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiryDateBegin;

	/**
	 * 有效期开始Str
	 */
	@Transient
	private String expiryDateBeginStr;

	/**
	 * 有效期结束
	 */
	@Column(name = "EXPIRY_DATE_END")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date expiryDateEnd;

	/**
	 * 有效期结束String
	 */
	@Transient
	private String expiryDateEndStr;

	/**
	 * 执证人照片
	 */
	@Column(name = "USER_IMG")
	// @Expression(regexp = "^(.*)/([^/]*)$", errorMsg = "图片url不正确")
	private String userImg;

	/**
	 * 开户银行
	 */
	@Column(name = "DEPOSIT_BANK")
	private String depositBank;

	/**
	 * 银行账号
	 */
	@Column(name = "BANK_ACCOUNT")
	private String bankAccount;

	/**
	 * 所属机构
	 */
	@Column(name = "ORGANIZATION_PARENT_ID")
	private String organizationParentId;

	/**
	 * 机构名称
	 */
	@Transient
	private String organizationName;

	/**
	 * 是否删除
	 */
	@Column(name = "IS_DEL")
	private String isDel;

	/**
	 * 是否有效
	 */
	@Column(name = "IS_VALID")
	private String isValid;

	/**
	 * 创建人ID
	 */
	@Column(name = "CREATE_ID")
	private String createId;

	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	private Date createTime;

	/**
	 * 修改人ID
	 */
	@Column(name = "UPDATE_ID")
	private String updateId;

	/**
	 * 修改时间
	 */
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	/**
	 * 密码
	 */
	@Column(name = "PASSWORD")
	@ApiModelProperty(value = "密码", required = true, dataType = "String")
	private String password;

	/**
	 * 销售人员编号
	 */
	@Column(name = "SALER_CODE")
	private String salerCode;

	/**
	 * 授权产品数量
	 */
	@Transient
	private String productCount;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalerCode() {
		return salerCode;
	}

	public void setSalerCode(String salerCode) {
		this.salerCode = salerCode;
	}

	public String getAreaOneStr() {
		return areaOneStr;
	}

	public void setAreaOneStr(String areaOneStr) {
		this.areaOneStr = areaOneStr;
	}

	public String getAreaTwoStr() {
		return areaTwoStr;
	}

	public void setAreaTwoStr(String areaTwoStr) {
		this.areaTwoStr = areaTwoStr;
	}

	public String getAreaThreeStr() {
		return areaThreeStr;
	}

	public void setAreaThreeStr(String areaThreeStr) {
		this.areaThreeStr = areaThreeStr;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getIssueDateStr() {
		if (null != this.getIssueDate()) {
			return DateTimeUtil.getFormatDate(this.getIssueDate());
		}
		return this.issueDateStr;
	}

	public void setIssueDateStr(String issueDateStr) {
		this.issueDateStr = issueDateStr;
	}

	public String getExpiryDateBeginStr() {
		if (null != this.getExpiryDateBegin()) {
			return DateTimeUtil.getFormatDate(this.getExpiryDateBegin());
		}
		return this.expiryDateBeginStr;
	}

	public void setExpiryDateBeginStr(String expiryDateBeginStr) {
		this.expiryDateBeginStr = expiryDateBeginStr;
	}

	public String getExpiryDateEndStr() {
		if (null != this.getExpiryDateEnd()) {
			return DateTimeUtil.getFormatDate(this.getExpiryDateEnd());
		}
		return this.expiryDateEndStr;
	}

	public void setExpiryDateEndStr(String expiryDateEndStr) {
		this.expiryDateEndStr = expiryDateEndStr;
	}

	/**
	 * 获取主键
	 *
	 * @return ID - 主键
	 */
	public String getId() {
		return id;
	}

	/**
	 * 设置主键
	 *
	 * @param id
	 *            主键
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取姓名
	 *
	 * @return USER_NAME - 姓名
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设置姓名
	 *
	 * @param userName
	 *            姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 获取工号
	 *
	 * @return USER_ACCOUNT - 工号
	 */
	public String getUserAccount() {
		return userAccount;
	}

	/**
	 * 设置工号
	 *
	 * @param userAccount
	 *            工号
	 */
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * 获取性别
	 *
	 * @return USER_SEX - 性别
	 */
	public String getUserSex() {
		return userSex;
	}

	/**
	 * 设置性别
	 *
	 * @param userSex
	 *            性别
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	/**
	 * 获取证件类型
	 *
	 * @return CERTIFICATE_TYPE - 证件类型
	 */
	public String getCertificateType() {
		return certificateType;
	}

	/**
	 * 设置证件类型
	 *
	 * @param certificateType
	 *            证件类型
	 */
	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	/**
	 * 获取证件号
	 *
	 * @return CERTIFICATE_NO - 证件号
	 */
	public String getCertificateNo() {
		return certificateNo;
	}

	/**
	 * 设置证件号
	 *
	 * @param certificateNo
	 *            证件号
	 */
	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}

	/**
	 * 获取手机号
	 *
	 * @return PHONE_NO - 手机号
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * 设置手机号
	 *
	 * @param phoneNo
	 *            手机号
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * 获取邮箱
	 *
	 * @return MAILBOX - 邮箱
	 */
	public String getMailbox() {
		return mailbox;
	}

	/**
	 * 设置邮箱
	 *
	 * @param mailbox
	 *            邮箱
	 */
	public void setMailbox(String mailbox) {
		this.mailbox = mailbox;
	}

	/**
	 * 获取省
	 *
	 * @return AREA_ONE - 省
	 */
	public String getAreaOne() {
		return areaOne;
	}

	/**
	 * 设置省
	 *
	 * @param areaOne
	 *            省
	 */
	public void setAreaOne(String areaOne) {
		this.areaOne = areaOne;
	}

	/**
	 * 获取市
	 *
	 * @return AREA_TWO - 市
	 */
	public String getAreaTwo() {
		return areaTwo;
	}

	/**
	 * 设置市
	 *
	 * @param areaTwo
	 *            市
	 */
	public void setAreaTwo(String areaTwo) {
		this.areaTwo = areaTwo;
	}

	/**
	 * 获取区
	 *
	 * @return AREA_THREE - 区
	 */
	public String getAreaThree() {
		return areaThree;
	}

	/**
	 * 设置区
	 *
	 * @param areaThree
	 *            区
	 */
	public void setAreaThree(String areaThree) {
		this.areaThree = areaThree;
	}

	/**
	 * 获取详细地址
	 *
	 * @return ADDRESS - 详细地址
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 设置详细地址
	 *
	 * @param address
	 *            详细地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取执业证名称
	 *
	 * @return PRACTI_CERTI_NAME - 执业证名称
	 */
	public String getPractiCertiName() {
		return practiCertiName;
	}

	/**
	 * 设置执业证名称
	 *
	 * @param practiCertiName
	 *            执业证名称
	 */
	public void setPractiCertiName(String practiCertiName) {
		this.practiCertiName = practiCertiName;
	}

	/**
	 * 获取执业证编号
	 *
	 * @return PRACTI_CERTI_CODE - 执业证编号
	 */
	public String getPractiCertiCode() {
		return practiCertiCode;
	}

	/**
	 * 设置执业证编号
	 *
	 * @param practiCertiCode
	 *            执业证编号
	 */
	public void setPractiCertiCode(String practiCertiCode) {
		this.practiCertiCode = practiCertiCode;
	}

	/**
	 * 获取所属公司名称
	 *
	 * @return COMPANY_NAME - 所属公司名称
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 设置所属公司名称
	 *
	 * @param companyName
	 *            所属公司名称
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * 获取执业区域
	 *
	 * @return PRACTI_CERTI_AREA - 执业区域
	 */
	public String getPractiCertiArea() {
		return practiCertiArea;
	}

	/**
	 * 设置执业区域
	 *
	 * @param practiCertiArea
	 *            执业区域
	 */
	public void setPractiCertiArea(String practiCertiArea) {
		this.practiCertiArea = practiCertiArea;
	}

	/**
	 * 获取业务范围
	 *
	 * @return BUSINESS_SCOPE - 业务范围
	 */
	public String getBusinessScope() {
		return businessScope;
	}

	/**
	 * 设置业务范围
	 *
	 * @param businessScope
	 *            业务范围
	 */
	public void setBusinessScope(String businessScope) {
		this.businessScope = businessScope;
	}

	/**
	 * 获取发证日期
	 *
	 * @return ISSUE_DATE - 发证日期
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * 设置发证日期
	 *
	 * @param issueDate
	 *            发证日期
	 */
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * 获取有效期开始
	 *
	 * @return EXPIRY_DATE_BEGIN - 有效期开始
	 */
	public Date getExpiryDateBegin() {
		return expiryDateBegin;
	}

	/**
	 * 设置有效期开始
	 *
	 * @param expiryDateBegin
	 *            有效期开始
	 */
	public void setExpiryDateBegin(Date expiryDateBegin) {
		this.expiryDateBegin = expiryDateBegin;
	}

	/**
	 * 获取有效期结束
	 *
	 * @return EXPIRY_DATE_END - 有效期结束
	 */
	public Date getExpiryDateEnd() {
		return expiryDateEnd;
	}

	/**
	 * 设置有效期结束
	 *
	 * @param expiryDateEnd
	 *            有效期结束
	 */
	public void setExpiryDateEnd(Date expiryDateEnd) {
		this.expiryDateEnd = expiryDateEnd;
	}

	/**
	 * 获取执证人照片
	 *
	 * @return USER_IMG - 执证人照片
	 */
	public String getUserImg() {
		return userImg;
	}

	/**
	 * 设置执证人照片
	 *
	 * @param userImg
	 *            执证人照片
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	/**
	 * 获取开户银行
	 *
	 * @return DEPOSIT_BANK - 开户银行
	 */
	public String getDepositBank() {
		return depositBank;
	}

	/**
	 * 设置开户银行
	 *
	 * @param depositBank
	 *            开户银行
	 */
	public void setDepositBank(String depositBank) {
		this.depositBank = depositBank;
	}

	/**
	 * 获取银行账号
	 *
	 * @return BANK_ACCOUNT - 银行账号
	 */
	public String getBankAccount() {
		return bankAccount;
	}

	/**
	 * 设置银行账号
	 *
	 * @param bankAccount
	 *            银行账号
	 */
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	/**
	 * 获取所属机构
	 *
	 * @return ORGANIZATION_PARENT_ID - 所属机构
	 */
	public String getOrganizationParentId() {
		return organizationParentId;
	}

	/**
	 * 设置所属机构
	 *
	 * @param organizationParentId
	 *            所属机构
	 */
	public void setOrganizationParentId(String organizationParentId) {
		this.organizationParentId = organizationParentId;
	}

	/**
	 * 获取是否删除
	 *
	 * @return IS_DEL - 是否删除
	 */
	public String getIsDel() {
		return isDel;
	}

	/**
	 * 设置是否删除
	 *
	 * @param isDel
	 *            是否删除
	 */
	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	/**
	 * 获取是否有效
	 *
	 * @return IS_VALID - 是否有效
	 */
	public String getIsValid() {
		return isValid;
	}

	/**
	 * 设置是否有效
	 *
	 * @param isValid
	 *            是否有效
	 */
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}

	/**
	 * 获取创建人ID
	 *
	 * @return CREATE_ID - 创建人ID
	 */
	public String getCreateId() {
		return createId;
	}

	/**
	 * 设置创建人ID
	 *
	 * @param createId
	 *            创建人ID
	 */
	public void setCreateId(String createId) {
		this.createId = createId;
	}

	/**
	 * 获取创建时间
	 *
	 * @return CREATE_TIME - 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 设置创建时间
	 *
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 获取修改人ID
	 *
	 * @return UPDATE_ID - 修改人ID
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * 设置修改人ID
	 *
	 * @param updateId
	 *            修改人ID
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	/**
	 * 获取修改时间
	 *
	 * @return UPDATE_TIME - 修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 设置修改时间
	 *
	 * @param updateTime
	 *            修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Transient
	private String orgiName;

	public String getOrgiName() {
		return orgiName;
	}

	public void setOrgiName(String orgiName) {
		this.orgiName = orgiName;
	}

}