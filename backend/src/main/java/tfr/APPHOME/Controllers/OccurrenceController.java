package tfr.APPHOME.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tfr.APPHOME.dto.OccurrenceDTO;
import tfr.APPHOME.dto.OccurrenceDTOid;;
import tfr.APPHOME.services.OccurrenceService;

import java.net.URI;

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

    @PostMapping
    public ResponseEntity<OccurrenceDTO> insert (@RequestBody OccurrenceDTO dto){
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    //@PostMapping
    public ResponseEntity<OccurrenceDTOid> insert (@RequestBody OccurrenceDTOid dto){
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
