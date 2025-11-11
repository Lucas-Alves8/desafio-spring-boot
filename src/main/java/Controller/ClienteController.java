package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClienteService;

@RestController
@RequestMapping
public class ClienteController {

    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }
    @GetMapping
    public ResponseEntity<List<Client>> listAll() {
        List<Client> listClients = this.clientService.listAll();
        return new ResponseEntity<>(listClients, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Client> create(@RequestBody @Valid ClientDTO clientDTO) {
        Client client = clientService.create(clientDTO);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Client> getById(@PathVariable long id) {
        Client client = this.clientService.getById(id);
        if (client != null){
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Client> update(@PathVariable long id, @RequestBody @Valid ClientDTO clientDTO) {
        Client client = clientService.update(id, clientDTO);
        if (client != null) {
            return new ResponseEntity<>(client, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);


        @DeleteMapping("/{id}")
        public ResponseEntity<?> delete ( @PathVariable long id){
            if (clientService.delete(id)) {
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
