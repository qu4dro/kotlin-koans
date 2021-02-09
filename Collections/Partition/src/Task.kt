// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
    customers.filter { it ->
        val (delivered, undelivered) = it.orders.partition {
            it.isDelivered
        }
        delivered.size < undelivered.size
    }.toSet()
