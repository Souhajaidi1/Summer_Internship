package esprit.tn.summerinternship3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Internship implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long internshipId ;
    @Lob
    public byte[] reportFile ;
    @Lob
    public byte[] attestationFile ;
    public double mark ;
    public boolean isValid ;
    public Speciality speciality ;
    public Optionn optionn ;
    public Type type;
    public int year ;
    @JsonIgnore
    @OneToOne(mappedBy = "internship")
    public AssignementLetter assignementLetter ;
    @JsonIgnore
    @ManyToOne
    public User userInternship;
}
