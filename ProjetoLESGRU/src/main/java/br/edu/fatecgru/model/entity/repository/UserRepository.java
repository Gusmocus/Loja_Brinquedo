package br.edu.fatecgru.model.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fatecgru.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
