package homepage;

import base.CommonApi;
import org.testng.annotations.Test;

public class homePage extends CommonApi {

    @Test
    public void homeSearch(){
        System.out.println(driver.getCurrentUrl());
        
    }
}
