package gratis.contoh.api.model.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MstLanguageMappingResponse implements Serializable {

	private static final long serialVersionUID = 3744637333024477102L;

	private String mapping;

	private String id;
	
	private String en;
	
}
