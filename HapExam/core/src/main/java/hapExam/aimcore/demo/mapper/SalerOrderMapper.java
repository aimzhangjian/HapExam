package hapExam.aimcore.demo.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.aimcore.demo.dto.Demo;
import hapExam.aimcore.demo.dto.SalerOrder;

/**
 * Created by hailor on 16/6/2.
 */
public interface SalerOrderMapper extends Mapper<SalerOrder> {
	public List<SalerOrder> getSalerOrderList(SalerOrder salerOrder);

	public List<SalerOrder> getSalerOrderDetailList(SalerOrder salerOrder);

	public int updateSalerOrderDetail(SalerOrder salerOrder);

	public int getNewId();

	public int getNewheadersId();

	public int saveSalerOrderDetail(SalerOrder salerOrder);

	public int saveSalerOrder(SalerOrder salerOrder);
}
