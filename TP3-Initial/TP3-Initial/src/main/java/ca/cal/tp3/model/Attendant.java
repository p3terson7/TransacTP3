package ca.cal.tp3.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ATTENDANT")
public class Attendant extends Utilisateur{
}
