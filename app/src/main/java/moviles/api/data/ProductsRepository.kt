package moviles.api.data

import moviles.api.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductsList(): Flow<Result<List<Product>>>
}