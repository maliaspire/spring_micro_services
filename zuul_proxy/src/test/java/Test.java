import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * 8/15/2018
 *
 * @author Mohammad Ali
 */
public class Test {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date = dateFormat.parse("15-06-2018");
            System.out.println(dateFormat.format(date));
            LocalDate.parse("2018-08-15");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
