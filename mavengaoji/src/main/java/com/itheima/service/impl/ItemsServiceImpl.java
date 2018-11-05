package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: java类作用描述
 * @Author: PengYi
 * @CreateDate: 2018/11/4$ 10:21$
 * @Version: 1.0
 */
@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    public Items findById(int id) {
        Items items = itemsDao.findById(id);
        return items;
    }
}
