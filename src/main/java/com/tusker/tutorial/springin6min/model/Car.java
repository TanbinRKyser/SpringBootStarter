package com.tusker.tutorial.springin6min.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public
class Car{
	@Id
	@GeneratedValue
	private Long id;
	private String name;

	public Car( String name){
		this.name = name;
	}
}
