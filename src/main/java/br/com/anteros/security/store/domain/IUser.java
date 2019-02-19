package br.com.anteros.security.store.domain;

import java.util.Set;

public interface IUser {

	public String getId();

	public String getLogin();

	public String getPassword();
	
	public String getAvatar();

	public boolean isPasswordNeverExpire();

	public boolean isInactiveAccount();

	public boolean isBlockedAccount();

	public boolean isAdministrator();

	public Set<IAction> getActionList();

	public IProfile getUserProfile();
}
