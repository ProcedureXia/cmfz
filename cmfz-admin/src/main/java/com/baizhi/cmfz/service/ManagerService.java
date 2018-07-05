package com.baizhi.cmfz.service;

import com.baizhi.cmfz.entity.Manager;
import org.springframework.stereotype.Service;

/**
 * Created by yx on 2018/7/4.
 */

public interface ManagerService {
    public Manager loginMgr(Manager manager);

    public boolean registMgr(Manager manager);
}
