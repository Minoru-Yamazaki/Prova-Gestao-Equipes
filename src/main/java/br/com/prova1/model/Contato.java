package br.com.prova1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_contato")
public class Contato {
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "con_nome")
	private String nome;
	
	@Column(name = "con_email")
	private String email;
	
	@Column(name = "con_telefone")
	private String telefone;

}
