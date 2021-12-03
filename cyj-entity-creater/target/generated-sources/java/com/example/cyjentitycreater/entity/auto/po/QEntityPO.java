package com.example.cyjentitycreater.entity.auto.po;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityPO is a Querydsl query type for EntityPO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityPO extends EntityPathBase<EntityPO> {

    private static final long serialVersionUID = -721571681L;

    public static final QEntityPO entityPO = new QEntityPO("entityPO");

    public final StringPath id = createString("id");

    public final StringPath pid = createString("pid");

    public final StringPath propertyCode = createString("propertyCode");

    public final StringPath propertyDataSource = createString("propertyDataSource");

    public final StringPath propertyDataSourceType = createString("propertyDataSourceType");

    public final StringPath propertyDefaultValue = createString("propertyDefaultValue");

    public final StringPath propertyDirection = createString("propertyDirection");

    public final StringPath propertyDisplay = createString("propertyDisplay");

    public final StringPath propertyLabel = createString("propertyLabel");

    public final StringPath propertyMode = createString("propertyMode");

    public final StringPath propertyRequired = createString("propertyRequired");

    public final StringPath propertyType = createString("propertyType");

    public final StringPath propertyWidth = createString("propertyWidth");

    public final StringPath sortCode = createString("sortCode");

    public QEntityPO(String variable) {
        super(EntityPO.class, forVariable(variable));
    }

    public QEntityPO(Path<? extends EntityPO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityPO(PathMetadata metadata) {
        super(EntityPO.class, metadata);
    }

}

