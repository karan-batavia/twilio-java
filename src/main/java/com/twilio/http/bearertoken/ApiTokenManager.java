package com.twilio.http.bearertoken;

import com.twilio.exception.ApiException;
import com.twilio.rest.previewiam.v1.Token;
import com.twilio.rest.previewiam.v1.TokenCreator;

public class ApiTokenManager implements TokenManager {

    private final String grantType;
    private final String clientId;
    private final String clientSecret;
    private String code;
    private String redirectUri;
    private String audience;
    private String refreshToken;
    private String scope;
    
    @Override
    public String fetchAccessToken() {
        TokenCreator tokenCreator = Token.creator(grantType, clientId).setClientSecret(clientSecret); // TODO: Change this
        if (this.code != null) tokenCreator.setCode(code);
        if (this.redirectUri != null) tokenCreator.setRedirectUri(redirectUri);
        if (this.audience != null) tokenCreator.setAudience(audience);
        if (this.refreshToken != null) tokenCreator.setRefreshToken(refreshToken);
        if (this.scope != null) tokenCreator.setScope(scope);
        Token token;
        try {
            token = tokenCreator.create();
            if(token == null || token.getAccessToken() == null){
                throw new ApiException("Token creation failed");
            }
        } catch(Exception e){
            throw new ApiException("Token creation failed");
        }
        return token.getAccessToken();
    }

    public ApiTokenManager(String grantType, String clientId, String clientSecret){
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public ApiTokenManager(String grantType, String clientId, String clientSecret, String code, String redirectUri, String audience, String refreshToken, String scope){
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.code = code;
        this.redirectUri = redirectUri;
        this.audience = audience;
        this.refreshToken = refreshToken;
        this.scope = scope;
    }
}
