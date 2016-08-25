package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.HapOrgCompanys;
import hapExam.aimcore.demo.dto.SalerOrder;


public interface HapOrgCompanysMapper extends Mapper<HapOrgCompanys>{
  /*  int deleteByPrimaryKey(Long companyId);

    int insert(HapOrgCompanys record);

    int insertSelective(HapOrgCompanys record);*/

    List<HapOrgCompanys> selectHapOrgCompanysList(HapOrgCompanys hapOrgCompanys);

    /*int updateByPrimaryKeySelective(HapOrgCompanys record);

    int updateByPrimaryKey(HapOrgCompanys record);*/
}