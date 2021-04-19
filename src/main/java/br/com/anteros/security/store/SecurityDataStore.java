package br.com.anteros.security.store;

import java.util.Collection;
import java.util.List;

import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2RefreshToken;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.approval.Approval;
import org.springframework.security.oauth2.provider.token.AuthenticationKeyGenerator;

import br.com.anteros.security.store.domain.IAction;
import br.com.anteros.security.store.domain.IResource;
import br.com.anteros.security.store.domain.ISystem;
import br.com.anteros.security.store.domain.IUser;

public interface SecurityDataStore {

	public IResource getResourceByName(String systemName, String resourceName);

	public ISystem getSystemByName(String systemName);

	public ISystem addSystem(String systemName, String description) ;

	public IResource addResource(ISystem system, String resourceName, String description) throws Exception;

	public IAction addAction(ISystem system, IResource resource, String actionName, String category, String description,
			String version) throws Exception;

	public IAction saveAction(IAction action) throws Exception;

	public IResource refreshResource(IResource resource) throws Exception;

	public void removeActionByAllUsers(IAction act) throws Exception;

	public IUser getUserByUserName(String username);
	
	public IUser getUserByUserNameWithPassword(String username);

	public void addApprovals(Collection<Approval> approvals);

	public void revokeApprovals(Collection<Approval> approvals);

	public Collection<Approval> getApprovals(String userId, String clientId);

	public void setHandleRevocationsAsExpiry(boolean handleRevocationsAsExpiry);

	public void storeAccessToken(OAuth2AccessToken token, OAuth2Authentication authentication,AuthenticationKeyGenerator authenticationKeyGenerator);

	public OAuth2Authentication readAuthentication(final String token);

	public OAuth2AccessToken readAccessToken(String tokenValue);

	public void removeAccessToken(OAuth2AccessToken token);

	public void storeRefreshToken(OAuth2RefreshToken refreshToken, OAuth2Authentication authentication);

	public OAuth2RefreshToken readRefreshToken(String tokenValue);

	public OAuth2Authentication readAuthenticationForRefreshToken(OAuth2RefreshToken token);

	public void removeRefreshToken(OAuth2RefreshToken token);

	public void removeAccessTokenUsingRefreshToken(OAuth2RefreshToken refreshToken);

	public OAuth2AccessToken getAccessToken(OAuth2Authentication authentication, AuthenticationKeyGenerator authenticationKeyGenerator);

	public Collection<OAuth2AccessToken> findTokensByClientIdAndUserName(String clientId, String userName);

	public Collection<OAuth2AccessToken> findTokensByClientId(String clientId);

	public void addClientDetails(ClientDetails clientDetails);

	public void updateClientDetails(ClientDetails clientDetails);

	public void updateClientSecret(String clientId, String secret);

	public void removeClientDetails(String clientId);

	public List<ClientDetails> listClientDetails();

	public ClientDetails loadClientByClientId(String clientId);
	
	public void initializeCurrentSession() throws Exception;
	
	public void clearCurrentSession() throws Exception;



}
