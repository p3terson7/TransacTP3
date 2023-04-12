package ca.cal.tp3.service;

import ca.cal.tp3.dto.DocumentDTO;
import ca.cal.tp3.dto.LivreDTO;
import ca.cal.tp3.persistence.AmendeRepository;
import ca.cal.tp3.persistence.ClientRepository;
import ca.cal.tp3.persistence.DocumentRepository;
import ca.cal.tp3.persistence.EmpruntRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {
    private AmendeRepository amendeRepository;
    private EmpruntRepository empruntRepository;
    private ClientRepository clientRepository;
    private DocumentRepository documentRepository;

    public List<DocumentDTO> getAllDocuments() {
        return objectsToDTO.documentsToDTO(documentRepository.findAll());
    }

    public List<LivreDTO> getAllLivres() {
        return objectsToDTO.livresToDTO(documentRepository.findAllLivres());
    }

    public List<DocumentDTO> getDocumentsByTitre(String titre) {
        return objectsToDTO.documentsToDTO(documentRepository.findAllByTitreIgnoreCase(titre));
    }
    public List<DocumentDTO> getDocumentsByAuteur(String auteur) {
        return objectsToDTO.documentsToDTO(documentRepository.findAllByAuteurIgnoreCase(auteur));
    }
    public List<DocumentDTO> getDocumentsByAnnee(int annee) {
        return objectsToDTO.documentsToDTO(documentRepository.findAllByAnnee(annee));
    }
    public List<LivreDTO> getLivresByGenre(String genre) {
        return objectsToDTO.livresToDTO(documentRepository.findAllLivresByGenre(genre));
    }




}
