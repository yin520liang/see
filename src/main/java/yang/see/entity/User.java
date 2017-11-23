/**
 * 
 */
package yang.see.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @title
 * @description 用户
 * @author lvzhaoyang
 * @date 2017年11月2日下午4:30:33
 */
@Entity(name = "user")
@Table(name = "see_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String nickname;
	@Column
	private String desc;
	@Column
	private String portraitImgPath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPortraitImgPath() {
		return portraitImgPath;
	}

	public void setPortraitImgPath(String portraitImgPath) {
		this.portraitImgPath = portraitImgPath;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
