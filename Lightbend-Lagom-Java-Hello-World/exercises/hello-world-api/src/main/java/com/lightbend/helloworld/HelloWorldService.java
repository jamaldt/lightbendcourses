package com.lightbend.helloworld;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.*;
/**
 * System:                 CleanBnB
 * Name:                   HelloWorldService
 * Description:            Class that represents a HelloWorldService's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 1/6/22
 */
public interface HelloWorldService extends Service
{
    ServiceCall<NotUsed,String> helloWorld();

    @Override
    default  Descriptor descriptor(){
        return named("hello-world-service").withCalls(
            namedCall("hello-world",this::helloWorld)
        ).withAutoAcl(true);
    }
}
