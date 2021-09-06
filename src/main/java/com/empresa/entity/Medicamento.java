package com.empresa.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "medicamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedicamento;
	private String nombre;
	@Column(precision = 10, scale = 2)
	private BigDecimal precio;
	private int stock;
	private String laboratorio;
	
}