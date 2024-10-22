package org.carebridge.carebridgeadminapi;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CareBridgeAdminApiApplicationTests {


}
