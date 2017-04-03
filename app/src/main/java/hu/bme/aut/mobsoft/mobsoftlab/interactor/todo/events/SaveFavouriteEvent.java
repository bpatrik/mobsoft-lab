package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events;


import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class SaveFavouriteEvent {
	private int code;
	private Todo todos;
	private Throwable throwable;

	//<editor-fold desc="Constructors|Getters|Setters">

	public SaveFavouriteEvent() {
	}

	public SaveFavouriteEvent(int code, Todo todos, Throwable throwable) {
		this.code = code;
		this.todos = todos;
		this.throwable = throwable;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Todo getTodo() {
		return todos;
	}

	public void setTodo(Todo flight) {
		this.todos = flight;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	//</editor-fold>
}
