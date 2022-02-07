package collection;

import java.util.Arrays;
import java.util.List;

public class TestNote {
    public static void main(String[] args) {
        NoteString note1 = new NoteString("java gc");
        System.out.println(note1.getContent());

        NoteInt note2 = new NoteInt(1);
        System.out.println(note2.getContent());
        Note<String> n3 = new Note<>("java gc");
        System.out.println(n3.getContent());
    }

}
