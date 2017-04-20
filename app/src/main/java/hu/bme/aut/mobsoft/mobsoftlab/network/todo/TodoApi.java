package hu.bme.aut.mobsoft.mobsoftlab.network.todo;

import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;


import retrofit2.Call;
import retrofit2.http.*;


public interface TodoApi {
  
  /**
   * Create a new instance of the model and persist it into the data source.
   * 
   * @param data Model instance data
   * @return Call<Void>
   */
  
  @POST("Todo")
  Call<Void> todoCreate(
    @Body Todo data
  );

  
}
