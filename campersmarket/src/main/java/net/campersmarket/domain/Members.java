package net.campersmarket.domain;

import java.io.Serializable;
import java.util.Date;

public class Members implements Serializable {
	private static final long	serialVersionUID	= 1L;
	
	protected int uid;
	protected String umail;
	protected String upasswd;
	protected String uname;
	protected Boolean unexpo;
	protected String unick;
	protected int uphone;
	protected int ulev;
	protected int uexp;
	protected Date udate;
	
	@Override
	public String toString() {
		return "Members [회원식별번호=" + uid + ", 이메일=" + umail + ", 비밀번호=" + upasswd
				+ ", 이름=" + uname + ", 이름공개여부=" + unexpo + ", 별명=" + unick
				+ ", 전화번호=" + uphone + ", 레벨=" + ulev + ", 경험치=" + uexp
				+ ", 가입일자=" + udate + "]";
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUmail() {
		return umail;
	}
	public void setUmail(String umail) {
		this.umail = umail;
	}
	public String getUpasswd() {
		return upasswd;
	}
	public void setUpasswd(String upasswd) {
		this.upasswd = upasswd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Boolean getUnexpo() {
		return unexpo;
	}
	public void setUnexpo(Boolean unexpo) {
		this.unexpo = unexpo;
	}
	public String getUnick() {
		return unick;
	}
	public void setUnick(String unick) {
		this.unick = unick;
	}
	public int getUphone() {
		return uphone;
	}
	public void setUphone(int uphone) {
		this.uphone = uphone;
	}
	public int getUlev() {
		return ulev;
	}
	public void setUlev(int ulev) {
		this.ulev = ulev;
	}
	public int getUexp() {
		return uexp;
	}
	public void setUexp(int uexp) {
		this.uexp = uexp;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
}
