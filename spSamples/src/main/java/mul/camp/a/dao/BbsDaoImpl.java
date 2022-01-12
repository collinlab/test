package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;

@Repository
public class BbsDaoImpl implements BbsDao{

	@Autowired
	SqlSession session;
	
	String ns = "Bbs.";

	@Override
	public List<BbsDto> bbslist(BbsParam param) {		
		return session.selectList(ns + "bbslist", param);
	}

	@Override
	public int writebbs(BbsDto dto) {
		int count = session.insert(ns + "writebbs", dto);
		return count;
	}

	@Override
	public BbsDto getBbs(int seq) {		
		return session.selectOne(ns + "getBbs", seq);
	}

	@Override
	public int replyBbsUpdate(BbsDto dto) {
		int n = session.update(ns + "replyBbsUpdate", dto);
		return n;
	}

	@Override
	public int replyBbsInsert(BbsDto dto) {	
		int n = session.insert(ns + "replyBbsInsert", dto);
		return n;
	}	
				
}
