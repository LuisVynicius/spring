package com.educandoweb.coursedois.entities;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="tb_order")
public class Order implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Instant moment;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private User client;
	public Order() {}
	public Order(Long id, Instant moment, User client) {
		this.id = id;
		this.moment = moment;
		this.client = client;
	}
	
}
