package org.matg0mes.core.trainer.usecases.impl;

import org.matg0mes.core.trainer.models.Trainer;
import org.matg0mes.core.trainer.ports.IFindTrainerPort;
import org.matg0mes.core.trainer.usecases.IFindTrainerUseCase;

public class FindTrainerUseCase implements IFindTrainerUseCase {

    IFindTrainerPort iFindTrainerPort;

    public FindTrainerUseCase(IFindTrainerPort iFindTrainerPort) {
        this.iFindTrainerPort = iFindTrainerPort;
    }

    @Override
    public Trainer execute(Long id) {
        return iFindTrainerPort.findTrainerById(id);
    }

}
