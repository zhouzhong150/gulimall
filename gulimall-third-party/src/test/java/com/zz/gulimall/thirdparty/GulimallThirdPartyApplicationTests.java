package com.zz.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("D:\\Idea\\Code\\sgg\\gulimall\\gulimall-product\\src\\test\\java\\com\\zz\\gulimall\\product\\学期总结.txt");
        ossClient.putObject("gulimall-zhouzhong", "mytest11.txt", inputStream);
        ossClient.shutdown();
        System.out.println("文件上传完成");
    }

}
