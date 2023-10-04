package co.edu.unisabana.parcialarquitectura.service;

import co.edu.unisabana.parcialarquitectura.controller.dto.CheckpointDTO;
import co.edu.unisabana.parcialarquitectura.repository.CheckpointPort;
import co.edu.unisabana.parcialarquitectura.repository.jpa.CheckpointRepository;
import co.edu.unisabana.parcialarquitectura.service.model.Checkin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CheckpointServiceTest {

    @InjectMocks
    CheckpointService  checkpointService;

    @Mock
    private CheckpointPort checkpointPort;

    @Test
    void checkin() {
        CheckpointDTO checkpointDTO = new CheckpointDTO();
        checkpointDTO.setDayofMonth(15);
        Checkin checkin = checkpointPort.saveCheckin(checkpointDTO);
        assertEquals(15,checkin.getDayOfMonth());
        }

}