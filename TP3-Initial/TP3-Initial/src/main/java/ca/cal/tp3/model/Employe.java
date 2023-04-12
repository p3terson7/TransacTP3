package ca.cal.tp3.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EMPLOYE")
public class Employe extends Utilisateur{
}
