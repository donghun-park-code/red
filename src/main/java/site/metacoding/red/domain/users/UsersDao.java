package site.metacoding.red.domain.users;

import java.util.List;

import site.metacoding.red.web.dto.Request.users.JoinDto;

public interface UsersDao {
	public Integer insert(JoinDto joinDto);
	public Users findById(Integer id);
	public List<Users> findAll(Users user);
	public List<Users> findAll();
	public void delete(Integer id);
	public void Update(Users users);
	
}
