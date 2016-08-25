package hapExam.aimcore.demo.service.impl;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.mapper.HapArCustomersMapper;
import hapExam.aimcore.demo.service.HapArCustomersService;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hapArCustomersService")
public class HapArCustomersServiceImpl extends BaseServiceImpl<HapArCustomers> implements HapArCustomersService {
    
	@Autowired
	private HapArCustomersMapper hapArCustomersMapper;
	
	@Transactional
	public List<HapArCustomers> selectHapArCustomersList(IRequest requestContext,
			HapArCustomers hapArCustomers, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		List<HapArCustomers> HapArCustomersList=hapArCustomersMapper.selectHapArCustomersList(hapArCustomers);
		return HapArCustomersList;
	}

}
