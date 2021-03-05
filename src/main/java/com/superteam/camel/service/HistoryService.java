package com.superteam.camel.service;

import com.superteam.camel.command.Item;
import com.superteam.camel.command.ListCommand;
import com.superteam.camel.model.PriceHistory;
import com.superteam.camel.model.Product;
import com.superteam.camel.repository.IHistoryRepository;
import com.superteam.camel.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.sql.Timestamp;

@Service
public class HistoryService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm");
    @Autowired
    IHistoryRepository historyRepo;

    @Autowired
    IProductRepository productRepo;

    public void updateList(ListCommand list) {
        String date = sdf.format(new Timestamp(System.currentTimeMillis()));

        for (Item i:list.getList()) {
            PriceHistory elem = historyRepo.findProductByProductId(i.getId());
            if (elem != null) {
                elem.getHistory().put(date,i.getPrice());
            }
            else {
                Product p = Product.builder().name(i.getPrice()).name(i.getName()).ref(i.getId()).build();
                productRepo.save(p);
                HashMap map = new HashMap<String,String>();
                map.put(date,i.getPrice());
                elem = PriceHistory.builder()
                    .productId(i.getId())
                    .history(map)
                    .build();
            }
            historyRepo.save(elem);
        }
    }
}
