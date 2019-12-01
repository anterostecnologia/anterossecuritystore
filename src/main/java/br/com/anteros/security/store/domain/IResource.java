package br.com.anteros.security.store.domain;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

public interface IResource {

	public String getResourceId();

	public ISystem getSystem();

	public String getResourceName();
	
	public IResource addAction(IAction action);

	@JsonIgnore
	public List<IAction> getActionList();
}
