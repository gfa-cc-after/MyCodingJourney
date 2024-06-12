package ToDoApplication.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ToDo {
    public Long id;
    public String title;
    public boolean urgent = false;
    public boolean done = false;
}
