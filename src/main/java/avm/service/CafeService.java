package avm.service;

import avm.products.CafeProduct;
import avm.repository.CafeRepository;
import avm.products.Client;

import java.sql.SQLException;

/**
 * AIT-TR, cohort 42.1, Java Basic, Project AVM/Cafe
 * @author Alexander Germanow
 * @version Apr-2024
 */
public class CafeService extends BaseService<CafeProduct, CafeRepository> {

    public CafeService(Client client, CafeRepository cafeRepository) throws SQLException {
        super(client,cafeRepository);
    }

    @Override
    protected CafeProduct createProduct(CafeProduct product) {
        return new CafeProduct(product);
    }

}