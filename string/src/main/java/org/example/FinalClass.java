package org.example;

import java.util.*;

final class FinalClass {
    private final List<Student> list;
    private final Date date;

    public FinalClass(List<Student> list, Date date) {
        this.list = Collections.unmodifiableList(new ArrayList<>(list));
        this.date = new Date(date.getTime());
    }

    public List<Student> getList() {
        return Collections.unmodifiableList(new ArrayList<>(list));
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return "FinalClass{" +
                "list=" + list +
                ", date=" + date +
                '}';
    }
}