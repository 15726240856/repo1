package com.itheima.dao;

import com.itheima.domain.Items;

/**
 * @Description: java类作用描述
 * @Author: PengYi
 * @CreateDate: 2018/11/4$ 10:17$
 * @Version: 1.0
 */

public interface ItemsDao {
    Items findById(int id);
}
