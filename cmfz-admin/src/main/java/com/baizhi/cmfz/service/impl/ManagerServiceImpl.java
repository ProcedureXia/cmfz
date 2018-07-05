package com.baizhi.cmfz.service.impl;


import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.baizhi.cmfz.util.EncryptionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yx on 2018/7/4.
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Resource
    private ManagerDao managerDao;
    @Override
    public Manager loginMgr(Manager manager) {
       Manager mgr =  managerDao.selectMgrByName(manager.getMgrName());
       if(mgr!=null && mgr.getMgrStatus().equals("1")){
           String salt = mgr.getSalt();
           String pwd = EncryptionUtils.encryption(mgr.getMgrPassword()+ salt);
           if(mgr.getMgrPassword().equals(pwd)){
               return mgr;
           }
       }
        return null;
    }

    @Override
    public boolean registMgr(Manager manager) {
        boolean flag = false;
        //加密
       manager.setMgrPassword(EncryptionUtils.encryption(manager.getMgrPassword()+manager.getSalt()));

        if(managerDao.insertMgr(manager)>0){
            flag = true;
        }
        return flag;
    }


}
