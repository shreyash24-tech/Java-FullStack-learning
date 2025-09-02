package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

@Autowired
    private JournalEntryRepository journalEntryRepository;

    public JournalEntryService(JournalEntryRepository journalEntryRepository) {
        this.journalEntryRepository = journalEntryRepository;
    }

    public void saveEntry(JournalEntry journalEntry)
    {
        journalEntryRepository.save(journalEntry);

    }
    public List<JournalEntry> getAll()
    {
        return journalEntryRepository.findAll();

    }

    public Optional<JournalEntry> findById(ObjectId id)
    {
        return Optional.ofNullable(journalEntryRepository.findById(id).orElse(null));
    }

    public void deleteById(ObjectId id)
    {

        journalEntryRepository.deleteById(id);
    }
}
