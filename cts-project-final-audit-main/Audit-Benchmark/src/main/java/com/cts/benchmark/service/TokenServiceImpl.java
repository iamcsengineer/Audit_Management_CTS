package com.cts.benchmark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.benchmark.exception.FeignProxyException;
import com.cts.benchmark.feignclient.AuthClient;
import com.cts.benchmark.pojo.AuthResponse;

import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
/**
   This class is implementing {@link TokenService}.
 * The method of this class is used in other classes to validate token received.
 * 
 * @see AuthClient
 *
 */
@Service
public class TokenServiceImpl implements TokenService {

	/**
	 * Interface interacting with Auth microservice
	 */
	@Autowired
	private AuthClient authClient;
	@Autowired
	Environment env;
	/**
	 * @param token
	 * @return boolean this method will check the token validity by communicating
	 *         with auth client.
	 */
	public Boolean checkTokenValidity(String token)  {

		try {
			AuthResponse authResponse = authClient.getValidity(token).getBody();
			if(authResponse==null) throw new FeignProxyException();

			
			return authResponse.isValid();
		} catch (FeignProxyException fe) {
			
			
			return false;
		}catch(FeignException e) {
			
			return false;
		}
		
	}

}
