package com.faculdade.apitarefas.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String titulo;
    
    @Column(name = "data_entrega", nullable = false)
    private LocalDate dataEntrega;
    
    @Column(nullable = false)
    private String responsavel;
    
    @Column(nullable = false)
    private Boolean feito = false;
    
    public Tarefa() {}
    
    public Tarefa(String titulo, LocalDate dataEntrega, String responsavel) {
        this.titulo = titulo;
        this.dataEntrega = dataEntrega;
        this.responsavel = responsavel;
        this.feito = false;
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public Boolean getFeito() { return feito; }
    public void setFeito(Boolean feito) { this.feito = feito; }
    
    public LocalDate getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(LocalDate dataEntrega) { this.dataEntrega = dataEntrega; }
    
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}