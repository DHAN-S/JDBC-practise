import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Scanner;
class Insert {
    Scanner scan = new Scanner(System.in);
    void insert(String query, CreateConnection object) throws Exception {
        System.out.print("s_no: ");
        int age = scan.nextInt();
        System.out.print("name: ");
        String name = scan.next();
        PreparedStatement pp = object.con.prepareStatement(query);
        pp.setString(2, name);
        pp.setInt(1, age);
        pp.executeUpdate();
    }
}
