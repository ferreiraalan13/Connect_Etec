package com.etecja.ConnectEtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etecja.ConnectEtec.entities.Aluno;
import com.etecja.ConnectEtec.entities.Funcionario;
import com.etecja.ConnectEtec.repositories.AlunoRepository;
import com.etecja.ConnectEtec.repositories.FuncionarioRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	public void save(Aluno aluno) {
		alunoRepository.save(aluno);
	}

}
