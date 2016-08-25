package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.HapOmOrderLines;
import hapExam.aimcore.demo.dto.SalerOrder;


public interface HapOmOrderLinesMapper extends Mapper<HapOmOrderLines>{
/*    int deleteByPrimaryKey(Long lineId);

    int insert(HapOmOrderLines record);

    int insertSelective(HapOmOrderLines record);*/

    List<HapOmOrderLines> selectHapOmOrderLinesList(HapOmOrderLines hapOmOrderLines);

   /* int updateByPrimaryKeySelective(HapOmOrderLines record);

    int updateByPrimaryKey(HapOmOrderLines record);*/
}