package avm.service;

import avm.products.MovieProduct;
import avm.repository.MovieRepository;
import avm.products.Client;

import java.sql.SQLException;

/**
 * AIT-TR, Cohort 42.1, Java Basic, Project AVM/Cinema
 * @author Rodion
 * @version May-2024
 */
public class CinemaService extends BaseService<MovieProduct, MovieRepository> {

    public CinemaService(Client client, MovieRepository movieRepository) throws SQLException {
        super(client, movieRepository);
    }

    @Override
    protected MovieProduct createProduct(MovieProduct product) {
        return new MovieProduct(product);
    }

    @Override
    protected void minusProductQuantity(int id, int quantity) {

    }

    @Override
    protected void plusProductQuantity(int id, int quantity) {

    }
}