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
    @JsonProperty("rsvpconstraint")
    private String rsvpconstraint;
    @JsonProperty("rsvpemail")
    private String rsvpemail;

    public RSVP(String rsvpname, String joiningfor, String accomadation, String rsvpconstraint, String rsvpemail){
        this.rsvpname = rsvpname;
        this.joiningfor = joiningfor;
        this.accomadation = accomadation;
        this.rsvpconstraint = rsvpconstraint;
        this.rsvpemail = rsvpemail;
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

    public void setRsvpemail(String rsvpemail) {
        this.rsvpemail = rsvpemail;
    }

    public String getRsvpemail() {
        return this.rsvpemail;
    }

    public void setRsvpconstraint(String rsvpconstraint) {
        this.rsvpconstraint = rsvpconstraint;
    }

    public String getRsvpconstraint() {
        return this.rsvpconstraint;
    }

    @Override
    public String toString() {
        return getRsvpname() + " " + getJoiningfor() + " " + getAccomadation() + " " + getRsvpconstraint() + " " + getRsvpemail();
    }
}