package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events;

import java.util.List;

import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class GetFavouritesEvent {
	private int code;
	private List<Todo> todos;
	private Throwable throwable;

	//<editor-fold desc="Constructors|Getters|Setters">

	public GetFavouritesEvent() {
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

//</editor-fold>
}
