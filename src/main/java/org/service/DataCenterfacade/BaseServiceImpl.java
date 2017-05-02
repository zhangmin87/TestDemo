package org.service.DataCenterfacade;

import com.infoccsp.framework.dao.entity.AuditableEntity;
import com.infoccsp.framework.service.AbstractServiceImpl;
import framework.dao.orm.hibernate.HibernateOrmExecution;
import org.common.PlainUserDetail;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * Created by zhongdepeng on 2017/4/28.
 * 使用公司一套封装好的东西
 */
public class BaseServiceImpl extends AbstractServiceImpl {

    @Resource(name = "oracleHibernateEntityManager")
    private HibernateOrmExecution entityManager;

    @Override
    protected HibernateOrmExecution getEntityManager() {
        return entityManager;
    }

    protected void registerAuditableEntityOnCreate(PlainUserDetail user, AuditableEntity auditableEntity) {
        if(auditableEntity != null) {
            Timestamp dbTime = this.getEntityManager().getDbCurrentTimestamp();
            auditableEntity.setCreateTime(dbTime);
            auditableEntity.setCreator(user.getUserId());
            auditableEntity.setModifyTime(dbTime);
            auditableEntity.setModifier(user.getUserId());
        }

    }

    protected void registerAuditableEntityOnUpdate(PlainUserDetail user, AuditableEntity auditableEntity) {
        if(auditableEntity != null) {
            Timestamp dbTime = this.getEntityManager().getDbCurrentTimestamp();
            auditableEntity.setModifyTime(dbTime);
            auditableEntity.setModifier(user.getUserId());
        }

    }
}
