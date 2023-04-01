package br.ailtonbsj.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Web Apps"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring REST"));
	}
	
	public List<Todo> retrieveTodos() {
		return todos;
	}
}
