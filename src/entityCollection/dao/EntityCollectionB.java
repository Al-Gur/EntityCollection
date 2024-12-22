package entityCollection.dao;

import entityCollection.model.Entity;

import java.util.Comparator;
import java.util.TreeSet;

public class EntityCollectionB implements EntityCollection {
    private TreeSet<Entity> set;

    public EntityCollectionB() {
        set = new TreeSet<>(Comparator.comparingInt(Entity::getValue));
    }

    // O(log n)
    @Override
    public void add(Entity entity) {
        set.add(entity);
    }

    // O(log n)
    @Override
    public Entity removeMaxValue() {
        return set.pollLast();
    }
}
