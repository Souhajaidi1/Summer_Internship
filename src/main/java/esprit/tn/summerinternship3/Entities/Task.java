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
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int taskId ;
    @Temporal(TemporalType.DATE)
    public Date date ;
    public String content ;
    public int status ;
    @JsonIgnore
    @ManyToOne
    public Journal journal ;
}
