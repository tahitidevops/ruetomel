package pf.devops.ruetomel.services;

import org.keycloak.adapters.OidcKeycloakAccount;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.keycloak.representations.IDToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserService
{
    public String getFirstname()
    {
        return getIdToken().getGivenName();
    }

    public IDToken getIdToken()
    {
        Object auth = SecurityContextHolder.getContext().getAuthentication();

        if ( auth instanceof KeycloakAuthenticationToken)
        {
            KeycloakAuthenticationToken token   = (KeycloakAuthenticationToken)auth;
            OidcKeycloakAccount account         = token.getAccount();

            return account.getKeycloakSecurityContext().getIdToken();
        }
        else
        {
            return null;
        }
    }

}
