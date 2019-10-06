package com.denizturkmen.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;

@Entity
@Table(name = "Account_Table")
public class Account {

	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name = "id")
	private Long id;
	
	@Column(name="credit_amt")
	private Double credit;
	
	@Column(name="rate_amt")
	private Double rate;
	
	//column isimleri çarpıyorsun
	@Formula(value = "credit_amt*rate_amt")
	private Double interest;
	
	public void setId(Long id) {
		this.id = id;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}
}