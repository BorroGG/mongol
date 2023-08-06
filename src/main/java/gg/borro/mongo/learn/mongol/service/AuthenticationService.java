package gg.borro.mongo.learn.mongol.service;

import gg.borro.mongo.learn.mongol.security.AuthenticationRequest;
import gg.borro.mongo.learn.mongol.security.AuthenticationResponse;
import gg.borro.mongo.learn.mongol.security.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
