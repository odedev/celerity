package dev.odes.celerity.common.model;

import dev.odes.celerity.common.entity.AbstractEntity;

import java.io.Serializable;
import java.util.Date;

public abstract class AbstractModel<E extends AbstractEntity> implements Model<E>, Serializable {
  private static final long serial = 1L;

  public abstract String getId();
  public abstract void setId(String id);

  // 在通用的保存中, 通过此三个字段是否有值判断数据的 增, 删, 改 类型, 没值则没操作
  // 取值顺序: deletedAt > updatedAt > createdAt
  private transient Date createdAt;
  private transient Date updatedAt;
  private transient Date deletedAt;

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Date getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Date deletedAt) {
    this.deletedAt = deletedAt;
  }
}
