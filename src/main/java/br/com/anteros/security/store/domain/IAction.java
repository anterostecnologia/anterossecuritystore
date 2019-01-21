package br.com.anteros.security.store.domain;

public interface IAction {
	
	public String getId();

	public IResource getResource();

	public String getActionName();

	public boolean isActive();

	public void setActive(boolean value);

	public String getCategory();

	public void setCategory(String category);

	public String getVersion();

}
