package nb.ghotel.dao;

import java.util.Date;
import java.util.List;

import nb.ghotel.domain.GProduct;


public interface IGProductDao {
	List<GProduct> getProductList(Date availableDate);
	
	void insert(GProduct entity);
	
	void batchInsert(List<GProduct> entitys);
	
	void update(GProduct entity);
	
	void batchUpdate(List<GProduct> entitys);
}
