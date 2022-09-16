package com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.usecases;



import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.application.adapters.repository.MongoViewRepository;
import com.posada.santiago.betapostsandcomments.APPRENTICESbetapostscomments.business.gateways.model.PostViewModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Slf4j
@Service
@RequiredArgsConstructor
public class BringAllPostsUseCase implements Supplier<Flux<PostViewModel>> {

    //Finish the implementation of this class using the functional interfaces
    public final MongoViewRepository repository;
    @Override
    public Flux<PostViewModel> get() {
        log.info("Finding All posts");
        return this.repository
                .findAllPosts()
                .doOnError(error -> log.error(String.valueOf(error)));
    }






}
