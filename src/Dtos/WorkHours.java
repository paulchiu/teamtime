package Dtos;

import java.text.MessageFormat;
import java.time.LocalTime;

public class WorkHours {
    public LocalTime start;
    public LocalTime end;

    public WorkHours(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return this.start + " - " + this.end;
    }
}
