package com.niit.msa.item.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
public class ItemMasterConfig {

	/*@Bean
	public DataSource dataSource() {
		String driverClassName ="com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/msadb";
		String username ="root";
		String password ="root";

		DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
		dataSource.setDriverClassName(driverClassName);
		
		return dataSource;
	}*/
	
	@Bean
	LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryBean.setDataSource(dataSource);
		entityManagerFactoryBean.setPackagesToScan("com.niit.msa.item.data");
		PersistenceProvider persistenceProvider = new HibernatePersistenceProvider();
		entityManagerFactoryBean.setPersistenceProvider(persistenceProvider);
		entityManagerFactoryBean.setJpaProperties(getHibernateProperties());
		return entityManagerFactoryBean;
	}
	
	/**
	 * TODO get this from properties file
	 */
    private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.id.new_generator_mappings","false");
        return properties;
    }

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory);
		return txManager;
	}

}
