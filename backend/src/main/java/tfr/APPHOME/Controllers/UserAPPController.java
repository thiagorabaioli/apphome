package tfr.APPHOME.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import tfr.APPHOME.dto.UserAPPDTO;
import tfr.APPHOME.services.UserAPPService;

import java.net.URI;

@RestController
@RequestMapping(name = "/usersapp")
public class UserAPPController {

    @Autowired
    private UserAPPService service;

    public ResponseEntity<UserAPPDTO> insert (@RequestBody UserAPPDTO dto){
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
