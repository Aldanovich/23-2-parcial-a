package co.edu.unisabana.parcialarquitectura.repository;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.service.model.Checkin;

public interface CheckpointPort {

  Checkin saveCheckin(CheckpointDTO checkin);

}