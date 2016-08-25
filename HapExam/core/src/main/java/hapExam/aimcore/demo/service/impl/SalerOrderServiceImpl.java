package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.Demo;
import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.SalerOrder;
import hapExam.aimcore.demo.mapper.HapArCustomersMapper;
import hapExam.aimcore.demo.mapper.HapInvInventoryItemsMapper;
import hapExam.aimcore.demo.mapper.SalerOrderMapper;
import hapExam.aimcore.demo.service.SalerOrderService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("salerOrderService")
public class SalerOrderServiceImpl extends BaseServiceImpl<SalerOrder>
		implements SalerOrderService {

	@Autowired
	private SalerOrderMapper salerOrderMapper;

	@Autowired
	private HapInvInventoryItemsMapper hapInvInventoryItemsMapper;

	@Transactional
	public List<SalerOrder> getSalerOrderList(IRequest requestContext,
			SalerOrder salerOrder, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<SalerOrder> salerOrderList = salerOrderMapper
				.getSalerOrderList(salerOrder);

		
		return salerOrderList;
	}

	@Override
	public List<SalerOrder> getSalerOrderDetailList(IRequest requestContext,
			SalerOrder salerOrder, int page, int pagesize) {

		List<SalerOrder> salerOrderList = salerOrderMapper
				.getSalerOrderDetailList(salerOrder);
		
		return salerOrderList;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<SalerOrder> batchUpdate(IRequest requestContext,
			List<SalerOrder> salerOrderList) {
		// TODO Auto-generated method stub
		for (SalerOrder salerOrder : salerOrderList) {
			if (salerOrder.get__status() != null) {
				switch (salerOrder.get__status()) {
				case DTOStatus.ADD:
					HapInvInventoryItems hapInvInventoryItems = new HapInvInventoryItems();
					hapInvInventoryItems.setInventory_item_id(salerOrder
							.getInventory_item_id());
					HapInvInventoryItems hapInvInventoryItems1 = hapInvInventoryItemsMapper
							.selectHapInvInventoryItemsList(
									hapInvInventoryItems).get(0);
					salerOrder.setOrder_quantity_uom(hapInvInventoryItems1
							.getItemUom());
					int num = salerOrderMapper.getNewId();
					salerOrder.setLine_id((long) (num + 1));
					salerOrder.setLine_number((long) (num + 1));
					salerOrderMapper.saveSalerOrderDetail(salerOrder);
					break;
				case DTOStatus.UPDATE:
					salerOrderMapper.updateSalerOrderDetail(salerOrder);
					break;
				case DTOStatus.DELETE:

					break;
				default:
					break;
				}
			}

		}
		return salerOrderList;
	}

	@Override
	public void insertHead(IRequest requestContext,SalerOrder salerOrder) {
		salerOrder.setHeader_id((long) (salerOrderMapper.getNewheadersId()+1));
		salerOrderMapper.saveSalerOrder(salerOrder);
    }

}
