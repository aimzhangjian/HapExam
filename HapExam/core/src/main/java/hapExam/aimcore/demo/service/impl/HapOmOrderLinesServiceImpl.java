package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;
import hapExam.aimcore.demo.dto.HapOmOrderLines;
import hapExam.aimcore.demo.mapper.HapOmOrderHeadersMapper;
import hapExam.aimcore.demo.mapper.HapOmOrderLinesMapper;
import hapExam.aimcore.demo.service.HapArCustomersService;
import hapExam.aimcore.demo.service.HapInvInventoryItemsService;
import hapExam.aimcore.demo.service.HapOmOrderHeadersService;
import hapExam.aimcore.demo.service.HapOmOrderLinesService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hapOmOrderLinesService")
public class HapOmOrderLinesServiceImpl extends BaseServiceImpl<HapOmOrderLines> implements HapOmOrderLinesService {
    
	@Autowired
	private HapOmOrderLinesMapper hapOmOrderLinesMapper;
	
	@Transactional
	public List<HapOmOrderLines> selectHapOmOrderLinesList(IRequest requestContext,
			HapOmOrderLines hapOmOrderLines, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<HapOmOrderLines> HapOmOrderLinesList=hapOmOrderLinesMapper.selectHapOmOrderLinesList(hapOmOrderLines);
		return HapOmOrderLinesList;
	}


}
