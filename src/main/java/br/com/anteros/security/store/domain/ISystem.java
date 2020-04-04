package br.com.anteros.security.store.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface ISystem {

	@JsonIgnore
	public String getSystemId();

	@JsonIgnore
	public String getSystemName();
}
