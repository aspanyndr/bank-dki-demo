package org.mycompany.dto;

import java.io.Serializable;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.mycompany.pojo.AdditionalInfo;

public class RegLimitDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Length(min = 3, max = 64)
	private String partnerReferenceNo;
	@Length(min = 3, max = 32)
	private String bankAccountNo;
	@Length(min = 3, max = 19)
	private String bankCardNo;
	@Length(min = 3, max = 17)
	private String limit;
	@NotEmpty
	@Length(min = 3, max = 128)
	private String bankCardToken;
	@NotEmpty
	@Length(min = 8, max = 8)
	private String otp;	
	@Valid
	private AdditionalInfo additionalInfo;
	public String getPartnerReferenceNo() {
		return partnerReferenceNo;
	}
	public void setPartnerReferenceNo(String partnerReferenceNo) {
		this.partnerReferenceNo = partnerReferenceNo;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getBankCardToken() {
		return bankCardToken;
	}
	public void setBankCardToken(String bankCardToken) {
		this.bankCardToken = bankCardToken;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
