package entityCollection.dao;

import entityCollection.model.Entity;

import java.util.HashMap;

public class EntityCollectionA implements EntityCollection {
    private HashMap<Integer, Entity> map;

    public EntityCollectionA() {
        map = new HashMap<>();
    }

    // O(1)
    @Override
    public void add(Entity entity) {
        map.putIfAbsent(entity.getValue(), entity);
    }

    // O(n)
    @Override
    public Entity removeMaxValue() {
        int maxValue = Integer.MIN_VALUE;
        for (Integer key : map.keySet()) {
            if (key > maxValue) {
                maxValue = key;
            }
        }
        return map.remove(maxValue);
    }
}
