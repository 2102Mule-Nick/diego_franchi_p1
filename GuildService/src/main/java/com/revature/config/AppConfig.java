package com.revature.config;

import java.util.Properties;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.apache.activemq.command.ActiveMQQueue;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.jta.JtaTransactionManager;

import bitronix.tm.TransactionManagerServices;
import bitronix.tm.resource.jms.PoolingConnectionFactory;

@ImportResource({ "classpath:META-INF/cxf/cxf.xml" })
@ComponentScan("com.revature")
@Configuration
public class AppConfig {
	
	// JMS Broker Url
	public static final String BROKER_URL = "tcp://localhost:61616";

	// JMS Destinations
	public static final String EXAMPLE_QUEUE = "GUILD_ANNOUNCEMENTS";

	//DataSource info
		public static final String DATASOURCE_URL = 
				"jdbc:postgresql://" + 
				System.getenv("DB_URL") + 
				":5432/" + 
				System.getenv("DB_NAME") + 
				"?currentSchema=" + 
				System.getenv("DB_SCHEMA");
		public static final String DATASOURCE_DRIVERNAME = "org.postgresql.Driver";
		public static final String DATASOURCE_USERNAME = System.getenv("DB_USERNAME");
		public static final String DATASOURCE_PASSWORD = System.getenv("DB_PASSWORD");
		

//		@Bean
//		public Logger log() {
//			PropertyConfigurator.configure(getClass().getClassLoader().getResourceAsStream("/log4j.properties"));
//			Logger log = Logger.getRootLogger();
//			return log;
//		}
		
		@Bean
		public DataSource dataSource() {
			
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUrl(DATASOURCE_URL);
			dataSource.setDriverClassName(DATASOURCE_DRIVERNAME);
			dataSource.setUsername(DATASOURCE_USERNAME);
			dataSource.setPassword(DATASOURCE_PASSWORD);
			return dataSource;
			
		}
		
		@Bean
		public JdbcTemplate jdbcTemplate(DataSource dataSource) {
			System.out.println(dataSource.toString());
			JdbcTemplate template = new JdbcTemplate();
			template.setDataSource(dataSource);
			return template;
		}
		
//		@Bean
//		public ConnectionFactory bitronixConnectionFactory() {
//			PoolingConnectionFactory connectionFactory = new PoolingConnectionFactory();
//			connectionFactory.setClassName("org.apache.activemq.ActiveMQXAConnectionFactory");
//			connectionFactory.setUniqueName("activemq");
//			connectionFactory.setMaxPoolSize(10);
//			connectionFactory.setAllowLocalTransactions(true);
//			Properties props = new Properties();
//			props.put("brokerURL", BROKER_URL);
//			connectionFactory.setDriverProperties(props);
//			return connectionFactory;
//		}
//
//		@Bean
//		public Queue destinationQueue() {
//			return new ActiveMQQueue(EXAMPLE_QUEUE);
//		}
//
//		@Bean
//		public JmsTemplate jmsTemplate(ConnectionFactory bitronixConnectionFactory) {
//			JmsTemplate jmsTemplate = new JmsTemplate();
//			jmsTemplate.setConnectionFactory(bitronixConnectionFactory);
//			jmsTemplate.setReceiveTimeout(10000);
//			return jmsTemplate;
//		}
//		
//		@Bean
//		public bitronix.tm.Configuration btmConfig() {
//			bitronix.tm.Configuration config = TransactionManagerServices.getConfiguration();
//			config.setDisableJmx(true);
//			config.setServerId("spring-btm");
//			return config;
//		}
//
//		@Bean(destroyMethod = "shutdown")
//		@DependsOn("btmConfig")
//		public TransactionManager primaryTransactionManager() {
//			return TransactionManagerServices.getTransactionManager();
//		}
//
//		@Bean
//		public JtaTransactionManager jtaTransactionManager(TransactionManager primaryTransactionManager) {
//			JtaTransactionManager jtaTransactionManager = new JtaTransactionManager();
//			jtaTransactionManager.setTransactionManager(primaryTransactionManager);
//			return jtaTransactionManager;
//		}
	
}
