package tfr.APPHOME.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tfr.APPHOME.dto.LocalDTO;
import tfr.APPHOME.services.LocalService;

import java.net.URI;

@RestController
@RequestMapping(value = "/locals")
public class LocalController {


    @Autowired
    private LocalService service;


    @PostMapping
    public ResponseEntity<LocalDTO> insert (@Valid @RequestBody LocalDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
