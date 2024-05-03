package com.etecja.ConnectEtec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etecja.ConnectEtec.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
