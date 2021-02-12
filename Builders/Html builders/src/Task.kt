fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            products.forEachIndexed { i, product ->
                tr (color = getCellColor(i)){
                    td { this.text(product.description) }
                    td { this.text(product.price) }
                    td { this.text(product.popularity) }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(i: Int) = if (i % 2 == 0) "#dce4ff" else "#eff2ff"
