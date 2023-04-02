package br.ailtonbsj.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Apps", "Study"));
		todos.add(new Todo("Learn Spring MVC", "Study"));
		todos.add(new Todo("Learn Spring REST", "Study"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}

	public void AddTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void DeleteTodo(Todo todo) {
		todos.remove(todo);
	}
	
	public void EditTodo(Todo oldTodo, Todo newTodo) {
		int index = todos.indexOf(oldTodo);
		todos.set(index, newTodo);
	}
}
