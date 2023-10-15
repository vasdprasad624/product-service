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
@Table(name ="contact_info_tbl", schema = "product_schema")
public class ContactInfo {

	@Id
	private UUID uid;
	private String phone1;
	private String phone2;
	private String phone3;
	private String email1;
	private String email2;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference("contact_info_tbl-manufacturer_tbl")
	@JoinColumn(name = "manufacturer_uid")
	private Manufacturer manufacturer;
}
