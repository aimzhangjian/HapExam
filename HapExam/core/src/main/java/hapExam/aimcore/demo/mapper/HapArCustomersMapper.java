package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.HapArCustomers;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;


public interface HapArCustomersMapper extends Mapper<HapArCustomers>{
    /*int deleteByPrimaryKey(Long customerId);

    int insert(HapArCustomers record);

    int insertSelective(HapArCustomers record);*/

    List<HapArCustomers> selectHapArCustomersList(HapArCustomers hapArCustomers);

    /*int updateByPrimaryKeySelective(HapArCustomers record);

    int updateByPrimaryKey(HapArCustomers record);*/
}