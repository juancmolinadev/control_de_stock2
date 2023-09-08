package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public Connection recuperaConexion() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimezone=true&serverTimeZone=UTC", "root", ".MAZdaRx7.");
    }
}
