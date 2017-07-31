
package com.uniajc.smartservices.accesodatos;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import com.uniajc.smartservices.utilidades.ExceptionUtil;


public class DbConnPoolManager {

    private static DataSource ds = null;

    public static synchronized Connection getConnection(String datasource) throws ExceptionUtil {
        if (ds == null) {
            try {
                Context initCtx = new InitialContext();
                Context envCtx = (Context) initCtx.lookup("java:comp/env/");
                ds = (DataSource) envCtx.lookup(datasource);
            } catch (Exception ex) {
                throw new ExceptionUtil(ex);
            }
        }
        
        Connection connection = null;
        try {
            connection = ds.getConnection();

            if (connection == null) {
                throw new ExceptionUtil("No fue posible obtener una conexion del pool de conexiones");
            }
        } catch (SQLException | ExceptionUtil ex) {
            throw new ExceptionUtil(ex);
        }
        return connection;
    }
}


