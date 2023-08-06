package gg.borro.mongo.learn.mongol.repository;

import gg.borro.mongo.learn.mongol.security.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findUserByEmail(String email);
}
