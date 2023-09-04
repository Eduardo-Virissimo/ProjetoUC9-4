package com.sa62.service;


import java.util.List;

import com.sa62.models.Atividade;


public interface AtividadeService {
	public List<Atividade> listarAtividades();
	
	public void apagarAtividade(Long id);
	
	public Atividade salvarAtividade(Atividade atividade);
	
	public Atividade consultarAtividadeId(Long id);
	
	public Atividade atualizarAtividade(Atividade atividade);
}