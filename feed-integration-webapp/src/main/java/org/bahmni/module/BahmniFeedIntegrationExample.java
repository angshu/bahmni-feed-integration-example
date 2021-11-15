package org.bahmni.module;

import org.bahmni.module.feedintegration.atomfeed.worker.EncounterFeedWorker;
import org.bahmni.module.feedintegration.repository.CronJobRepository;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackages = "org.bahmni.module.*")
@EnableTransactionManagement
public class BahmniFeedIntegrationExample extends SpringBootServletInitializer {

    @Autowired
    CronJobRepository cronJobRepository;

    private static final Logger logger = LoggerFactory.getLogger(EncounterFeedWorker.class);

    @RequestMapping("/")
    String home() {
        return "PACS Integration module is up and running.";
    }

    public static void main(String[] args) throws Exception {

        System.out.println("***************************");
        System.out.println("***************************");
        logger.error("************ Test **********");
        SpringApplication.run(BahmniFeedIntegrationExample.class, args);
        System.out.println("***************************");
        System.out.println("***************************");

    }

    @Bean
    public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf) {
        return hemf.getSessionFactory();
    }
}
