package com.etecja.ConnectEtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.ConnectEtec.entities.Funcionario;
import com.etecja.ConnectEtec.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

	public void save(Funcionario curso) {
		funcionarioRepository.save(curso);
	}

}
