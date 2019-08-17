package RSVPAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class RSVPController {

    @Autowired
    private RSVPRepo repository;

    @CrossOrigin(origins = "http://rosolynwedding.com:3000")
    @PostMapping(path= "/",  headers = {
            "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String index(@RequestBody RSVP rsvp) {

        System.out.println("Received RSVP details: " + rsvp);
        repository.save(rsvp);
        return rsvp.getRsvpname();
    }

}