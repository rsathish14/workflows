package workflow.tasks;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Data
public class Task {
    @Id
    String id;
    String name;
    String assignee;

    public Task() {}

    public Task(String name, String assignee) {
        this.name = name;
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return String.format(
                "Task[name='%s', assignee='%s']",
                name, assignee);
    }

}