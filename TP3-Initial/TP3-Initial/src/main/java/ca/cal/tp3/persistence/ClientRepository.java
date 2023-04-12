package ca.cal.tp3.persistence;


import ca.cal.tp3.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c LEFT JOIN FETCH c.amendes a WHERE c.id = :id ")
    Optional<Client> findByIdWithAmendes(@Param("clt_id") long id);

    @Query("SELECT c FROM Client c LEFT JOIN FETCH c.emprunts b WHERE c.id = :id")
    Optional<Client> findByIdWithEmprunts(@Param("clt_id") long id);
}
