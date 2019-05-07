package com.seckin.customers.repository.tr;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(cassandraTemplateRef = "cassandraTemplateDE")
public class CassandraConfigDE extends AbstractCassandraConfiguration {

  @Override
  protected String getKeyspaceName() {
    return "seckin_de";
  }

  @Override
  protected boolean getMetricsEnabled() {
    return false;
  }

  @Override
  @Bean("sessionSeckinDE")
  public CassandraSessionFactoryBean session() {
    return super.session();
  }

  @Bean
  public CassandraOperations cassandraTemplateDE(
      @Qualifier("sessionSeckinDE") CassandraSessionFactoryBean session) {
    return new CassandraTemplate(session.getObject(), cassandraConverter());
  }

}
