/**
 *
 */
package com.eunimart.webapp.service;

import java.sql.SQLException;

/**
 * @author CENTAUR
 *
 */
public interface UserService
{
		public boolean isValidUser(String username, String password) throws SQLException;
}
