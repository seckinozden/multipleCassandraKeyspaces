package com.seckin.customers.repository.de;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraSessionFactoryBean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(cassandraTemplateRef = "cassandraTemplateTR")
public class CassandraConfigTR extends AbstractCassandraConfiguration {

  @Override
  protected String getKeyspaceName() {
    return "seckin_tr";
  }

  @Override
  protected boolean getMetricsEnabled() {
    return false;
  }

  @Override
  @Bean("sessionSeckinTR")
  public CassandraSessionFactoryBean session() {
    return super.session();
  }

  @Bean
  public CassandraOperations cassandraTemplateTR(
      @Qualifier("sessionSeckinTR") CassandraSessionFactoryBean session) {
    return new CassandraTemplate(session.getObject(), cassandraConverter());
  }
}