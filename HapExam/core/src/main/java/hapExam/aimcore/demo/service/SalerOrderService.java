package hapExam.aimcore.demo.service;

import hapExam.aimcore.demo.dto.Demo;
import hapExam.aimcore.demo.dto.SalerOrder;

import com.hand.hap.system.service.IBaseService;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.IRequest;
import com.hand.hap.core.annotation.StdWho;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 */
public interface SalerOrderService extends IBaseService<SalerOrder>, ProxySelf<SalerOrderService> {

	public List<SalerOrder> getSalerOrderList(IRequest requestContext,SalerOrder salerOrder,int page,int pagesize);
	public List<SalerOrder> getSalerOrderDetailList(IRequest requestContext,SalerOrder salerOrder,int page,int pagesize);
	public List<SalerOrder> batchUpdate(IRequest requestContext, @StdWho List<SalerOrder> salerOrderList);
	public void insertHead(IRequest requestContext, SalerOrder salerOrderList);
}
