package esprit.tn.summerinternship3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Journal  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int journalId ;
    @Temporal(TemporalType.DATE)
    public Date StartDate ;
    @Temporal(TemporalType.DATE)
    public Date EndDate ;
    public int nbrTask;
    public float note ;
    @JsonIgnore
    @OneToOne
    public User user ;
    @JsonIgnore
    @OneToMany(mappedBy = "journal")
    public List<Task> tasks;
    @JsonIgnore
    @OneToOne(mappedBy = "journal")
    public Evaluation evaluation ;
}
