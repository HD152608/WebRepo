/**
 * 
 */
package org.dimigo.vo;

/**
 * <pre>
 * org.dimigo.vo
 *  |_ UserVO
 *
 * 1. 개요:
 * 2. 작성일: 2017. 9. 26.
 * </pre>
 *
 * @author     : 덮어라.pc
 * @version    : 1.0
 */
public class UserVO {
	
	/**
	 * @param id
	 * @param name
	 * @param nickname
	 */
	
	private String id;
	private String name;
	private String nickname;
	
	public UserVO(){
		
	}
	/**
	 * @return the id
	 */
	public UserVO(String id, String name, String nickname) {
		this.id = id;
		this.name = name;
		this.nickname = nickname;
	}
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	

}
