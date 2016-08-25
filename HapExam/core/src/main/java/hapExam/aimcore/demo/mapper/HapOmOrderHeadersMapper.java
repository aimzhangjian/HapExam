package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.HapOmOrderHeaders;
import hapExam.aimcore.demo.dto.HapOmOrderLines;


public interface HapOmOrderHeadersMapper extends Mapper<HapOmOrderHeaders>{
    /*int deleteByPrimaryKey(Long headerId);

    int insert(HapOmOrderHeaders record);

    int insertSelective(HapOmOrderHeaders record);*/

    List<HapOmOrderHeaders> selectHapOmOrderHeadersList(HapOmOrderHeaders hapOmOrderHeaders);

    /*int updateByPrimaryKeySelective(HapOmOrderHeaders record);

    int updateByPrimaryKey(HapOmOrderHeaders record);*/
}