package br.com.techchallenge.loginUser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.techchallenge.loginUser.entity.PerfilUsuarioEntity;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long>{

}
