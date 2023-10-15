package com.roomrockers.productservice.entity;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name ="address_tbl", schema = "product_schema")
public class Address {

	@Id
	private UUID uid;
	private String Address1;
	private String Address2;
	private String Address3;
	private String Address4;
	private String Address5;
	private String Address6;
	private String zipcode;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference("address_tbl-manufacturer_tbl")
	@JoinColumn(name = "manufacturer_uid")
	private Manufacturer manufacturer;
}
