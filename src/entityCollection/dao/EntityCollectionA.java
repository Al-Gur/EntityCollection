package entityCollection.dao;

import entityCollection.model.Entity;

import java.util.HashSet;

public class EntityCollectionA implements EntityCollection {
    private HashSet<Entity> set;

    public EntityCollectionA() {
        set=new HashSet<>();
    }

    @Override
    public void add(Entity entity) {
        set.add(entity);
    }

    @Override
    public Entity removeMaxValue() {
        Entity res = null;
        for(Entity entity:set){
            if (res==null || entity.getValue()>res.getValue()){
                res=entity;
            }
        }
        return res;
    }
}
