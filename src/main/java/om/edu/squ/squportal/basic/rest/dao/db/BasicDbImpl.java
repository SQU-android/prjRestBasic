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
 * File Name			:	BasicDbImpl.java
 * Package Name			:	om.edu.squ.squportal.basic.rest.dao.db
 * Date of creation		:	Mar 31, 2015  1:27:28 PM
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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;








import om.edu.squ.squportal.basic.rest.bo.User;
import om.edu.squ.squportal.basic.rest.utility.Constants;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


/**
 * @author Bhabesh
 *
 */
public class BasicDbImpl implements BasicDbDao
{
	private NamedParameterJdbcTemplate	namedParameterJdbcTemplate;
	
	/**
	 * Setter method : setNamedParameterJdbcTemplate
	 * @param namedParameterJdbcTemplate the namedParameterJdbcTemplate to set
	 * 
	 * Date          : Mar 31, 2015 2:20:41 PM
	 */
	public void setNamedParameterJdbcTemplate(
		NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
	
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	/**
	 * Setter method : setQueryProps
	 * @param queryProps the queryProps to set
	 * 
	 * Date          : Mar 31, 2015 2:20:41 PM
	 */
	public void setQueryProps(Properties queryProps) {
	
		this.queryProps = queryProps;
	}
	private	Properties					queryProps;
	
	
	public User test()
	{
		User user	=	new User();
		user.setUserId("0008957");
		user.setUserName("Bhabesh");
		user.setUserType("Emp");
		
		return user;
	}
	
	/**
	 * 
	 * method name  : getUser
	 * @param macAdd
	 * @return
	 * BasicDbImpl
	 * return type  : User
	 * 
	 * purpose		:
	 *
	 * Date    		:	Apr 22, 2015 3:37:33 PM
	 */
	public User getUser(String macAdd)
	{
		String SQL_USER =	queryProps.getProperty(Constants.PROPERTY_USER_DETAIL);
		User 	user	=	null;
		
		RowMapper<User> mapper = new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum)
				throws SQLException {
					User user	=	new User();
					user.setUserId(rs.getString(Constants.CONST_SQL_COLUMN_USER_ID));
					user.setUserName(rs.getString(Constants.CONST_SQL_COLUMN_USER_NAME));
					user.setUserType(rs.getString(Constants.CONST_SQL_COLUMN_USER_TYPE));
				return user;
			}
		};
		
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("paramMacAdd", macAdd);
		
		user	=	namedParameterJdbcTemplate.queryForObject(SQL_USER, paramMap, mapper);
		
		
		return user;
	}
}
