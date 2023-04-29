package gratis.contoh.api.service;

import gratis.contoh.api.model.dto.MstLanguageMappingDto;
import gratis.contoh.api.model.response.MstLanguageMappingResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MstLanguageMappingService {
	
	public Flux<MstLanguageMappingResponse> getAll();
	public Mono<MstLanguageMappingResponse> getById(String id);
	public Mono<MstLanguageMappingResponse> post(Mono<MstLanguageMappingDto> request);
	public Mono<MstLanguageMappingResponse> delete(String id);
	
}
