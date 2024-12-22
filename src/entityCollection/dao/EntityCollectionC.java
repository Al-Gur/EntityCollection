package entityCollection.dao;

import entityCollection.model.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EntityCollectionC implements EntityCollection {
    private ArrayList<Entity> list;

    public EntityCollectionC() {
        list = new ArrayList<>();
    }

    // O(n)
    @Override
    public void add(Entity entity) {
        int index = Collections.binarySearch(list, entity, Comparator.comparingInt(Entity::getValue));
        if (index < 0) {
            list.add(-index - 1, entity);
        }
    }

    // O(1)
    @Override
    public Entity removeMaxValue() {
        return list.remove(list.size() - 1);
    }
}
