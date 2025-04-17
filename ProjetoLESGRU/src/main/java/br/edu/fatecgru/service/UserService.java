package br.edu.fatecgru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import br.edu.fatecgru.model.entity.Brinquedo;
import br.edu.fatecgru.model.entity.User;
import br.edu.fatecgru.model.entity.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> listAll(){
		return userRepository.findAll();
	}
	
	public User getByCode(int id) {
		return userRepository.findById(id).get();
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
	
}
