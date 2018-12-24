package workflow.persons;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
@Data
public class Person {
    @Id
    String id;
    String userid;
    String name;

    public Person() {}

    public Person(String userid, String name) {
        this.userid = userid;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Person[userid='%s', name='%s']",
                userid, name);
    }

}