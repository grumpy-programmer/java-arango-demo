package io.grumpyprogrammer.javaarangodemo;

import com.arangodb.springframework.repository.ArangoRepository;

public interface TestRepository extends ArangoRepository<Test, String> {
}
