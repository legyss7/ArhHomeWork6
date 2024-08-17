package org.lesson6.notes.infrastructure.persistance;

import org.lesson6.database.NotesDatabase;
import org.lesson6.database.NotesRecord;
import org.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import org.lesson6.notes.core.domain.Note;
import org.lesson6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NotedDBContext extends DBContext implements NotesDatabaseContext {

    public NotedDBContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: этого кастинга быть не должно, тут должен
        // работать внутрениий мезанизм фреймворка
        for (NotesRecord record : ((NotesDatabase)database)
                .getNotesTable().getRecords()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationData()
            ));
        }
        return notesList;
    }
}
