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
public class Evaluation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int IdEvaluation ;
    public int Motivation_personnelle_de_etudiant ;
    public int Esprit_initiative ;
    public int Evolution_remarquee ;
    public int Capacite_dassumer_les_responsabilites;
    public int Capacite_de_travail_en_groupe ;
    public int Facilite_dadaptation_aux_divers_changements ;
    public int Capacite_de_communiquer_par_ecrit ;
    public int Capacite_de_sexprimer_en_public ;
    public int la_volonte_de_progresser ;
    public int Tient_compte_des_remarques ;
    public int interesse_aux_activites_proposees ;
    public int Sait_etre_attentive ;
    public int  capable_de_travailler_seul ;
    public int Realise_un_travail_avec_soin_et_precision;
    public int Respecte_les_consignes ;
    public int isConcluded;
    public int remarks ;
    @JsonIgnore
    @OneToOne
    public Journal journal ;
}
