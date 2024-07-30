package com.db.auto_trade.AutoTrade.Repository;

import com.db.auto_trade.AutoTrade.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {
}
