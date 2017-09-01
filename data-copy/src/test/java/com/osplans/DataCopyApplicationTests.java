package com.osplans;

import com.osplans.domain.Loan;
import com.osplans.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataCopyApplicationTests {

	@Autowired
	private DataService dataService;

	@Test
	public void contextLoads() {

        Loan loan = dataService.findOne(50);
        System.out.println(loan.toString());

    }

}
