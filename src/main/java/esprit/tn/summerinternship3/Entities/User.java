package esprit.tn.summerinternship3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long userId ;
    public String firstname ;
    public String lastname ;
    public String email ;
    public int year ;
    public String password ;
    public String company ;
    @JsonIgnore
    @OneToMany(mappedBy = "userInternship")
    public List<Internship> internshipList ;
    @JsonIgnore
    @OneToOne(mappedBy = "user")
    public Journal journal ;
}
