package org.matg0mes.core.trainer.usecases;

import org.matg0mes.core.trainer.models.Trainer;

public interface IFindTrainerUseCase {

    Trainer execute(Long id);

}
