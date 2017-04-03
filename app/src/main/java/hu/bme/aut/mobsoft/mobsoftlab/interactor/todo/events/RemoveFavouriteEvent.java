package hu.bme.aut.mobsoft.mobsoftlab.interactor.todo.events;
 
import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class RemoveFavouriteEvent {
	private int code;
	private Todo todos;
	private Throwable throwable;

	//<editor-fold desc="Constructors|Getters|Setters">

	public RemoveFavouriteEvent() {
	}

	public RemoveFavouriteEvent(int code, Todo todos, Throwable throwable) {
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

	public Todo getTodos() {
		return todos;
	}

	public void setTodos(Todo todos) {
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
