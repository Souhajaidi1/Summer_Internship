package esprit.tn.summerinternship3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignementLetter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int AssignementLetterId ;
    @Temporal(TemporalType.DATE)
    public Date StartDate ;
    @Temporal(TemporalType.DATE)
    public Date EndDate ;
    public String compName ;
    public String compAdress ;
    public int compPhone ;
    public  String compEmail ;
    @JsonIgnore
    @OneToOne
    public Internship internship ;
}
