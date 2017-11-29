package example.springdata.rest.projections;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Moto.class)
public class MotoEventHandler {

    @HandleBeforeCreate
    public void handleBeforeCreate(Moto moto) {
        System.out.println("before-create: " + moto.toString());
    }

    @HandleAfterCreate
    public void handleAfterCreate(Moto moto) {
        System.out.println("after-create: " + moto.toString());
    }

    @HandleBeforeSave
    public void handleBeforeSave(Moto moto) {
        System.out.println("before-save: " + moto.toString());
    }

    @HandleAfterSave
    public void handleAfterSave(Moto moto) {
        System.out.println("after-save: " + moto.toString());
    }

    @HandleBeforeDelete
    public void handleMotoDelete(Moto moto) {
        System.out.println("before-delete: " + moto.toString());
    }

    @HandleAfterDelete
    public void handleAfterDelete(Moto moto) {
        System.out.println("after-delete: " + moto.toString());
    }

}
