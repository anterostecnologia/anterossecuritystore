package br.com.anteros.security.store.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "getActionList", "addAction","getResourceId","getResourceName" })
public interface IResource {

	@JsonIgnore
	public String getResourceId();

	@JsonIgnore
	public ISystem getSystem();

	@JsonIgnore
	public String getResourceName();
	
	@JsonIgnore
	public IResource addAction(IAction action);

	@JsonIgnore
	public List<IAction> getActionList();
}
