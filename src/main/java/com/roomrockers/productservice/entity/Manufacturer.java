package com.roomrockers.productservice.entity;



import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
@Table(name ="manufacturer_tbl", schema = "product_schema")
public class Manufacturer {

	@Id
	private UUID uid;
	private String name;
	private String licenseNo;
	
	@OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY)
	@JsonManagedReference("manufacturer_tbl-address_tbl")
	private List<Address> address;
	
	@OneToMany(mappedBy = "manufacturer", fetch = FetchType.LAZY)
	@JsonManagedReference("manufacturer_tbl-contact_info_tbl")
	private List<ContactInfo> contactInfo;
}
