package org.mycompany.dto;

import java.io.Serializable;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.mycompany.pojo.RepaymentNoticeBody;

public class RepaymentNoticeDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String appId;
	@Valid
	private List<RepaymentNoticeBody> body = null;

	public List<RepaymentNoticeBody> getBody() {
		return body;
	}

	public void setBody(List<RepaymentNoticeBody> body) {
		this.body = body;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

}
