package ca.cal.tp3.persistence;

import ca.cal.tp3.model.Document;
import ca.cal.tp3.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    List<Document> findAllByAuteurIgnoreCase(String auteur);
    List<Document> findAllByTitreIgnoreCase(String titre);
    List<Document> findAllByAnnee(int annee);
    @Query("SELECT l from Livre l")
    List<Livre> findAllLivres();

    @Query("SELECT l FROM Livre l WHERE l.genre = :genre")
    List<Livre> findAllLivresByGenre(@Param("livre_genre") String genre);

}