package com.csumut.demo.reactivecitysearch.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.embedded.netty.NettyReactiveWebServerFactory;
import org.springframework.boot.web.embedded.netty.NettyServerCustomizer;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.reactive.ContextPathCompositeHandler;
import org.springframework.http.server.reactive.HttpHandler;

import reactor.netty.http.server.HttpServer;

/**
 * Netty server configuration for -currently- context path and port.
 * 
 * @author umut
 */
@Configuration
public class NettyConfiguration
{

  @Value("${server.port}")
  private int port;

  @Value("${server.context-path}")
  private String contextPath;

  @Bean
  public NettyReactiveWebServerFactory nettyReactiveWebServerFactory()
  {
    NettyReactiveWebServerFactory webServerFactory = new NettyReactiveWebServerFactory() {
      @Override
      public WebServer getWebServer(HttpHandler httpHandler)
      {
        Map<String, HttpHandler> handlerMap = new HashMap<>();
        handlerMap.put(contextPath, httpHandler);
        return super.getWebServer(new ContextPathCompositeHandler(handlerMap));
      }
    };
    webServerFactory.addServerCustomizers(setPort());
    return webServerFactory;
  }

  public NettyServerCustomizer setPort()
  {
    return (HttpServer httpServer) -> httpServer.port(port);
  }
}
