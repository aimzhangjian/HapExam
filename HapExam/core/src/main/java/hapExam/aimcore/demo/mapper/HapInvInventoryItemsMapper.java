package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.HapInvInventoryItems;
import hapExam.aimcore.demo.dto.HapOmOrderHeaders;


public interface HapInvInventoryItemsMapper extends Mapper<HapInvInventoryItems>{
    /*int deleteByPrimaryKey(Long inventoryItemId);

    int insert(HapInvInventoryItems record);

    int insertSelective(HapInvInventoryItems record);*/

    public List<HapInvInventoryItems> selectHapInvInventoryItemsList(HapInvInventoryItems hapInvInventoryItems);

    /*int updateByPrimaryKeySelective(HapInvInventoryItems record);

    int updateByPrimaryKey(HapInvInventoryItems record);*/
}