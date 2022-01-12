package mul.camp.a.service;

import java.util.List;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

public interface BbsService {

	List<BbsDto> bbslist(BbsParam param);
	
	boolean writebbs(BbsDto dto);
	
	BbsDto getBbs(int seq);
	
	void reply(BbsDto dto);
}
