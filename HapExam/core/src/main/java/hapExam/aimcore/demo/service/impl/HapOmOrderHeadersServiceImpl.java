package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;
import hapExam.aimcore.demo.mapper.HapOmOrderHeadersMapper;
import hapExam.aimcore.demo.service.HapArCustomersService;
import hapExam.aimcore.demo.service.HapInvInventoryItemsService;
import hapExam.aimcore.demo.service.HapOmOrderHeadersService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hapOmOrderHeadersService")
public class HapOmOrderHeadersServiceImpl extends BaseServiceImpl<HapOmOrderHeaders> implements HapOmOrderHeadersService {
    
	@Autowired
	private HapOmOrderHeadersMapper hapOmOrderHeadersMapper;
	
	@Transactional
	public List<HapOmOrderHeaders> selectHapOmOrderHeadersList(IRequest requestContext,
			HapOmOrderHeaders hapOmOrderHeaders, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<HapOmOrderHeaders> hapOmOrderHeadersList=hapOmOrderHeadersMapper.selectHapOmOrderHeadersList(hapOmOrderHeaders);
		return hapOmOrderHeadersList;
	}

   

}
