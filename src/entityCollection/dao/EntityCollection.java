package entityCollection.dao;

import entityCollection.model.Entity;

public interface EntityCollection {
    public void add(Entity entity);
    public Entity removeMaxValue();
}
