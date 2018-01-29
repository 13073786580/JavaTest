package entity;

/**
 * Author：Edison Hou.
 * Date：2017/6/12 23:30
 * phone:17621373690
 */
public class Entity2 implements Cloneable {
    private String entityName2;
    private Entity entity;

    public String getEntityName2() {
        return entityName2;
    }

    public void setEntityName2(String entityName2) {
        this.entityName2 = entityName2;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Entity2(String entityName2) {
        this.entityName2 = entityName2;
        this.entity = new Entity("哈哈");
    }

    @Override
    public Entity2 clone() throws CloneNotSupportedException {
            return (Entity2) super.clone();
    }
}
