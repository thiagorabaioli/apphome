package tfr.APPHOME.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tfr.APPHOME.dto.UserAPPDTO;
import tfr.APPHOME.services.UserAPPService;
import java.net.URI;


@RestController
@RequestMapping(value = "/userapp")
public class UserAPPController {

    @Autowired
    private UserAPPService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserAPPDTO> findById(@PathVariable Long id){
        UserAPPDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<UserAPPDTO>> findPage(Pageable pageable){
        Page<UserAPPDTO> dto = service.findPage(pageable);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<UserAPPDTO> insert (@Valid @RequestBody UserAPPDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserAPPDTO> update ( @PathVariable Long id, @Valid @RequestBody UserAPPDTO dto){
        dto = service.update(id, dto);
        return ResponseEntity.ok(dto);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }



}
