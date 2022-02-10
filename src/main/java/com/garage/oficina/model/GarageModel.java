package com.garage.oficina.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name ="garage")
public class GarageModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String nome;
    private String email;
    private String contato;
    private String marcaDaMoto;
    private String modeloDaMoto;
    private String anoDaMoto;
    private String servico;

public GarageModel(){
}

    public GarageModel(Long id, String nome, String email, String contato, String marcaDaMoto, String modeloDaMoto, String anoDaMoto, String servico) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.contato = contato;
        this.marcaDaMoto = marcaDaMoto;
        this.modeloDaMoto = modeloDaMoto;
        this.anoDaMoto = anoDaMoto;
        this.servico = servico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getMarcaDaMoto() {
        return marcaDaMoto;
    }

    public void setMarcaDaMoto(String marcaDaMoto) {
        this.marcaDaMoto = marcaDaMoto;
    }

    public String getModeloDaMoto() {
        return modeloDaMoto;
    }

    public void setModeloDaMoto(String modeloDaMoto) {
        this.modeloDaMoto = modeloDaMoto;
    }

    public String getAnoDaMoto() {
        return anoDaMoto;
    }

    public void setAnoDaMoto(String anoDaMoto) {
        this.anoDaMoto = anoDaMoto;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
}
