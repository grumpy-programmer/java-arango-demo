package io.grumpyprogrammer.javaarangodemo;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@AllArgsConstructor
class TestController {

    private final TestRepository repository;

    @GetMapping(path = "/tests")
    Iterable<Test> getAll() {
        return repository.findAll();
    }

    @GetMapping(path = "/tests/{id}")
    Test getById(@PathVariable String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
