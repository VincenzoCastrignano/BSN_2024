package database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



object Test {
    @JvmStatic
    fun connection(){
        try {
            val c = DriverManager.getConnection(
                "jdbc:mysql://localhost?serverTimezone=UTC",
                "BSN",
                "Bsn2024 "
            )
            println("OK!")
        }
        catch (e:SQLException){
            e.printStackTrace()
        }
    }


}