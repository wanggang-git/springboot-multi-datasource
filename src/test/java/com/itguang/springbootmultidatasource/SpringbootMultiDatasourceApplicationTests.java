package com.itguang.springbootmultidatasource;

import com.itguang.springbootmultidatasource.domain.User;
import com.itguang.springbootmultidatasource.domain.UserInfo;
import com.itguang.springbootmultidatasource.domain2.Person;
import com.itguang.springbootmultidatasource.repository.test1.UserInfoRepository;
import com.itguang.springbootmultidatasource.repository.test1.UserRepository;
import com.itguang.springbootmultidatasource.repository.test2.personRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMultiDatasourceApplicationTests {

	@Resource
	private UserRepository userTest1Repository;
	@Resource
	private personRepository userTest2Repository;
	@Resource
	private UserInfoRepository userInfoRepository;
	@Test
	public void testSave() throws Exception {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);

		userTest1Repository.save(new User("aa", "aa123456","aa@126.com", "aa",  date));
		userTest2Repository.save(new Person("cc", "cc123456","cc@126.com", "cc",  formattedDate));
		List<UserInfo > userInfo  =userInfoRepository.findAll();
		System.out.println(userInfo);
	}

	@Test
	public void contextLoads() {
	}

}
