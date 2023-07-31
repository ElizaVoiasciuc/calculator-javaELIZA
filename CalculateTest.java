import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

/*public class CalculateTest{
    Calculator Calculate;

    @Test
    public void doi_plus_doi_ar_trebui_sa_dea_patru() {
        List<Float>numbers=Arrays.asList(2,2);
        List<String>operations=Arrays.asList("+");
        Calculate.Calculate(numbers,operations); */  
public class CalculateTest {
    Calculator Calculate;
        
        @Test
        public void testAddition() {
            Calculator CalculateTest = new Calculator();
            assertEquals(8, Calculator.Calculate("3,5","+"));    
    }

 } 
