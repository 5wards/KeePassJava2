package org.linguafranca.keepass.kdb;

import org.junit.Test;
import org.linguafranca.keepass.Credentials;
import org.linguafranca.keepass.Database;

import java.io.InputStream;

/**
 * @author jo
 */
public class KdbSerializerTest {

    @Test
    public void testCreateKdbDatabase() throws Exception {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test123.kdb");
        Database database = KdbDatabase.load(new KdbCredentials.Password("123"), inputStream);
        database.visit(new Database.PrintVisitor());
    }
}