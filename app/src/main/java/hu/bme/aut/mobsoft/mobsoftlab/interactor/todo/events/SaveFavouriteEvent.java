package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events;


import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class SaveFavouriteEvent {
	private int code;
	private Todo todo;
	private Throwable throwable;

	//<editor-fold desc="Constructors|Getters|Setters">

	public SaveFavouriteEvent() {
	}

	public SaveFavouriteEvent(int code, Todo todo, Throwable throwable) {
		this.code = code;
		this.todo = todo;
		this.throwable = throwable;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Todo getTodo() {
		return todo;
	}

	public void setTodo(Todo todo) {
		this.todo = todo;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	//</editor-fold>
}
