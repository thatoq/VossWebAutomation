package Utils;

import org.testng.annotations.DataProvider;

public class DataProviderObject {
    @DataProvider(parallel = true)
    public Object[][] Login() {
        return new Object[][] {
                {"chrome", "thatoqhusheka@gmail.com", "Root@trojen"}
        };
    }
    @DataProvider(parallel = true)
    public Object[] FillOutForms(){
        return new Object[][]{
                {"chrome", "thato", "test1","siya","test2","9"}
        };
    }
    @DataProvider(parallel = true)
    public Object[] FakePricing(){
        return new Object[][]{
                {"chrome"}
        };
    }
}
