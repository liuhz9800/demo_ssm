package dao;

import com.test.dao.ClazDao;
import com.test.entity.Claz;
import org.apache.xml.security.utils.SignerOutputStream;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/applicationContext-dao.xml"})
public class ClazTestDao {
    @Autowired
    private ClazDao clazDao;

    @Test
    public void test(){
        System.out.println("--------success---");

    }

    @Test
    public void testGetAllGoodsList(){
        List<Claz> result= clazDao.getAllClaz();
        System.out.println(JSONObject.valueToString(result));
    }
    @Test
    public void testGetClaz(){
        Claz result= clazDao.getClaz(1);
        System.out.println(JSONObject.valueToString(result));
    }
}
