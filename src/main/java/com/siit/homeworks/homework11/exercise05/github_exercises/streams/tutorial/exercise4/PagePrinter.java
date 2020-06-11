package com.siit.homeworks.homework11.exercise05.github_exercises.streams.tutorial.exercise4;

import static java.lang.String.format;

public final class PagePrinter {

    private final String pageBreak;

    public PagePrinter(String pageBreak) {
        this.pageBreak = pageBreak;
    }

    public String printTitlePage(Document document) {
        return format(
                "%s%n" +
                "%s%n", document.getTitle(), pageBreak);
    }

    public String printPage(Document.Page page) {
        return format(
                "%s%n" +
                "%s%n", page.getContent(), pageBreak);
    }
}
