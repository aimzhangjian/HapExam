package hapExam.aimcore.demo.service;

import hapExam.aimcore.demo.dto.Demo;
import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;
import hapExam.aimcore.demo.dto.SalerOrder;

import com.hand.hap.system.service.IBaseService;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.IRequest;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 */
public interface HapOmOrderHeadersService extends IBaseService<HapOmOrderHeaders>, ProxySelf<HapOmOrderHeadersService> {

	public List<HapOmOrderHeaders> selectHapOmOrderHeadersList(IRequest requestContext,HapOmOrderHeaders hapOmOrderHeaders,int page,int pagesize);

}
