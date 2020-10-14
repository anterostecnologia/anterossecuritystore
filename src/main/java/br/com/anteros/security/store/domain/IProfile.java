package br.com.anteros.security.store.domain;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;


public interface IProfile {
	
	@JsonIgnore
	public String getProfileId();

	@JsonIgnore
	public Set<IAction> getActionsList();

}
