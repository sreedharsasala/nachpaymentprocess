package com.dineshonjava.bean;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_details")
public class Contactdetails {
	
	public Contactdetails(){}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CONTACT_ID")
	private Integer contactid;

	@Column(name="CONTACT_NAME")
	private String contact_name;
	
	@Column(name="RES_ADDR_LINE_1")
	private String resaddline1;
	
	@Column(name="RES_ADDR_LINE_2")
	private String resaddline2;
	
	@Column(name="RES_ADDR_LINE_3")
	private String resaddline3;
	
	
	@Column(name="RES_ADDR_LINE_4")
	private String resaddline4;
	
	
	@Column(name="RES_ADDR_LINE_5")
	private String resaddline5;
	
	@Column(name="RES_PINCODE")
	private String respincode;
	
	@Column(name="RES_CITY_CODE")
	private Integer rescitycode;
	
	@Column(name="RES_STATE_CODE")
	private Integer resstatecode;
	
	@Column(name="RES_CNTRY_CODE")
	private Integer rescntrycode;
	
	@Column(name="OFF_ADDR_LINE_1")
	private String offaddrline1;
	
	@Column(name="OFF_ADDR_LINE_2")
	private String offaddrline2;
	
	@Column(name="OFF_ADDR_LINE_3")
	private String offaddrline3;
	
	@Column(name="OFF_ADDR_LINE_4")
	private String offaddrline4;
	
	@Column(name="OFF_ADDR_LINE_5")
	private String offaddrline5;
	
	
	@Column(name="OFF_PINCODE")
	private String offpincode;
	
	
	@Column(name="OFF_CITY_CODE")
	private Integer offcitycode;
	
	@Column(name="OFF_STATE_CODE")
	private Integer offstatecode;
	
	@Column(name="OFF_CNTRY_CODE")
	private Integer offcntrycode;
	
	@Column(name="MAILING_PREF")
	private Character mailingpref;
	
	@Column(name="RES_PHONE")
	private String resphone;

	@Column(name="OFF_PHONE")
	private String offphone;
	
	@Column(name="MOBILE_1")
	private String mobile1;
	
	
	@Column(name="MOBILE_2")
	private String mobile2;
	
	
	@Column(name="PHONE_1")
	private String phone1;
	
	@Column(name="PHONE_2")
	private String phone2;
	
	@Column(name="FAX_NUMBER")
	private String faxnumber;
	
	@Column(name="EMAIL_1")
	private String email1;
	
	@Column(name="EMAIL_2")
	private String email2;
	
	@Column(name="VERIFIED")
	private char verified;
	
	/*@Column(name="CREATED_BY")
	private Date createdby;
	
	
	@Column(name="CREATED_ON")
	private Date createdon;
	
	@Column(name="MODIFIED_BY")
	private Date modifidby;
	
	@Column(name="MODIFIED_ON")
	private Date modifideon;*/
	


	
	public void setVerified(char verified) {
		this.verified = verified;
	}

	public String getContact_name() {
		return contact_name;
	}

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public String getResaddline1() {
		return resaddline1;
	}

	public void setResaddline1(String resaddline1) {
		this.resaddline1 = resaddline1;
	}

	public String getResaddline2() {
		return resaddline2;
	}

	public void setResaddline2(String resaddline2) {
		this.resaddline2 = resaddline2;
	}

	public String getResaddline3() {
		return resaddline3;
	}

	public void setResaddline3(String resaddline3) {
		this.resaddline3 = resaddline3;
	}

	public String getResaddline4() {
		return resaddline4;
	}

	public void setResaddline4(String resaddline4) {
		this.resaddline4 = resaddline4;
	}

	public String getResaddline5() {
		return resaddline5;
	}

	public void setResaddline5(String resaddline5) {
		this.resaddline5 = resaddline5;
	}

	public String getRespincode() {
		return respincode;
	}

	public void setRespincode(String respincode) {
		this.respincode = respincode;
	}

	public Integer getRescitycode() {
		return rescitycode;
	}

	public void setRescitycode(Integer rescitycode) {
		this.rescitycode = rescitycode;
	}

	public Integer getResstatecode() {
		return resstatecode;
	}

	public void setResstatecode(Integer resstatecode) {
		this.resstatecode = resstatecode;
	}

	public Integer getRescntrycode() {
		return rescntrycode;
	}

	public void setRescntrycode(Integer rescntrycode) {
		this.rescntrycode = rescntrycode;
	}

	public String getOffaddrline1() {
		return offaddrline1;
	}

	public void setOffaddrline1(String offaddrline1) {
		this.offaddrline1 = offaddrline1;
	}

	public String getOffaddrline2() {
		return offaddrline2;
	}

	public void setOffaddrline2(String offaddrline2) {
		this.offaddrline2 = offaddrline2;
	}

	public String getOffaddrline3() {
		return offaddrline3;
	}

	public void setOffaddrline3(String offaddrline3) {
		this.offaddrline3 = offaddrline3;
	}

	public String getOffaddrline4() {
		return offaddrline4;
	}

	public void setOffaddrline4(String offaddrline4) {
		this.offaddrline4 = offaddrline4;
	}

	public String getOffaddrline5() {
		return offaddrline5;
	}

	public void setOffaddrline5(String offaddrline5) {
		this.offaddrline5 = offaddrline5;
	}

	public String getOffpincode() {
		return offpincode;
	}

	public void setOffpincode(String offpincode) {
		this.offpincode = offpincode;
	}

	public Integer getOffcitycode() {
		return offcitycode;
	}

	public void setOffcitycode(Integer offcitycode) {
		this.offcitycode = offcitycode;
	}

	public Integer getOffstatecode() {
		return offstatecode;
	}

	public void setOffstatecode(Integer offstatecode) {
		this.offstatecode = offstatecode;
	}

	public Integer getOffcntrycode() {
		return offcntrycode;
	}

	public void setOffcntrycode(Integer offcntrycode) {
		this.offcntrycode = offcntrycode;
	}

	public Character getMailingpref() {
		return mailingpref;
	}

	public void setMailingpref(Character mailingpref) {
		this.mailingpref = mailingpref;
	}

	public String getResphone() {
		return resphone;
	}

	public void setResphone(String resphone) {
		this.resphone = resphone;
	}

	public String getOffphone() {
		return offphone;
	}

	public void setOffphone(String offphone) {
		this.offphone = offphone;
	}

	public String getMobile1() {
		return mobile1;
	}

	public void setMobile1(String mobile1) {
		this.mobile1 = mobile1;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getFaxnumber() {
		return faxnumber;
	}

	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public Character getVerified() {
		return verified;
	}

	public void setVerified(Character verified) {
		this.verified = verified;
	}

	
}
