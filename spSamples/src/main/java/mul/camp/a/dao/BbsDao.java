package mul.camp.a.dao;

import java.util.List;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

public interface BbsDao {

	List<BbsDto> bbslist(BbsParam param);
	
	int writebbs(BbsDto dto);
	
	BbsDto getBbs(int seq);
	
	int replyBbsUpdate(BbsDto dto);
	int replyBbsInsert(BbsDto dto);
}
