package org.matg0mes.core.trainer.ports;

import org.matg0mes.core.trainer.models.Trainer;

public interface IFindTrainerPort {

    Trainer findTrainerById(Long id);

}
