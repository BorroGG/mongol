package gg.borro.mongo.learn.mongol.security;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;
import java.util.function.Function;

public interface JwtService {

    String extractUserEmail(String token);
    String generateToken(UserDetails userDetails);
    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);
    boolean isTokenValid(String token, UserDetails userDetails);
}
