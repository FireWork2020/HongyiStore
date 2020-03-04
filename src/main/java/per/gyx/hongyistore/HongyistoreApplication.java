package per.gyx.hongyistore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("per.gyx.hongyistore.dao")
public class HongyistoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongyistoreApplication.class, args);
    }

}
