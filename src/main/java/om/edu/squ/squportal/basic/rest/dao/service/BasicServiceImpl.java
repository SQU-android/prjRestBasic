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
 * File Name			:	BasicServiceImpl.java
 * Package Name			:	om.edu.squ.squportal.basic.rest.dao.service
 * Date of creation		:	Mar 31, 2015  2:00:40 PM
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
package om.edu.squ.squportal.basic.rest.dao.service;

import om.edu.squ.squportal.basic.rest.bo.User;
import om.edu.squ.squportal.basic.rest.dao.db.BasicDbDao;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author Bhabesh
 *
 */
public class BasicServiceImpl implements BasicServiceDao
{
	@Autowired
	BasicDbDao basicDbDao;
	
	public User test()
	{
		return basicDbDao.test();
	}
	
	/**
	 * 
	 * method name  : getUser
	 * @param macAdd
	 * @return
	 * BasicServiceImpl
	 * return type  : User
	 * 
	 * purpose		:
	 *
	 * Date    		:	Apr 22, 2015 3:38:04 PM
	 */
	public User getUser(String macAdd)
	{
		return basicDbDao.getUser(macAdd);
	}
}
