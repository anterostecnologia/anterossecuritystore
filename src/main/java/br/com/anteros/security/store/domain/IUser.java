package br.com.anteros.security.store.domain;

import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;

public interface IUser {

	public String getUserId();

	public String getLogin();

	public String getPassword();
	
	public String getAvatar();

	public boolean isPasswordNeverExpire();

	public boolean isInactiveAccount();

	public boolean isBlockedAccount();

	public boolean isAdministrator();

	@JsonIgnore
	public Set<IAction> getActionList();

	public IProfile getUserProfile();
}
