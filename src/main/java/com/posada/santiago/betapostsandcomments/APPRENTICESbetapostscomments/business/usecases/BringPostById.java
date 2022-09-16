package com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.usecases;




import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.application.adapters.repository.MongoViewRepository;
import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways.model.PostViewModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Slf4j
@Service
@RequiredArgsConstructor
public class BringPostById implements Function<String, Mono<PostViewModel>> {


    // finish the implementation of this class using the functional interfaces


    public final MongoViewRepository repository;

    @Override
    public Mono<PostViewModel> apply(String postId) {
        log.info("Finding by Aggregate ID");
        return this.repository.findByAggregateId(postId)
                .doOnError(error -> log.error(String.valueOf(error)));
    }




}
