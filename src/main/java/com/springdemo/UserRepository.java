package com.springdemo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {
	public List<UsersEntity> findByUidAndPwd(String users,String password);
}