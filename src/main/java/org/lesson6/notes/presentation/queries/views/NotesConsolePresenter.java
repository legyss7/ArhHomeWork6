package org.lesson6.notes.presentation.queries.views;

import org.lesson6.notes.core.application.interfaces.NotesPresenter;
import org.lesson6.notes.core.domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {
    @Override
    public void printAll(Collection<Note> notes) {
        for(Note note : notes) {
            System.out.println(note);
        }
    }
}
