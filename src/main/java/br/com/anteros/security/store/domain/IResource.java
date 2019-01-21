package br.com.anteros.security.store.domain;

import java.util.List;

public interface IResource {

	public String getId();

	public ISystem getSystem();

	public String getResourceName();
	
	public IResource addAction(IAction action);

	public List<IAction> getActionList();
}
