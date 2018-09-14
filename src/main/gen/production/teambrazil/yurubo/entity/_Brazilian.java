package teambrazil.yurubo.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.6.2" }, date = "2018-09-14T11:35:44.717+0900")
public final class _Brazilian extends org.seasar.doma.jdbc.entity.AbstractEntityType<teambrazil.yurubo.entity.Brazilian> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.6.2");
    }

    private static final _Brazilian __singleton = new _Brazilian();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, java.lang.Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(teambrazil.yurubo.entity.Brazilian.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "id", "", __namingType, false, __idGenerator);

    /** the loginUsername */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, java.lang.String, Object> $loginUsername = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(teambrazil.yurubo.entity.Brazilian.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "loginUsername", "login_username", __namingType, true, true, false);

    /** the passwordHash */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, java.lang.String, Object> $passwordHash = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(teambrazil.yurubo.entity.Brazilian.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "passwordHash", "password_hash", __namingType, true, true, false);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(teambrazil.yurubo.entity.Brazilian.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<teambrazil.yurubo.entity.Brazilian>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __entityPropertyTypeMap;

    private _Brazilian() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Brazilian";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($loginUsername);
        __map.put("loginUsername", $loginUsername);
        __list.add($passwordHash);
        __map.put("passwordHash", $passwordHash);
        __list.add($name);
        __map.put("name", $name);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PreInsertContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PreUpdateContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PreDeleteContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PostInsertContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PostUpdateContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(teambrazil.yurubo.entity.Brazilian entity, org.seasar.doma.jdbc.entity.PostDeleteContext<teambrazil.yurubo.entity.Brazilian> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<teambrazil.yurubo.entity.Brazilian, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, teambrazil.yurubo.entity.Brazilian, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public teambrazil.yurubo.entity.Brazilian newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<teambrazil.yurubo.entity.Brazilian, ?>> __args) {
        teambrazil.yurubo.entity.Brazilian entity = new teambrazil.yurubo.entity.Brazilian();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<teambrazil.yurubo.entity.Brazilian> getEntityClass() {
        return teambrazil.yurubo.entity.Brazilian.class;
    }

    @Override
    public teambrazil.yurubo.entity.Brazilian getOriginalStates(teambrazil.yurubo.entity.Brazilian __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(teambrazil.yurubo.entity.Brazilian __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Brazilian getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Brazilian newInstance() {
        return new _Brazilian();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<teambrazil.yurubo.entity.Brazilian> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
