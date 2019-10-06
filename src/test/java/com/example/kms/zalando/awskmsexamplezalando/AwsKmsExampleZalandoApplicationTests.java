package com.example.kms.zalando.awskmsexamplezalando;

import de.zalando.spring.cloud.config.aws.kms.KmsTextEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AwsKmsExampleZalandoApplicationTests {


	@Autowired
	private KmsTextEncryptor kmsTextEncryptor;

	@Test
	public void contextLoads() {

	}


	@Test
	public void testDecryption()
	{
		String encryptedValue = "AQICAHgcMde18qyHM9MPP+zVTHS9yvLW/PmBQ7ADgoz8e3DSXwGdj4UC8wxkGYQTUGGMiQbhAAAAbTBrBgkqhkiG9w0BBwagXjBcAgEAMFcGCSqGSIb3DQEHATAeBglghkgBZQMEAS4wEQQMG7ozlt0YNR2m0AgCAgEQgCpvj5IX1WNXYKT58R++812e/MZeOhWVkaMiSTYvjeXmfmgznv4i0Fd8uHc=";
		String expected = "welcome Mahmoud";
		String actual = kmsTextEncryptor.decrypt(encryptedValue);
		assertEquals(expected,actual);
	}


	@Test
	public void testEncryption()
	{
		// unfortunately could no be unit tested
	}

}
