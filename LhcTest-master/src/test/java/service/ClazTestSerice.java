package service;

import com.test.entity.Claz;
import com.test.service.ClazService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext-dao.xml",
        "classpath:config/spring/applicationContext-service.xml"})
public class ClazTestSerice {
    @Autowired
    private ClazService clazSerice;

    @Test
    public void testGetAllGoodsList() {
        List<Claz> runt = clazSerice.getAllClaz();
        System.out.println(JSONObject.valueToString(runt));
    }
}
