package br.ailtonbsj.todo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
	private String name;
	private String category;
}
