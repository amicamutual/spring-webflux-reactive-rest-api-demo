package com.example.webfluxdemo.controller;

import java.util.logging.Level;

import org.springframework.http.MediaType;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.amica.escm.claimapi.model.Claim;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import reactor.core.publisher.Flux;

/**
 * Created by rajeevkumarsingh on 08/09/17.
 */
@RestController
@RequiredArgsConstructor
@Log
public class TweetController {

    private final WebClient webClient;

    @GetMapping(path = "/test", produces = { MediaType.APPLICATION_STREAM_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
//    @ResponseBody
    public Flux<Claim> test() {
        try {
            
//            return this.webClient.get()
//            .uri("http://claimapi.pd6.amica.com/ClaimAPI/claims?partyUUID=14042511")
//            .attributes(ServerOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId("okta"))
//            .retrieve()
//            .bodyToMono(List.class)
//            .flatMapMany(Flux::fromIterable);
            
            return this.webClient.get()
                    .uri("http://claimapi.pd6.amica.com/ClaimAPI/claims?partyUUID=14042511")
                    .attributes(ServerOAuth2AuthorizedClientExchangeFilterFunction.clientRegistrationId("okta"))
                    .retrieve()
                    .bodyToFlux(Claim.class);
//                    .log()
//                    .doOnNext(claim -> log.info(claim + ""));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Something is broken", e);
            return Flux.empty();
        }
    }


}
