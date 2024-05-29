package ex07;

import ex07.lib.DB;
import ex07.lib.Driver;
import ex07.lib.MariaDB;
import ex07.lib.OracleDB;

public class DBFactory {

    private static DBFactory instance = new DBFactory();

    private DBFactory() {
    }

    public static DBFactory getInstance() {
        return instance;
    }

    // 이렇게 하면 마이에스큐엘이 들어오면 이 코드가 추가되어야 하기 때문에 코드가 변경되어야 하고 OCP에는 위배됨
    // 팩토리 메서드(생성 패턴)의 책임: new를 대신해준다. 모든 것이 DB타입이라 DB로 해도 된당.
    public DB createDB(Driver driver) { // maria, oracle, mysql, mssql
        if (driver.getProtocol().equals("maria")) {
            MariaDB mariaDB = new MariaDB();
            mariaDB.setUrl("jdbc:mariadb://127.0.0.1:3306");
            return mariaDB;
        } else if (driver.getProtocol().equals("oracle")) {
            OracleDB oracleDB = new OracleDB();
            oracleDB.setUrl("jdbc:oracle:thin://127.0.0.1:8080");
            return oracleDB;
        } else {
            throw new NullPointerException("db driver not found exception");
        }
    }
}
