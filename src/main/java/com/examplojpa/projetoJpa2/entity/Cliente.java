package com.examplojpa.projetoJpa2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity 
	@Table(name = "cliente")
	public class Cliente {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		 
		@Column(name = "cliente")
		private String cliente;
		
		@Column(name = "fone")
		private String fone;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCliente() {
			return cliente;
		}

		public void setCliente(String cliente) {
			this.cliente = cliente;
		}

		public String getFone() {
			return fone;
		}

		public void setFone(String fone) {
			this.fone = fone;
		}
		
	}

