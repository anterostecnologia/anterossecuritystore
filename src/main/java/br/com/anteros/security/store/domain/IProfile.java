package br.com.anteros.security.store.domain;

import java.util.Set;

public interface IProfile {
	
	public String getProfileId();

	public Set<IAction> getActionsList();

}
