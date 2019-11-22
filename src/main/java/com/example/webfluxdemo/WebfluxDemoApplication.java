package com.example.webfluxdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.oauth2.client.web.server.ServerOAuth2AuthorizedClientRepository;
import org.springframework.web.reactive.function.client.WebClient;

import com.amica.acm.configuration.component.ComponentConfigurationsManager;

@SpringBootApplication
public class WebfluxDemoApplication {

	public static void main(String[] args) {
        System.setProperty("server.env", "JUNIT");
        System.setProperty("cfgmgr.class.path", "\\\\amica\\files\\envConfig\\appresources\\SharedResources;src\\test\\resources");
        ComponentConfigurationsManager.getComponentConfiguration("Oauth2ClientDemo");
		SpringApplication.run(WebfluxDemoApplication.class, args);
	}
	
    @Bean
    public WebClient webClient(ReactiveClientRegistrationRepository clientRegistrations, ServerOAuth2AuthorizedClientRepository authorizedClients) {
//        Configuration oktaConfiguration = ComponentConfigurationsManager.getConfigurationEnforcingExistance(COMPONENT_NAME, "Okta");
        ServerOAuth2AuthorizedClientExchangeFilterFunction oauth = new ServerOAuth2AuthorizedClientExchangeFilterFunction(clientRegistrations, authorizedClients);
        // (optional) explicitly opt into using the oauth2Login to provide
        // an access token implicitly
        oauth.setDefaultOAuth2AuthorizedClient(true);
        // (optional) set a default ClientRegistration.registrationId
        oauth.setDefaultClientRegistrationId("okta");
        

        
        WebClient webClient = WebClient.builder()
                .filter(oauth)
                .build();

        
        return webClient;
    }
}
