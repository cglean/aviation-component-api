package com.aviation.poc.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="components")
public class Component {

	@Id
	private String componentID;
	private String description;
	private String cmpySerialNo;
	private String mnfgSerialNo;
	private String classification;
	private String fleetNo;
	private String subfleetNo;
	private String ataSystemNo;
	private String tailNo;
	private String companyPartNo;
	private String mfgPartNo;
	private List<ComponentHistory> history;
	private String master;
	@DateTimeFormat(iso=ISO.DATE_TIME)
	private Date statusUpdatedDate;
	private String status;

	
}