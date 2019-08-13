package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RSVPRepo extends MongoRepository<RSVP, String> {



}