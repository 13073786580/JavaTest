package entity;

/**
 * 测试通用实体类
 * Author：Edison Hou.
 * Date：2017/6/12 23:04
 * phone:17621373690
 */
public class Entity {

    /**
     * 实体类名
     */
    private String entityName;

    /**
     *
     * @return
     */
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    /**
     * 构造器
     * @param entityName
     */
    public Entity(String entityName) {
        this.entityName = entityName;
    }

    public Entity() {
    }

    @Override
    public String toString() {
        return "Entity{" +
                "entityName='" + entityName + '\'' +
                '}';
    }
}
