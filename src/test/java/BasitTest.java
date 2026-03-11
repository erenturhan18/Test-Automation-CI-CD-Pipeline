import org.testng.Assert;
import org.testng.annotations.Test;

public class BasitTest {

    @Test
    public void toplamaTesti() {
        System.out.println("--- GitHub Actions Testi Basliyor ---");
        int sonuc = 2 + 2;
        Assert.assertEquals(sonuc, 4);
        System.out.println("--- Test Basariyla Tamamlandi: Sonuc 4 ---");
    }
}