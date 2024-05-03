package com.etecja.ConnectEtec.resources;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.etecja.ConnectEtec.entities.Aluno;
import com.etecja.ConnectEtec.entities.Funcionario;
import com.etecja.ConnectEtec.service.AlunoService;
import com.etecja.ConnectEtec.service.FuncionarioService;


@Controller
public class ConnectEtecResource {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Autowired
	private FuncionarioService cursoService;
	
	@Autowired
	private AlunoService alunoService;

	// Endpoints

	@GetMapping("/cursos")
	public String findAll(Model model) {
		return "sucesso";
	}

	@GetMapping("/cadastro")
	public String exibirFormularioCadastro(Model model) {
		model.addAttribute("curso", new Funcionario());
		return "cadastro-funcionario";
	}

	@PostMapping("/save")
	public String salvarCurso(@ModelAttribute("curso") Funcionario curso) {
		cursoService.save(curso);
		return "redirect:/cursos";
	}
	
	@GetMapping("/cadastroAluno")
	public String exibirFormularioCadastroAluno(Model model) {
		model.addAttribute("curso", new Aluno());
		return "cadastro-aluno";
	}

	@PostMapping("/saveAluno")
	public String salvarCurso1(@ModelAttribute("aluno") Aluno aluno) {
		alunoService.save(aluno);
		return "redirect:/cursos";
	}
	
	@GetMapping("/alunos")
	public String findAllAlunos(Model model) {
	    List<Aluno> alunos = alunoService.findAll();
	    model.addAttribute("alunos", alunos);
	    return "listaAlunos";
	}
	
	@GetMapping("/funcionarios")
	public String findAllFuncionarios(Model model) {
	    List<Funcionario> funcionarios = cursoService.findAll();
	    model.addAttribute("funcionarios", funcionarios);
	    return "listaFuncionarios";
	}
	
}
