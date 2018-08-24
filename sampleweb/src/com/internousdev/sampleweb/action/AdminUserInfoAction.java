package com.internousdev.sampleweb.action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sampleweb.dao.UserInfoDAO;
import com.internousdev.sampleweb.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class AdminUserInfoAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;
	private List<UserInfoDTO> userInfoDtoList = new ArrayList<UserInfoDTO>();
	public String execute(){


		//全カート情報を取得します
		UserInfoDAO userInfoDao = new UserInfoDAO();
		userInfoDtoList = userInfoDao.getUserInfoDtoListByAdmin();
		Iterator<UserInfoDTO> iterator = userInfoDtoList.iterator();
		if(!(iterator.hasNext())){
			userInfoDtoList = null;
		}
		session.put("userInfoDtoList", userInfoDtoList);

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return session;
	}
}