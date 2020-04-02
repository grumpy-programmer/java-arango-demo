package io.grumpyprogrammer.javaarangodemo;

import com.arangodb.springframework.annotation.ArangoId;
import com.arangodb.springframework.annotation.Document;
import lombok.Data;

@Data
@Document
class Test {
    @ArangoId
    private String id;
}
