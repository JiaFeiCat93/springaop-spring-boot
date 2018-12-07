package com.qetch.springaop.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private String db_source;
	
}
