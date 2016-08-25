package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.mapper.HapInvInventoryItemsMapper;
import hapExam.aimcore.demo.service.HapArCustomersService;
import hapExam.aimcore.demo.service.HapInvInventoryItemsService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hapInvInventoryItemsService")
public class HapInvInventoryItemsServiceImpl extends BaseServiceImpl<HapInvInventoryItems> implements HapInvInventoryItemsService {
    
	@Autowired
	private HapInvInventoryItemsMapper hapInvInventoryItemsMapper;
	
	@Transactional
	public List<HapInvInventoryItems> selectHapInvInventoryItemsList(IRequest requestContext,
			HapInvInventoryItems hapInvInventoryItems, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<HapInvInventoryItems> HapInvInventoryItemsList=hapInvInventoryItemsMapper.selectHapInvInventoryItemsList(hapInvInventoryItems);
		return HapInvInventoryItemsList;
	}



}
