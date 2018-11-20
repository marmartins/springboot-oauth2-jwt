package com.marcsystem.security.oauthjwt.config;

import com.marcsystem.security.oauthjwt.OauthJwtApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {OauthJwtApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordEncoderTest {

    @Autowired
    private PasswordEncoder passwordncoder;

    @Test
    public void encoderTest() throws Exception {
        assertNotNull(passwordncoder.encode("jwtpass"));
        assertNotNull(passwordncoder.encode("jwtpass2"));
    }



    @Test
    public void machesPasswordTest() throws Exception {
        assertTrue(passwordncoder.matches("jwtpass", "$2a$10$MYkoj5EgkNnNG8h7Cd8e6ufGcsXpucdTphHepNTqEbFElHPD39Ld"));
        assertTrue(passwordncoder.matches("jwtpass", "$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe"));
    }
}
