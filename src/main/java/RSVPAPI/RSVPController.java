package RSVPAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@RestController

public class RSVPController {
    @Value("${spring.mail.username}")
    String springMailUsername;


    @Autowired
    private RSVPRepo repository;

    @Autowired
    private JavaMailSender javaMailSender;

    @CrossOrigin(origins = {"http://rosolynwedding.com:3000","http://www.rosolynwedding.com:3000","http://www.rosolynwedding.com","http://rosolynwedding.com"})

    @PostMapping(path= "/",  headers = {
            "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String index(@RequestBody RSVP rsvp) {

        System.out.println("Received RSVP details: " + rsvp);
        repository.save(rsvp);
        sendEmail(rsvp);
        return rsvp.getRsvpname();
    }



    void sendEmail(RSVP rsvp) {

        System.out.println(springMailUsername);
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("rbrsmith@gmail.com", "ctspeight@hotmail.com");

        msg.setSubject("New RSVP from " + rsvp.getRsvpname());
        msg.setText(rsvp.toString());

        javaMailSender.send(msg);

    }



}
