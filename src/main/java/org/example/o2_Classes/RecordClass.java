package org.example.o2_Classes;

import java.io.Serializable;

public record RecordClass(int start, int end, int middle) implements Serializable {
    public RecordClass {
        if (end <= start) {
            throw new IllegalArgumentException("End cannot be lesser than start");
        }

        middle = 1;
    }

     public RecordClass(int start, int end) {
         this(start, end, 2);
     }

     public int end() {
        return end + 100;
     }
}
