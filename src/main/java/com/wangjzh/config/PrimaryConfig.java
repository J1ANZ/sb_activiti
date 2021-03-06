//package com.wangjzh.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManager;
//import javax.sql.DataSource;
//import java.util.Map;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef="entityManagerFactoryPrimary",
//        transactionManagerRef = "transactionManagerPrimary",
//        basePackages = {"com.wangjzh.business.domain.p"}
//)
//public class PrimaryConfig {
//
//    @Autowired
//    @Qualifier("primaryDataSource")
//    private DataSource dataSource;
//
//    @Autowired
//    private JpaProperties jpaProperties;
//
//    private Map<String,String> getVendorProperties(DataSource dataSource){
//        return jpaProperties.getHibernateProperties(dataSource);
//    }
//
//    @Primary
//    @Bean(name = "entityManagerFactoryPrimary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder){
//        return builder.
//                dataSource(dataSource)
//                .properties(getVendorProperties(dataSource))
//                .packages("com.business.wangjzh.domain.p")//设置实体类位置
//                .persistenceUnit("primaryPersistenceUnit")
//                .build();
//    }
//
//    @Primary
//    @Bean(name = "entityManagerPrimary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder){
//        return entityManagerFactoryBean(builder).getObject().createEntityManager();
//    }
//
//
//    @Primary
//    @Bean(name = "transactionManagerPrimary")
//    public PlatformTransactionManager transactionManager(EntityManagerFactoryBuilder builder){
//        return new JpaTransactionManager(entityManagerFactoryBean(builder).getObject());
//    }
//
//}
