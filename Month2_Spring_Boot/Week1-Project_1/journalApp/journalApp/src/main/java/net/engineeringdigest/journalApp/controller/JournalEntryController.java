package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("journal")
public class JournalEntryController {
    private Map<Long ,JournalEntry> journalEntries=new HashMap<>();
    
    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody  JournalEntry myEntry)
    {
        journalEntries.put(myEntry.getId(),myEntry);
        boolean b = true;
        return b;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJorrnalEntryById(@PathVariable Long myId){

        return journalEntries.get(myId);
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryId(@PathVariable Long myId){

        return journalEntries.remove(myId);
    }

    @PutMapping("id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable Long myId,@RequestBody  JournalEntry myEntry)
    {
        return journalEntries.put(myId,myEntry);
    }
}
