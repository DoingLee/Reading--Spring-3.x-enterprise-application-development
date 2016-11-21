package sample.junit;
import static org.junit.Assert.assertEquals; 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays; 
import java.util.Collection; 
import java.util.Date;
import org.junit.Test; 
import org.junit.runner.RunWith; 
import org.junit.runners.Parameterized; 
import org.junit.runners.Parameterized.Parameters; 

@RunWith(Parameterized.class) 
public class Junit4ParameterTest {
	private SimpleDateFormat simpleDateFormat;
	private String date;
	private String dateformat;
    private String expectedDate;
    
    public Junit4ParameterTest(String date, String  dateformat, String expectedDate){
    	this.date = date;
    	this.dateformat = dateformat;
        this.expectedDate = expectedDate;
    }

	@Parameters
	@SuppressWarnings("unchecked")
	public static Collection getParamters() {
		String[][] object = { 
				{ "2011-07-01 00:30:59", "yyyyMMdd", "20110701" },
				{ "2011-07-01 00:30:59", "yyyy年MM月dd日", "2011年07月01日" },
				{ "2011-07-01 00:30:59", "HH时mm分ss秒", "00时30分59秒" } };
		return Arrays.asList(object);
	}

    @Test
    public void testSimpleDateFormat() throws ParseException{
    	SimpleDateFormat df  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date d = df.parse(this.date);
    	simpleDateFormat = new SimpleDateFormat(this.dateformat);
    	String result = simpleDateFormat.format(d);
        assertEquals(this.expectedDate, result);
    }

}
