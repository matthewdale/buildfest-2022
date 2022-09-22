package org.buildfest2022;

import io.micronaut.core.annotation.NonNull;
import org.bson.types.ObjectId;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface DocumentRepository {
  @NonNull
  Publisher<Document> list();

  Mono<ObjectId> save(@NonNull @NotNull @Valid Document document);
}
