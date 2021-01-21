package com.internousdev.login1.action;

import java.sql.SQLException;

import com.internousdev.login1.dao.Login1DAO;
import com.internousdev.login1.dto.Login1DTO;
import com.opensymphony.xwork2.ActionSupport;

public class Login1Action extends ActionSupport {
		private String name;
		private String password;


		public String execute()throws SQLException{
			String ret = ERROR;

			Login1DAO dao = new Login1DAO();
			Login1DTO dto = new Login1DTO();

			dto = dao.select(name,password);
			if(name.equals(dto.getName())) {
					if(password.equals(dto.getPassword())) {
							ret = SUCCESS;
					}
			}
		return ret;
		}
		public String getName() {
				return name;
		}
		public void setName(String name) {
				this.name = name;
		}
		public String getPassword() {
				return password;
		}
		public void setPassword(String password) {
				this.password = password;
		}
}


