package entityCollection.dao;

import entityCollection.model.Entity;

public interface EntityCollection {
    void add(Entity entity);

    Entity removeMaxValue();
}
