package org.oscarehr.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PHRVerification  extends AbstractModel<Integer> implements Serializable {
	/*
	create table PHRVerification(
	id int(10) auto_increment primary key,
	demographicNo int(10),
	phrUserName varchar(255),
	verificationLevel varchar(100),
	verificationDate datetime,
	verificationBy varchar(6),
	photoId tinyint(1),
	parentGuardian tinyint(1),
	comments text,
	createdDate datetime,
	archived tinyint(1)
	);
	
	Should i have a field for head record
	
	*/

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	private Integer demographicNo; 
	private String phrUserName ;
	private String verificationLevel ;
	@Temporal(TemporalType.TIMESTAMP)
	private Date verificationDate ;
	private String verificationBy;
	private Boolean photoId ;
	private Boolean parentGuardian;
	private String comments;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	private Boolean archived;
	
	
	
	@Override
    public Integer getId() {
		return id;
    }
	public Integer getDemographicNo() {
    	return demographicNo;
    }
	public void setDemographicNo(Integer demographicNo) {
    	this.demographicNo = demographicNo;
    }
	public String getPhrUserName() {
    	return phrUserName;
    }
	public void setPhrUserName(String phrUserName) {
    	this.phrUserName = phrUserName;
    }
	public String getVerificationLevel() {
    	return verificationLevel;
    }
	public void setVerificationLevel(String authenticationLevel) {
    	this.verificationLevel = authenticationLevel;
    }
	public Date getVerificationDate() {
    	return verificationDate;
    }
	public void setVerificationDate(Date authenticationDate) {
    	this.verificationDate = authenticationDate;
    }
	public String getVerificationBy() {
    	return verificationBy;
    }
	public void setVerificationBy(String authenticationBy) {
    	this.verificationBy = authenticationBy;
    }
	public Boolean getPhotoId() {
    	return photoId;
    }
	public void setPhotoId(Boolean photoId) {
    	this.photoId = photoId;
    }
	public String getComments() {
    	return comments;
    }
	public void setComments(String comments) {
    	this.comments = comments;
    }
	public Date getCreatedDate() {
    	return createdDate;
    }
	public void setCreatedDate(Date createdDate) {
    	this.createdDate = createdDate;
    }
	public Boolean getArchived() {
    	return archived;
    }
	public void setArchived(Boolean archived) {
    	this.archived = archived;
    }
	public void setId(Integer id) {
    	this.id = id;
    }
	public Boolean getParentGuardian() {
    	return parentGuardian;
    }
	public void setParentGuardian(Boolean parentGuardian) {
    	this.parentGuardian = parentGuardian;
    }
	
}