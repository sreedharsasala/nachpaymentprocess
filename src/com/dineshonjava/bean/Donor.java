package com.dineshonjava.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="donors")
public class Donor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "DONOR_ID")
	private Integer donorid;
	
	@Column(name = "TRUST_ID")
	private Integer trustid;
	
	@Column(name = "CENTER_ID")
	private Integer centerid;
		
	@Column(name="SALUTATION")
	private String salitation;
	
	@Column(name="FIRST_NAME")
	private String sirstname;
	
	@Column(name = "LAST_NAME")
	private String lastnamem;
	
	@Column(name = "SPOUSE_NAME")
	private String spousename;
	
	@Column(name = "DATE_OF_BIRTH")
	private Integer dateofbirth;
	
	@Column(name="NATIONALITY")
	private char nationality;
	
	@Column(name="OCCUPATION")
	private String occupation;
	
	
	@Column(name = "REGISTERED_ON")
	private Date registeredon;
	
	@Column(name = "PREACHER_CODE")
	private String preachercode;
	
	@Column(name = "CURR_PRCR_CODE")
	private String currprcrcode;
	
	@Column(name="ALLOC_PRCR_CODE")
	private String allocprercode;
	
	@Column(name="BRANCH_CODE")
	private String branchcode;
	
	@Column(name = "LAST_DONATION_DATE")
	private Date lastdonationdate;
	
	@Column(name = "LAST_DONATION_AMOUNT")
	private float lastdonationamount;
	
	@Column(name = "REMARKS")
	private String remarks;
	
	@Column(name="CREATED_BY")
	private String createdby;
	
	@Column(name="CREATED_ON")
	private Date createon;
	
	
	@Column(name="VERIFIED_BY")
	private String verifiedby;
	
	@Column(name="MODIFIED_BY")
	private String modifiedby;
	
	/*@Column(name="MODIFIED_ON")
	private Date modifidon;
	*/
	@Column(name="empid")
	private Integer empid;
	
	@Column(name="empaddress")
	private String empaddress;
	
	@Column(name="empAge")
	private Integer empAge;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="salary")
	private BigInteger salary;
	
	
	@OneToOne
    @JoinColumn(name="CONTACT_ID")
	private Contactdetails category;


	public Integer getTrustid() {
		return trustid;
	}


	public void setTrustid(Integer trustid) {
		this.trustid = trustid;
	}


	public Integer getCenterid() {
		return centerid;
	}


	public void setCenterid(Integer centerid) {
		this.centerid = centerid;
	}


	public Integer getDonorid() {
		return donorid;
	}


	public void setDonorid(Integer donorid) {
		this.donorid = donorid;
	}


	public String getSalitation() {
		return salitation;
	}


	public void setSalitation(String salitation) {
		this.salitation = salitation;
	}


	public String getSirstname() {
		return sirstname;
	}


	public void setSirstname(String sirstname) {
		this.sirstname = sirstname;
	}


	public String getLastnamem() {
		return lastnamem;
	}


	public void setLastnamem(String lastnamem) {
		this.lastnamem = lastnamem;
	}


	public String getSpousename() {
		return spousename;
	}


	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}


	public Integer getDateofbirth() {
		return dateofbirth;
	}


	public void setDateofbirth(Integer dateofbirth) {
		this.dateofbirth = dateofbirth;
	}


	public char getNationality() {
		return nationality;
	}


	public void setNationality(char nationality) {
		this.nationality = nationality;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	public Date getRegisteredon() {
		return registeredon;
	}


	public void setRegisteredon(Date registeredon) {
		this.registeredon = registeredon;
	}


	public String getPreachercode() {
		return preachercode;
	}


	public void setPreachercode(String preachercode) {
		this.preachercode = preachercode;
	}


	public String getCurrprcrcode() {
		return currprcrcode;
	}


	public void setCurrprcrcode(String currprcrcode) {
		this.currprcrcode = currprcrcode;
	}


	public String getAllocprercode() {
		return allocprercode;
	}


	public void setAllocprercode(String allocprercode) {
		this.allocprercode = allocprercode;
	}


	public String getBranchcode() {
		return branchcode;
	}


	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}


	public Date getLastdonationdate() {
		return lastdonationdate;
	}


	public void setLastdonationdate(Date lastdonationdate) {
		this.lastdonationdate = lastdonationdate;
	}


	public float getLastdonationamount() {
		return lastdonationamount;
	}


	public void setLastdonationamount(float lastdonationamount) {
		this.lastdonationamount = lastdonationamount;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getCreatedby() {
		return createdby;
	}


	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}


	public Date getCreateon() {
		return createon;
	}


	public void setCreateon(Date createon) {
		this.createon = createon;
	}


	public String getVerifiedby() {
		return verifiedby;
	}


	public void setVerifiedby(String verifiedby) {
		this.verifiedby = verifiedby;
	}


	public String getModifiedby() {
		return modifiedby;
	}


	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}


	/*public Date getModifidon() {
		return modifidon;
	}


	public void setModifidon(Date modifidon) {
		this.modifidon = modifidon;
	}
*/

	public Integer getEmpid() {
		return empid;
	}


	public void setEmpid(Integer empid) {
		this.empid = empid;
	}


	public String getEmpaddress() {
		return empaddress;
	}


	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}


	public Integer getEmpAge() {
		return empAge;
	}


	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public BigInteger getSalary() {
		return salary;
	}


	public void setSalary(BigInteger salary) {
		this.salary = salary;
	}

	public Contactdetails getCategory() {
		return category;
	}


	public void setCategory(Contactdetails category) {
		this.category = category;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
