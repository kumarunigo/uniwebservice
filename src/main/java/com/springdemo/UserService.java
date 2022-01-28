package com.springdemo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	public boolean authentication(String userid,String pwd) {
		List<UsersEntity> dbRecords=ur.findByUidAndPwd(userid, pwd);
		if(dbRecords.size() > 0)
			return true;
		else
			return false;
	}
	
	public boolean register(String userid,String pwd) {
		UsersEntity ue=new UsersEntity(userid,pwd);
		ur.save(ue);
		return true;
	}
	
	public boolean delete(String userid) {
		UsersEntity ue=new UsersEntity(userid);
		ur.delete(ue);
		return true;
	}
}
