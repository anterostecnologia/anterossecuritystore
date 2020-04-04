package br.com.anteros.security.store.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface IAction {
	
	@JsonIgnore
	public String getActionId();

	public IResource getResource();

	@JsonIgnore
	public String getActionName();

	@JsonIgnore
	public boolean isActionActive();

	@JsonIgnore
	public void setActiveAction(boolean value);

	public String getCategory();

	public void setCategory(String category);

	
	public String getVersion();

}
