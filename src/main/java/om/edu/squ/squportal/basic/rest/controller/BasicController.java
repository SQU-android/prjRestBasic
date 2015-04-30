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
 * File Name			:	BasicController.java
 * Package Name			:	om.edu.squ.squportal.basic.rest.controller
 * Date of creation		:	Mar 31, 2015  2:08:18 PM
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
package om.edu.squ.squportal.basic.rest.controller;

import om.edu.squ.squportal.basic.rest.bo.User;
import om.edu.squ.squportal.basic.rest.dao.service.BasicServiceDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Bhabesh
 *
 */
@Controller
public class BasicController 
{
	@Autowired
	BasicServiceDao basicServiceDao;

	@RequestMapping("/macadd/{macAddress}")
	@ResponseBody
	public User getUser(@PathVariable("macAddress") String macAddress )
	{
		return basicServiceDao.getUser(macAddress);
	}
	

	
	
}
