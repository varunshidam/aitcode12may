package com.myait.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "user")
//@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User {
	@Id
	private int userid;
	private String aitid;
	private int deptid;
	private String firstname;
	private String lastname;
	private Date dob;
	private Date doj;
	private Blob userimage;
	private String aitemail;
	private long contactnumber;
	private String password;
	private int reportingmanagerid;
	private String designation;
	private String benchstatus;
	private String usertype;
	private String userstatus;
	private int createdby;
	private Date createddate;
	private int modifiedby;
	private Date modifieddate;

	public User() {

		// TODO Auto-generated constructor stub
	}

	public User(int userid, String aitid, int deptid, String firstname, String lastname, Date dob, Date doj,
			Blob userimage, String aitemail, long contactnumber, String password, int reportingmanagerid,
			String designation, String benchstatus, String usertype, String userstatus, int createdby, Date createddate,
			int modifiedby, Date modifieddate) {

		this.userid = userid;
		this.aitid = aitid;
		this.deptid = deptid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.doj = doj;
		this.userimage = userimage;
		this.aitemail = aitemail;
		this.contactnumber = contactnumber;
		this.password = password;
		this.reportingmanagerid = reportingmanagerid;
		this.designation = designation;
		this.benchstatus = benchstatus;
		this.usertype = usertype;
		this.userstatus = userstatus;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getAitid() {
		return aitid;
	}

	public void setAitid(String aitid) {
		this.aitid = aitid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Blob getUserimage() {
		return userimage;
	}

	public void setUserimage(Blob userimage) {
		this.userimage = userimage;
	}

	public String getAitemail() {
		return aitemail;
	}

	public void setAitemail(String aitemail) {
		this.aitemail = aitemail;
	}

	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getReportingmanagerid() {
		return reportingmanagerid;
	}

	public void setReportingmanagerid(int reportingmanagerid) {
		this.reportingmanagerid = reportingmanagerid;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getBenchstatus() {
		return benchstatus;
	}

	public void setBenchstatus(String benchstatus) {
		this.benchstatus = benchstatus;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getUserstatus() {
		return userstatus;
	}

	public void setUserstatus(String userstatus) {
		this.userstatus = userstatus;
	}

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public int getModifiedby() {
		return modifiedby;
	}

	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}

	public Date getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", aitid=" + aitid + ", deptid=" + deptid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", dob=" + dob + ", doj=" + doj + ", userimage=" + userimage
				+ ", aitemail=" + aitemail + ", contactnumber=" + contactnumber + ", password=" + password
				+ ", reportingmanagerid=" + reportingmanagerid + ", designation=" + designation + ", benchstatus="
				+ benchstatus + ", usertype=" + usertype + ", userstatus=" + userstatus + ", createdby=" + createdby
				+ ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate
				+ "]";
	}

}
