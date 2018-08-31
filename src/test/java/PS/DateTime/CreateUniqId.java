package PS.DateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUniqId {

    @Test
    public void createAUniqueUserID(){

        String userID = "user" + System.currentTimeMillis();

        System.out.println(userID);
        Assert.assertTrue(userID.startsWith("user"));
        Assert.assertTrue(Long.valueOf(userID.replace("user",""))>1000L);
    }

}