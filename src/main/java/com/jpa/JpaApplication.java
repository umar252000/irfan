package com.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.UserRepository;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaApplication.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
//		User user=new User();
//		user.setId(3);
//		user.setName("amjhad");
//		user.setCity("mumbai");
//		user.setStatus("java");
//		
//		User user2=new User();
//		user2.setId(4);
//		user2.setName("ziya");
//		user2.setCity("mumbai");
//		user2.setStatus("cricket");
//		
//		List<User> list=new ArrayList<User>();
//		list.add(user);
//		list.add(user2);
//		
//		Iterable<User> saveAll = bean.saveAll(list);
//		System.out.println(saveAll);
		
//		Optional<User> findById = bean.findById(52);
//		User user2 = findById.get();
//		user2.setName("sohail");
//		bean.save(user2);
//		System.out.println(user2);
//		
//		Iterable<User> findAll = bean.findAll();
//		Iterator<User> iterator = findAll.iterator();
//		while(iterator.hasNext())
//		{
//			System.out.println(iterator.next());
//		}

//	bean.deleteById(52);
	
	//bean.deleteAll();
//	List<User> findByName = bean.findByName("umar");
//	Iterator<User> iterator = findByName.iterator();
//	while(iterator.hasNext())
//	{
//		System.out.println(iterator.next());
//	}
//	System.out.println(findByName);
//	
		
//		Optional<User> findById = bean.findById(202);
//		System.out.println(findById);
		
	//	bean.deleteById(202);
		List<User> findByCity = bean.findByCity("mumbai");
		System.out.println(findByCity);
		
	
	}

}
