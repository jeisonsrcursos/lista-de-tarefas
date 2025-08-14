/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jsr.tarefas.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author jeison
 */
public class Tarefa {
    
    private Long id;
    private String titulo;
    private String descricao;
    private String local;
    private LocalDateTime dataCriacao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
    public Tarefa() {
        dataCriacao = LocalDateTime.now();
    }

    public Tarefa(String titulo, String descricao, String local, LocalDate dataInicio, LocalDate dataFim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.dataCriacao = LocalDateTime.now();
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public LocalDate getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the dataCriacao
     */
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        String tarefa = "ID: " + id
                + "\nTitulo: " + titulo
                + "\nDescrição: " + descricao
                + "\nLocal: " + local
                + "\nData de Criação: " + dataCriacao.toString()
                + "\nData de início: " + dataInicio.toString()
                + "\nData de término: " + dataFim.toString();
        return tarefa;
    }
    
    
}
