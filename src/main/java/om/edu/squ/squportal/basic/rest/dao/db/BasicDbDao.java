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
 * File Name			:	BasicDbDao.java
 * Package Name			:	om.edu.squ.squportal.basic.rest.dao.db
 * Date of creation		:	Mar 31, 2015  1:31:08 PM
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
package om.edu.squ.squportal.basic.rest.dao.db;

import om.edu.squ.squportal.basic.rest.bo.User;


/**
 * @author Bhabesh
 *
 */
public interface BasicDbDao 
{
	public User test();
	
	/**
	 * 
	 * method name  : getUser
	 * @param macAdd
	 * @return
	 * BasicDbDao
	 * return type  : User
	 * 
	 * purpose		:
	 *
	 * Date    		:	Apr 22, 2015 3:37:51 PM
	 */
	public User getUser(String macAdd);
}
