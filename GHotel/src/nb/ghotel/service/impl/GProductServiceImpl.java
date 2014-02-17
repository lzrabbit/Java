package nb.ghotel.service.impl;

import java.util.*;

import org.apache.ibatis.session.SqlSession;

import nb.ghotel.dao.IGProductDao;
import nb.ghotel.domain.ServiceContext;
import nb.ghotel.domain.GProduct;
import nb.ghotel.service.IGProductService;
import nb.ghotel.util.DateUtil;

public class GProductServiceImpl implements IGProductService {

	@Override
	public void UpdateProduct(Date availableDate) {
		// TODO Auto-generated method stub

		SqlSession session = ServiceContext.getSqlSession();

		IGProductDao dao = session.getMapper(IGProductDao.class);
		List<GProduct> products = dao.getProductList(availableDate);
		for (int i = 0; i < products.size(); i++) {
			GProduct product = products.get(i);
			product.setRateCode(product.getRateCode() + "_" + i);
		}
		
		//for (GProduct product : products) {

		//}

		//dao.batchUpdate(products);
		session.close();
	}

	void BatchInsert(Date availableDate) {
		List<GProduct> list = new ArrayList<GProduct>();

		for (int i = 0; i < 100; i++) {
			GProduct entity = new GProduct();
			entity.setRateCode("rate" + i);
			entity.setAvailableDate(availableDate);
			entity.setRoomTypeCode("001");
			entity.setHotelId(99999);
			entity.setCurrentAllotment(101);
			entity.setSupplierType("E");
			entity.setBaseRate(1);
			entity.setRate(2);
			entity.setSurcharge(3);
			entity.setTotalRate(4);
			entity.setCommissionableUsdTotal(5);
			entity.setCreateTime(DateUtil.now());
			entity.setUpdateTime(DateUtil.now());
			entity.setRateType("XX");
			entity.setRemark("00");
			list.add(entity);
		}
		SqlSession session = ServiceContext.getSqlSession();

		IGProductDao dao = session.getMapper(IGProductDao.class);
		dao.batchInsert(list);
		session.close();
	}
}
