package com.baizhi.cmfz.dao;

import com.baizhi.cmfz.entity.Manager;

/**
 * Created by yx on 2018/7/4.
 */
public interface ManagerDao {
    public Manager selectMgrByName(String mgrName);

    public int insertMgr(Manager manager);
}
