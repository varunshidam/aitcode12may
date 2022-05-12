package com.myait.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banner {
	@Id
	private int bannerid;
	private String bannerdetails;
	private Byte[] bannerimage;
	private String bannertargetlink;
	private int uploadedby;
	private Date createddate;
	private boolean isactive;

	public Banner() {

	}

	public Banner(int bannerid, String bannerdetails, Byte[] bannerimage, String bannertargetlink, int uploadedby,
			Date createddate, boolean isactive) {
		super();
		this.bannerid = bannerid;
		this.bannerdetails = bannerdetails;
		this.bannerimage = bannerimage;
		this.bannertargetlink = bannertargetlink;
		this.uploadedby = uploadedby;
		this.createddate = createddate;
		this.isactive = isactive;
	}

	public int getBannerid() {
		return bannerid;
	}

	public void setBannerid(int bannerid) {
		this.bannerid = bannerid;
	}

	public String getBannerdetails() {
		return bannerdetails;
	}

	public void setBannerdetails(String bannerdetails) {
		this.bannerdetails = bannerdetails;
	}

	public Byte[] getBannerimage() {
		return bannerimage;
	}

	public void setBannerimage(Byte[] bannerimage) {
		this.bannerimage = bannerimage;
	}

	public String getBannertargetlink() {
		return bannertargetlink;
	}

	public void setBannertargetlink(String bannertargetlink) {
		this.bannertargetlink = bannertargetlink;
	}

	public int getUploadedby() {
		return uploadedby;
	}

	public void setUploadedby(int uploadedby) {
		this.uploadedby = uploadedby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	@Override
	public String toString() {
		return "Banner [bannerid=" + bannerid + ", bannerdetails=" + bannerdetails + ", bannerimage="
				+ Arrays.toString(bannerimage) + ", bannertargetlink=" + bannertargetlink + ", uploadedby=" + uploadedby
				+ ", createddate=" + createddate + ", isactive=" + isactive + "]";
	}

}
