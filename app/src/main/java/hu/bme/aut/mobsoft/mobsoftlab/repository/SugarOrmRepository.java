package hu.bme.aut.mobsoft.mobsoftlab.repository;

import android.content.Context;

import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.ArrayList;
import java.util.List;

import hu.bme.aut.mobsoft.mobsoftlab.model.Todo;

public class SugarOrmRepository implements Repository {

    @Override
    public void open(Context context) {
        SugarContext.init(context);
    }

    @Override
    public void close() {
        SugarContext.terminate();
    }

    @Override
    public List<Todo> getFavourites() {
        return SugarRecord.listAll(Todo.class);
    }

    @Override
    public void saveFavourite(Todo flight) {
        SugarRecord.saveInTx(flight);
    }

    @Override
    public void updateFavourites(List<Todo> flights) {
        List<Todo> favourites = getFavourites();
        List<Todo> toUpdate = new ArrayList<>(favourites.size());
        for (Todo favourite : favourites) {
            for (Todo flight : flights) {
                if (flight.getId().equals(favourite.getId())) {
                    toUpdate.add(flight);
                }
            }
        }
        SugarRecord.saveInTx(toUpdate);
    }

    @Override
    public void removeFavourite(Todo flight) {
        SugarRecord.deleteInTx(flight);
    }

    @Override
    public boolean isInDB(Todo flight) {
        return SugarRecord.findById(Todo.class, flight.getId()) != null;
    }

}
