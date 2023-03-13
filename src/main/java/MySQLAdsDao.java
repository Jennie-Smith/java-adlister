import java.sql.Connection;
import java.util.List;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;


public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public MySQLAdsDao(Config config){
        try{
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch(SQLException e){
            throw new RuntimeException("error connecting to database", e);
        }
    }
    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM jdbc_ads");
            while (rs.next()){
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }return ads;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            String sql = String.format("INSERT INTO jdbc_ads (title, description, user_id) Values('%s', '%s', '%d'", ad.getTitle(), ad.getDescription(), ad.getUserId());
            long results = stmt.executeUpdate(sql);
            return results;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
