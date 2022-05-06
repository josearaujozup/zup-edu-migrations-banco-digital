package com.zupedu.bancodigital.conta;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class ContaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documentoTitular;

    private String nomeTitular;

    private LocalDateTime abertura;

    private int agencia;

    private long numero;

    private BigDecimal saldo;

	public ContaEntity() {
	}
    
}
