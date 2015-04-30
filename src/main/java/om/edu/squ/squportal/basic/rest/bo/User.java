/**
 * Project				:	prjRestBasic
 * Organization			:	Sultan Qaboos University | Muscat | Oman
 * Centre				:	Centre for Information System
 * Department			:	Planning & Development
 * 
 * Author				:	Bhabesh
 *
 * FrameWork			:	Spring 3.2.3 (Annotation) Portlet
 * 
 * File Name			:	User.java
 * Package Name			:	om.edu.squ.squportal.basic.rest.bo
 * Date of creation		:	Mar 31, 2015  2:11:54 PM
 * Date of modification :	
 * 
 * Summary				:	
 *
 *
 * Copyright 2015 the original author or authors and Organization.
 *
 * Licensed under the SQU, CIS policy
 * you may not use this file except in compliance with the License.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * 
 */
package om.edu.squ.squportal.basic.rest.bo;


/**
 * @author Bhabesh
 *
 */
public class User 
{
	private String userId;
	private String userName;
	private String userType;
	
	/**
	 * Getter Method	: getUserId
	 * @return the userId
	 * 
	 * Date				: Mar 31, 2015
	 */
	public String getUserId() {
	
		return userId;
	}
	
	/**
	 * Setter method : setUserId
	 * @param userId the userId to set
	 * 
	 * Date          : Mar 31, 2015 2:12:54 PM
	 */
	public void setUserId(String userId) {
	
		this.userId = userId;
	}
	
	/**
	 * Getter Method	: getUserName
	 * @return the userName
	 * 
	 * Date				: Mar 31, 2015
	 */
	public String getUserName() {
	
		return userName;
	}
	
	/**
	 * Setter method : setUserName
	 * @param userName the userName to set
	 * 
	 * Date          : Mar 31, 2015 2:12:54 PM
	 */
	public void setUserName(String userName) {
	
		this.userName = userName;
	}
	
	/**
	 * Getter Method	: getUserType
	 * @return the userType
	 * 
	 * Date				: Mar 31, 2015
	 */
	public String getUserType() {
	
		return userType;
	}
	
	/**
	 * Setter method : setUserType
	 * @param userType the userType to set
	 * 
	 * Date          : Mar 31, 2015 2:12:54 PM
	 */
	public void setUserType(String userType) {
	
		this.userType = userType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "User [userId=" + userId + ", userName=" + userName +
			", userType=" + userType + "]";
	}
	
	
}
