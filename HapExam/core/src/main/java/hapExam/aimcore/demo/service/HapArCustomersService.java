package hapExam.aimcore.demo.service;

import hapExam.aimcore.demo.dto.Demo;
import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.SalerOrder;

import com.hand.hap.system.service.IBaseService;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.IRequest;

import java.util.List;

/**
 * Created by hailor on 16/6/2.
 */
public interface HapArCustomersService extends IBaseService<HapArCustomers>, ProxySelf<HapArCustomersService> {

	public List<HapArCustomers> selectHapArCustomersList(IRequest requestContext,HapArCustomers hapArCustomers,int page,int pagesize);
}
