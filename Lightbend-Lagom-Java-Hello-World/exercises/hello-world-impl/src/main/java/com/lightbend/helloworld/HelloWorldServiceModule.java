package com.lightbend.helloworld;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

/**
 * System:                 CleanBnB
 * Name:                   HelloWorldServiceModule
 * Description:            Class that represents a HelloWorldServiceModule's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 1/6/22
 */
public class HelloWorldServiceModule extends AbstractModule implements ServiceGuiceSupport
{
    @Override
    protected  void configure(){
        bindService(HelloWorldService.class,HelloWorldServiceImpl.class);
    }
}
