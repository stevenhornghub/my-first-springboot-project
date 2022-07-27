package com.bib.basiclibraryspring.db;

import ch.vorburger.exec.ManagedProcessException;
import ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService;

public class LibraryDatabase {

    private static MariaDB4jSpringService db;

    public static void init() throws ManagedProcessException {
        db = new MariaDB4jSpringService();
        db.setDefaultPort(1234);
        db.start();
        db.getDB().createDB("library");
        db.getDB().source("schema.sql"); //from /resources/schema.sql
    }

    public static void cleanUp() {
        if (db != null) db.stop();
    }

}
