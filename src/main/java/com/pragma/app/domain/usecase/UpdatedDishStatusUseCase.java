package com.pragma.app.domain.usecase;

import com.pragma.app.domain.exception.UpdateDishModelActiveException;
import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.api.IDishModelActiveServicePort;

public class UpdatedDishStatusUseCase implements IDishModelActiveServicePort{

    private final IDishModelActiveServicePort dishModelActivePersistence;

    public UpdateDishStatusUseCase(IDishModelActiveServicePort dishModelPersistence) {
        this.dishModelActivePersistence = dishModelPersistence;
    }

    public void updateDishStatus(DishModel dishModel, boolean newStatusDishModelActive, boolean userIsAdmin) {
        if (userIsAdmin) {
            dishModel.setActive(newStatusDishModelActive);
            throw new UpdateDishModelActiveException("The status of the dish has been changed from active to deactivated");
        } else {
            throw new UpdateDishModelActiveException("You cannot update the status of the dish if you are not an administrator user.");
        }

    }

    @Override
    public DishModel saveUpdateDishModelStatus(DishModel dishModel) {
        return null;
    }

    public IDishModelActiveServicePort getDishModelActivePersistence() {
        return dishModelActivePersistence;
    }
}
