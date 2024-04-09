package moviles.api.data.model

import moviles.api.data.model.Product


data class Products(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)
