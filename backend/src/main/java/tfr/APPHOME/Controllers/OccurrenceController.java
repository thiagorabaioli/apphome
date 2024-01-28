package tfr.APPHOME.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tfr.APPHOME.dto.OccurrenceDTO;
import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.services.OccurrenceService;

@RestController
@RequestMapping(value = "/occurrences")
public class OccurrenceController {

    @Autowired
    private OccurrenceService service;

    @GetMapping
    public ResponseEntity<Page<OccurrenceDTO>> findPage(Pageable pageable){
        Page<OccurrenceDTO> dto = service.findPage(pageable);
        return ResponseEntity.ok(dto);
    }
}
