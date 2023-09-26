package entities;

import java.util.Objects;

public class Course {
    private int indentifier;

    public Course(int indentifier) {
        this.indentifier = indentifier;
    }

    public int getIndentifier() {
        return indentifier;
    }

    public void setIndentifier(int indentifier) {
        this.indentifier = indentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return indentifier == course.indentifier;
    }

    @Override
    public int hashCode() {
        return Objects.hash(indentifier);
    }
}
