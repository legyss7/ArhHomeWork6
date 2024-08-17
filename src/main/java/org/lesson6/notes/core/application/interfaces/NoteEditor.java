package org.lesson6.notes.core.application.interfaces;

//public interface NoteEditor<T, TId> extends Editor<T, TId> {
//    void printAll();
//}

import org.lesson6.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {
    void printAll();
}
