package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.HapOrgCompanys;
import hapExam.aimcore.demo.mapper.HapOrgCompanysMapper;
import hapExam.aimcore.demo.service.HapOrgCompanysService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hapOrgCompanysService")
public class HapOrgCompanysServiceImpl extends BaseServiceImpl<HapOrgCompanys> implements HapOrgCompanysService {
    
	@Autowired
	private HapOrgCompanysMapper hapOrgCompanysMapper;
	
	@Transactional
	public List<HapOrgCompanys> selectHapOrgCompanysList(IRequest requestContext,
			HapOrgCompanys hapOrgCompanys, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<HapOrgCompanys> HapOrgCompanysList=hapOrgCompanysMapper.selectHapOrgCompanysList(hapOrgCompanys);
		return HapOrgCompanysList;
	}


}
