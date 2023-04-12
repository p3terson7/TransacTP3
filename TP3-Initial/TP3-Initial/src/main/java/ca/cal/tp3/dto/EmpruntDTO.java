package ca.cal.tp3.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpruntDTO {
    private long id;
    private long cltId;
    private long docId;
    private String empruntDate;
    private String emprunteDateEcheance;
    private boolean empruntReturned;

}
