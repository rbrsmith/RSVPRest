package RSVPAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("RSVP")
public class RSVP {

    @Id
    public String id;

    @JsonProperty("rsvpname")
    private String rsvpname;
    @JsonProperty("joiningfor")
    private String joiningfor;
    @JsonProperty("accomadation")
    private String accomadation;

    public RSVP(String rsvpname, String joiningfor, String accomadation){
        this.rsvpname = rsvpname;
        this.joiningfor = joiningfor;
        this.accomadation = accomadation;
    }

    public void setRsvpname(String rsvpname) {
        this.rsvpname = rsvpname;
    }

    public String getRsvpname() {
        return rsvpname;
    }

    public void setJoiningfor(String joiningfor) {
        this.joiningfor = joiningfor;
    }

    public String getJoiningfor() {
        return joiningfor;
    }

    public void setAccomadation(String accomadation){
        this.accomadation = accomadation;
    }

    public String getAccomadation() {
        return accomadation;
    }

    @Override
    public String toString() {
        return getRsvpname() + " " + getJoiningfor() + " " + getAccomadation();
    }
}