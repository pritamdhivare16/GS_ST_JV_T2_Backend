package com.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="empDB")
public class empDB {
	@Id @Column(length=6)
	private String grievanceId;
	@Column(length=10)
	private Date date;
	@Column(length=40)
	private String fullName;
	@Column(length=10)
	private String mobile;
	@Column(length=20)
	private String tehsil;
	@Column(length=20)
	private String village;
	@Column(length=50)
	private String address;
	@Column(length=12)
	private int aadharNo;
	@Column
	private String grievance;
	@Column(length=30)
	private String forwardedToDept;
	public empDB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public empDB(String grievanceId, Date date, String fullName, String mobile, String tehsil, String village,
			String address, int aadharNo, String grievance, String forwardedToDept) {
		super();
		this.grievanceId = grievanceId;
		this.date = date;
		this.fullName = fullName;
		this.mobile = mobile;
		this.tehsil = tehsil;
		this.village = village;
		this.address = address;
		this.aadharNo = aadharNo;
		this.grievance = grievance;
		this.forwardedToDept = forwardedToDept;
	}
	public String getGrievanceId() {
		return grievanceId;
	}
	public void setGrievanceId(String grievanceId) {
		this.grievanceId = grievanceId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTehsil() {
		return tehsil;
	}
	public void setTehsil(String tehsil) {
		this.tehsil = tehsil;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getGrievance() {
		return grievance;
	}
	public void setGrievance(String grievance) {
		this.grievance = grievance;
	}
	public String getForwardedToDept() {
		return forwardedToDept;
	}
	public void setForwardedToDept(String forwardedToDept) {
		this.forwardedToDept = forwardedToDept;
	}
	@Override
	public String toString() {
		return "empDB [grievanceId=" + grievanceId + ", date=" + date + ", fullName=" + fullName + ", mobile=" + mobile
				+ ", tehsil=" + tehsil + ", village=" + village + ", address=" + address + ", aadharNo=" + aadharNo
				+ ", grievance=" + grievance + ", forwardedToDept=" + forwardedToDept + "]";
	}
	
	
}
