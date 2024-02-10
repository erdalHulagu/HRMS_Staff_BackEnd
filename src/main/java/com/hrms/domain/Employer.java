package com.hrms.domain;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_employer")
public class Employer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	@NotBlank
	@NotNull
	private String companyName;
	
	@Email(message = "Please provide a email adress")
	@Column(nullable = false)
	@NotBlank
	@NotNull
	private String email;
	
	@Column(nullable = false)
	@NotBlank
	@NotNull
	private String password;
	
	@Column(nullable = false)
	@NotBlank
	@NotNull
	private String reTypePassword;
	
	@Column(nullable = false)
	@NotBlank
	@NotNull
	private String phone;
	
	@Column(nullable = false,name = "companys_webside")
	@NotBlank
	@NotNull
	private String webside;
	
	@OneToMany(mappedBy = "employer")
	private List<Job> jobs;
	
	@OneToMany(targetEntity = JobSeeker.class, cascade = CascadeType.ALL)
	private List<JobSeeker> jobSeeker;
	
	
	private boolean built;
	   
	
	
	
	
	
	

}
