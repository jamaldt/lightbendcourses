package com.lightbend.helloworld;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static java.util.concurrent.CompletableFuture.completedFuture;

/**
 * System:                 CleanBnB
 * Name:                   HelloWorldServiceImpl
 * Description:            Class that represents a HelloWorldServiceImpl's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 1/6/22
 */
public class HelloWorldServiceImpl implements HelloWorldService
{

    @Override
    public ServiceCall<NotUsed, String> helloWorld()
    {
        return notUsed -> completedFuture("Hello World");
    }
}
